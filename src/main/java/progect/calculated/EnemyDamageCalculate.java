package progect.calculated;

import progect.damage.Damage;
import progect.damage.DamageList;
import progect.enemy.*;

public class EnemyDamageCalculate extends DamageCalculator{
    private EnemyLifeCondition enemyLifeCondition;
    private DamageList damageList;

    public EnemyDamageCalculate() {
    }


    public static DamageList calculateEnemyDamage(EnemyLifeCondition life, DamageList attackDamageList){
        DamageList damageList = new DamageList();
        Health health = life.getHealth();
        Armor armor = life.getArmor();
        Shield shield = life.getShield();
        attackDamageList = calculateDamagePercent(attackDamageList);
        for (Damage d : attackDamageList) {damageList.add(new Damage(d));}

        if (damageList.getDamageSum() > 0){
            if (shield != null && shield.getHitPoint() > 0){
                //damageList = calculateDamagePercent(damageList);
                for (Damage d: damageList) {
                    System.out.println("DPercent " + d.getDamagePercent()+ " " + d.getAmountDamage());
                }
                damageList = calculateWeakResDamage(attackDamageList, shield.getWeaknessResistanceList());

                System.out.println("WeakRes DL");
                for (Damage d: damageList) {
                    System.out.println(d.getAmountDamage() + " " + d.getDamageType().name() + " " + d.getDamagePercent());
                }
                damageList = calculateTakeDamage(damageList, shield);
                System.out.println("DL after attack");
                for (Damage d: damageList) {
                    System.out.println(d.getAmountDamage() + " " + d.getDamageType().name() + " " + d.getDamagePercent());
                }

//            for (Damage d: damageList) {
//                shield.takeDamage(d.getAmountDamage());
//            }

                System.out.println("Shield HP " + shield.getHitPoint());
        }else {
                if (damageList.getDamageSum() > 0){
                    if(health != null && health.getHitPoint() > 0){
                        if(armor != null && armor.getHitPoint() > 0){
//                            damageList
                        }


                    }
                }


        }

        }
        return damageList;

    }
    public static DamageList calculateTakeDamage(DamageList damageList, HitPoint hitPoint){
        DamageList damages = new DamageList();
        double damageSum = damageList.getDamageSum();
        double hp = hitPoint.getHitPoint();


        double amountDamage;
        for (Damage d : damageList){
            System.out.println(d.getDamagePercent());
            damages.add(new Damage(d));
        }
        System.out.println("DL in takeDamage");
        for (Damage d: damages) {
            System.out.println(d.getAmountDamage() + " " + d.getDamageType().name() + " " + d.getDamagePercent());
        }
        if (damageSum > 0 && hp > 0){
            if (hp >= damageSum){
                hitPoint.setHitPoint(hp - damageSum);
                for (Damage d : damages) {d.setAmountDamage(0);}
            } else{
                damageSum -= hp;
                hitPoint.setHitPoint(0);
                if (damageSum > 0){
                    for (Damage d : damages) {
                        d.setAmountDamage(damageSum * d.getDamagePercent());
                    }
                }else for (Damage d : damages) d.setAmountDamage(0);
            }
        }
        return damages;
    }

   /* public void calculateTakeDamage(DamageList damages, HitPoint hitPoint){

        double hp = hitPoint.getHitPoint();
        double amountDamage;
        double damageSum = damages.getDamageSum();
        if (damageSum > 0 || hp > 0){
            if (hp >= damageSum){
                hitPoint.setHitPoint(hp - damageSum);
                for (Damage d : damages) {d.setAmountDamage(0);}
            } else{
                int sizeDamageList = damages.size();
                double distributeHP = hp / sizeDamageList;
                while (hp > 0 ){
                    double resultDamage;
                    double resultHP = 0;
                    for (Damage d: damages) {
                        if(d.getAmountDamage() > 0){
                            amountDamage = d.getAmountDamage();

                            resultDamage = amountDamage - distributeHP;
                            resultHP = distributeHP - amountDamage;

                            amountDamage = resultDamage;
                            if (resultDamage <= 0){
                                sizeDamageList--;
                                resultDamage = 0;
                                amountDamage = 0;
                            }
                            d.setAmountDamage(amountDamage);

                            if (resultHP >= 0) {
                                amountDamage = 0;
                                sizeDamageList--;
                                d.setAmountDamage(amountDamage);

                            }
                        }
                        distributeHP += resultHP;
                    }


                }
            }
        }
    }
*/

    public EnemyLifeCondition getEnemyLifeCondition() {
        return enemyLifeCondition;
    }

    public void setEnemyLifeCondition(EnemyLifeCondition enemyLifeCondition) {
        this.enemyLifeCondition = enemyLifeCondition;
    }


}
