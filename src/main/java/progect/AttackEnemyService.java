package progect;

import progect.calculated.DamageCalculator;
import progect.calculated.EnemyDamageCalculate;
import progect.damage.DamageList;
import progect.enemy.Enemy;
import progect.enemy.EnemyLifeCondition;
import progect.weapon.PrimaryWeapon;
import progect.weapon.Weapon;
import progect.weapon.attacks.Attack;
import progect.weapon.attacks.PrimaryAttack;

public class AttackEnemyService {
    Enemy enemy;
    Weapon weapon;

    public AttackEnemyService() {
    }

    public AttackEnemyService(Enemy enemy, Weapon weapon) {
        this.enemy = enemy;
        this.weapon = weapon;
    }

    public void doAttackPrimary(){
        PrimaryWeapon primaryWeapon = (PrimaryWeapon) weapon;
        PrimaryAttack weaponAttack = (PrimaryAttack) primaryWeapon.attack();
        DamageList attackDamageList = weaponAttack.getAttackDamageList();
        EnemyLifeCondition enemyLifeCondition = enemy.getEnemyLifeBar();
        double multiShot = DamageCalculator.calculateMult(weaponAttack.getMultiShot());
        for (int i = 0; i < multiShot; i++) {
            EnemyDamageCalculate.calculateEnemyDamage(enemyLifeCondition, attackDamageList);
        }
    }




}
