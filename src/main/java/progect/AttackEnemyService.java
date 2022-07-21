package progect;

import progect.calculated.DamageCalculator;
import progect.calculated.EnemyDamageCalculate;
import progect.damage.DamageList;
import progect.enemy.Enemy;
import progect.enemy.EnemyLifeCondition;
import progect.weapon.*;
import progect.weapon.attacks.Attack;
import progect.weapon.attacks.PrimaryAttack;

import java.util.LinkedList;

public class AttackEnemyService {
    private Enemy enemy;
    private Attack attack;
    private Weapon weapon;
    private LinkedList<DamageList> damageInformation;


    public AttackEnemyService() {
    }

    public AttackEnemyService(Enemy enemy, Weapon weapon) {
        this.enemy = enemy;
        this.weapon = weapon;

    }

    public AttackEnemyService(Enemy enemy, Attack attack) {
        this.enemy = enemy;
        this.attack = attack;
    }




    public void takeAttack(){

        double critChance = this.attack.getAttackCritChance();
        double critMult = this.attack.getAttackCritMulti();
        double statusChance = this.attack.getAttackStatusChance();


        if (this.attack instanceof PrimaryAttack){
            //PrimaryWeapon primaryWeapon = (PrimaryWeapon) weapon;
            PrimaryAttack primaryAttack = (PrimaryAttack) this.attack;

            DamageList attackDamageList = primaryAttack.getAttackDamageList();
            EnemyLifeCondition enemyLifeCondition = enemy.getEnemyLifeBar();

            //attackDamageList = DamageCalculator.calculateCriticalDamageList(attackDamageList,critChance, critMult);

            int multiShot = DamageCalculator.calculateMult(primaryAttack.getMultiShot());
            for (int i = 0; i < multiShot; i++) {
                DamageList bufferDamages = new DamageList(
                        DamageCalculator.calculateCriticalDamageList(attackDamageList,critChance, critMult)
                );
                EnemyDamageCalculate.calculateEnemyDamage(enemyLifeCondition, bufferDamages);
            }

        }



    }




}
