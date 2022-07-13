package progect;

import progect.damage.Damage;
import progect.damage.DamageList;
import progect.enemy.Armor;
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

    public static DamageList calculateDamageAfterResist(DamageList dList, double resist){
        DamageList damages = new DamageList();
        for (Damage d: dList) {
            Damage damage = new Damage(d.getAmountDamage() * resist, d.getDamageType());
            damage.setAmountDamage(d.getAmountDamage() - damage.getAmountDamage());
            damages.add(damage);
        }
        return damages;
    }

    public static double calculateCritMult(double critChance, double critMult){
        double cMult = critMult;

        cMult = cMult * calculateMult(critChance);

        return cMult;
    }

    public static int calculateMult(double chance){
        double chBuf = chance;
        int res = 0;
        double rand = Math.random() * 100;

        while (chBuf >= 1) {
            res += 1;
            chBuf -= 1;
        }
        if (rand <= chBuf * 100) res += 1;

        return  res;
    }


    public static DamageList calculateCriticalDamageList(DamageList damageList, double critChance, double critMult){
        double cMult = 1;
        DamageList dList = damageList;

        cMult = calculateCritMult(critChance, critMult);

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


    public static double calculateArmorResist(Armor armor){
        double resist;
        double hpArmor = armor.getHitPoint();
        resist = hpArmor/(hpArmor + 300);
        return resist;
    }

//    public static double calculateDamageByArmor(Armor armor, Damage damage){
//        double arm = armor.getHitPoint();
//        arm = arm * ()
//        return
//    }
    
    public static DamageList calculateDamageAfterArmResist(DamageList damages, Armor armor){
        DamageList damageList = new DamageList(damages);
        double resist;
        resist = calculateArmorResist(armor);
        damageList = calculateWeaknessResistance(damageList,armor.getWeaknessDamageList(),armor.getResistanceDamageList());
        System.out.println("Weakness Resist");
        for (Damage d: damageList) {
            System.out.println(d.getAmountDamage());
        }

        damageList = calculateDamageAfterResist(damageList, resist);


        return damageList;
    }

    public static DamageList calculateDamageByHitPoint(HitPoint hitPoint, Attack attack){
        DamageList damages = calculateCriticalDamageList(attack.getAttackDamageList(),
                attack.getAttackCritChance(),attack.getAttackCritMulti());
        HitPoint hp = hitPoint;
        if (hitPoint instanceof Health) {
            if ((((Health)hitPoint).getArmor() == null) || (((Health)hitPoint).getArmor().getHitPoint() == 0)){
                damages = calculateWeaknessResistance(damages, hitPoint.getWeaknessDamageList(), hitPoint.getResistanceDamageList());

            }else {
                Armor armor = ((Health) hitPoint).getArmor();
                damages = calculateWeaknessResistance(damages, armor.getWeaknessDamageList(), armor.getResistanceDamageList());


            }
        }
        return damages;
    }
}
