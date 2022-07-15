package progect.calculated;

import progect.damage.Damage;
import progect.damage.DamageList;
import progect.enemy.Armor;
import progect.enemy.HitPoint;

public class DamageCalculator {

    public static DamageList multiplyDamageList(DamageList dList, double mult){
//        DamageList damages = dList;
//        for (int i = 0; i < damages.size(); i++) {
//            damages.get(i).setAmountDamage(damages.get(i).getAmountDamage() * mult);
//        }
        DamageList damages = new DamageList();
        for (Damage d: dList) {
            Damage damage = new Damage(d.getAmountDamage() * mult, d.getDamageType());
            damages.add(damage);
            
        }
        
        return damages;
    }

    /*public static DamageList calculateDamageAfterResist(DamageList dList, double resist){
        DamageList damages = new DamageList();
        for (Damage d: dList) {
            Damage damage = new Damage(d.getAmountDamage() * resist, d.getDamageType());
            damage.setAmountDamage(d.getAmountDamage() - damage.getAmountDamage());
            damages.add(damage);
        }
        return damages;
    }*/

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



    public static double calculateArmorResist(double hpArmor){
        return hpArmor/(hpArmor + 300);
    }



    public static DamageList calculateWeakResDamage(DamageList attackList, DamageList weakResDL) {
        DamageList damages = new DamageList();

        for (int i = 0; i < attackList.size(); i++) {
            damages.add(new Damage(attackList.get(i).getAmountDamage(), attackList.get(i).getDamageType()));
            for (int j = 0; j < weakResDL.size(); j++) {
                if (damages.get(i).getDamageType() == weakResDL.get(j).getDamageType()) {
                    System.out.println("DamageType = " + weakResDL.get(j).getDamageType());
                    damages.get(i).setAmountDamage(
                            damages.get(i).getAmountDamage() * (1 - weakResDL.get(j).getAmountDamage())
                    );
                    System.out.println("Damage = " + damages.get(i).getAmountDamage());
                }
            }
        }
        return damages;
    }
    public static DamageList calculateShieldDamage(DamageList attackList, HitPoint hitPoint) {
        DamageList damages = new DamageList();
        DamageList weakResDL = hitPoint.getWeaknessResistanceList();

        for (int i = 0; i < attackList.size(); i++) {
            damages.add(new Damage(attackList.get(i).getAmountDamage(), attackList.get(i).getDamageType()));
            System.out.println(damages.get(i).getAmountDamage() + "+++");
            for (int j = 0; j < hitPoint.getWeaknessResistanceList().size(); j++) {
                if (damages.get(i).getDamageType() == weakResDL.get(j).getDamageType()) {
                    System.out.println("DamageType = " + weakResDL.get(j).getDamageType());
                    damages.get(i).setAmountDamage(
                            damages.get(i).getAmountDamage() * (1 - weakResDL.get(j).getAmountDamage())
                    );
                    System.out.println("Damage = " + damages.get(i).getAmountDamage());
                }
            }
        }
        return damages;
    }


    public static DamageList calculateArmoredWeakResDamage(DamageList attackList, DamageList weakResDL, double armorHP){
        DamageList damages = new DamageList();

        for (int i = 0; i < attackList.size(); i++) {
            damages.add(new Damage(attackList.get(i).getAmountDamage(), attackList.get(i).getDamageType()));
            for (int j = 0; j < weakResDL.size(); j++){
                if (damages.get(i).getDamageType() == weakResDL.get(j).getDamageType()){
                    System.out.println("DamageType = " + weakResDL.get(j).getDamageType());
                    //double damage = damages.get(i).getAmountDamage();
                    double weakness = weakResDL.get(j).getAmountDamage();
                    double armHP = armorHP;
                    armHP = armHP * (1 + weakness);
                    System.out.println("ArmHP = " + armHP);
                    double resist = calculateArmorResist(armHP);
                    System.out.println("Resist = " + resist);

                    damages.get(i).setAmountDamage(damages.get(i).getAmountDamage() * (1 - resist));
                    System.out.println("Damage = " + damages.get(i).getAmountDamage());
                }
            }
        }
        return damages;
    }

}