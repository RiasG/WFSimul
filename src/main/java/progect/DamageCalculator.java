package progect;

import progect.damage.Damage;
import progect.damage.DamageList;
import progect.enemy.Armor;
import progect.enemy.HitPoint;
import progect.weapon.attacks.Attack;

import java.util.LinkedList;
import java.util.List;

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
    public static DamageList calculateCriticalDamageList(DamageList damageList, double critChance, double critMult){
        double cMult = 1;
        DamageList dList = damageList;

        cMult = calculateCritDamage(critChance, critMult);

        if (cMult > 1){
            dList = multiplyDamageList(damageList, cMult);
        }

        return dList;
    }

    public static DamageList calculateWeaknessResistance(DamageList attackList, DamageList weaknessDL, DamageList resistanceDL){
        DamageList damages = new DamageList(attackList);

        for (int i = 0; i < damages.size(); i++) {
            for (int j = 0; j < weaknessDL.size(); j++){
                if (damages.get(i).getDamageType() == weaknessDL.get(j).getDamageType()){
                    damages.get(i).setAmountDamage(damages.get(i).getAmountDamage() * (weaknessDL.get(j).getAmountDamage() + 1));
                }
            }

            for (int j = 0; j < resistanceDL.size(); j++){
                if (damages.get(i).getDamageType() == resistanceDL.get(j).getDamageType()){
                    damages.get(i).setAmountDamage(damages.get(i).getAmountDamage() * (resistanceDL.get(j).getAmountDamage()));
                }
            }
        }

        return damages;
    }

    public static void calculateDamageByHitPoint(HitPoint hitPoint, Attack attack){
        DamageList damages = calculateCriticalDamageList(attack.getAttackDamageList(),
                attack.getAttackCritChance(),attack.getAttackCritMulti());
        if (!(hitPoint instanceof Armor)){
            damages = calculateWeaknessResistance(damages, hitPoint.getWeaknessDamageList(), hitPoint.getResistanceDamageList());
            for (int i = 0; i < damages.size(); i++)
                hitPoint.takeDamage(damages.get(i).getAmountDamage());
        }


    }

}
