package progect.calculated;

import progect.damage.Damage;
import progect.damage.DamageList;
import progect.enemy.*;
import progect.weapon.Weapon;
import progect.weapon.attacks.Attack;

public class EnemyDamageCalculate extends DamageCalculator{


    public static void calculateDamageForEnemy(EnemyLifeCondition life, Attack attack){
        DamageList damages;
        Health health = life.getHealth();
        Armor armor = life.getArmor();
        Shield shield = life.getShield();

        damages = calculateCriticalDamageList(attack.getAttackDamageList(),attack.getAttackCritChance(),attack.getAttackCritMulti());

        for (Damage d: damages) {
            System.out.println(d.getAmountDamage() + " " + d.getDamageType().name());
        }


        if (shield != null && shield.getHitPoint() != 0){

            damages = calculateShieldDamage(damages,shield);

            for (Damage d: damages) {
                System.out.println(d.getAmountDamage() + " " + d.getDamageType().name());
            }


            for (Damage d: damages) {
                shield.takeDamage(d.getAmountDamage());
            }

            System.out.println("Shield HP " + shield.getHitPoint());

        }
    }
}
