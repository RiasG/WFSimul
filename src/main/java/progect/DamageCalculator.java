package progect;

import progect.damage.Damage;
import progect.damage.DamageList;
import progect.enemy.Armor;
import progect.enemy.Enemy;
import progect.enemy.Health;
import progect.enemy.HitPoint;
import progect.weapon.attacks.Attack;

public class DamageCalculator {

    public static DamageList multiplyDamageList(DamageList dList, double mult){
        DamageList damages = new DamageList();
        for (Damage d: dList) {
            Damage damage = new Damage(d.getAmountDamage() * mult, d.getDamageType());
            damages.add(damage);
        }
        return damages;
    }

    public static double calculateCritDamage(double critChance, double critMult){
        double cMult = 1;
        double rand = Math.random() * 100;

        if (Math.floor(critChance) >= 1) {
            cMult = critMult * Math.floor(critChance);
            critChance = (critChance - (Math.floor(critChance))) * 100;
            if (rand <= critChance) cMult += critMult;
        }else{
            critChance = critChance * 100;
            if (rand <= critChance) cMult *= critMult;
        }

        //TODO изменить
//        while (rand != 0)

        return cMult;
    }
    public static DamageList calculateDamageList(DamageList damageList, double critChance, double critMult){
        double cMult = 1;
        DamageList dList = damageList;

        cMult = calculateCritDamage(critChance, critMult);

        if (cMult > 1){
            dList = multiplyDamageList(damageList, cMult);
        }

        return dList;
    }

    public static void calculateWeaknessResistance(DamageList attackDL, DamageList weaknessDL, DamageList resistanceDL){
        for (int i = 0; i < attackDL.size(); i++) {
            for (int j = 0; j < weaknessDL.size(); j++){
                if (attackDL.get(i).getDamageType() == weaknessDL.get(j).getDamageType()){
                    attackDL.get(i).setAmountDamage(attackDL.get(i).getAmountDamage() * (weaknessDL.get(j).getAmountDamage() + 1));
                }
            }
        }

        for (int i = 0; i < attackDL.size(); i++) {
            for (int j = 0; j < resistanceDL.size(); j++){
                if (attackDL.get(i).getDamageType() == resistanceDL.get(j).getDamageType()){
                    attackDL.get(i).setAmountDamage(attackDL.get(i).getAmountDamage() * (resistanceDL.get(j).getAmountDamage()));
                }
            }
        }
    }

    public static void calculateDamageOnHitPoint(HitPoint hitPoint, Attack attack){
        DamageList criticalDamageList = calculateDamageList(attack.getAttackDamageList(),
                attack.getAttackCritChance(),attack.getAttackCritMulti());
        if (!(hitPoint instanceof Armor)){
            DamageList resists = hitPoint.getResistanceDamageList();

        }

    }

}
