package progect.calculated;

import progect.damage.Damage;
import progect.damage.DamageList;
import progect.enemy.Armor;
import progect.enemy.Health;

public class DamageCalculator {

    public static DamageList multiplyDamageList(DamageList dList, double mult){
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


    public static double calculateArmorResist(Armor armor){
        double resist;
        double hpArmor = armor.getHitPoint();
        resist = hpArmor/(hpArmor + 300);
        return resist;
    }

    public static double calculateArmorResist(double hpArmor){
        return hpArmor/(hpArmor + 300);
    }

//    public static double calculateDamageByArmor(Armor armor, Damage damage){
//        double arm = armor.getHitPoint();
//        arm = arm * ()
//        return
//    }
    
  /*  public static DamageList calculateDamageAfterArmResist(DamageList damages, Armor armor){
        DamageList damageList = new DamageList(damages);
        double resist;
        resist = calculateArmorResist(armor);
        damageList = calculateHealthDamage(damageList,armor.getWeaknessDamageList(),armor.getResistanceDamageList());
        System.out.println("Weakness Resist");
        for (Damage d: damageList) {
            System.out.println(d.getAmountDamage());
        }

        damageList = calculateDamageAfterResist(damageList, resist);


        return damageList;
    }*/


   /* public static DamageList calculateDamageByHitPoint(HitPoint hitPoint, Attack attack){
        DamageList damages = calculateCriticalDamageList(attack.getAttackDamageList(),
                attack.getAttackCritChance(),attack.getAttackCritMulti());
        HitPoint hp = hitPoint;
        if (hitPoint instanceof Health) {
            if ((((Health)hitPoint).getArmor() == null) || (((Health)hitPoint).getArmor().getHitPoint() == 0)){
                damages = calculateHealthDamage(damages, hitPoint.getWeaknessDamageList(), hitPoint.getResistanceDamageList());

            }else {
                Armor armor = ((Health) hitPoint).getArmor();
                damages = calculateHealthDamage(damages, armor.getWeaknessDamageList(), armor.getResistanceDamageList());
            }
        }
        return damages;
    }*/


    public static DamageList calculateHealthDamage(DamageList attackList, Health health){
        DamageList damages = new DamageList(attackList);
        DamageList weakResDL = health.getWeaknessResistanceList();
        //DamageList resistanceDL = health.getResistanceDamageList();

        for (int i = 0; i < damages.size(); i++) {
            for (int j = 0; j < weakResDL.size(); j++){
                if (damages.get(i).getDamageType() == weakResDL.get(j).getDamageType()){
                    System.out.println("DamageType = " + weakResDL.get(j).getDamageType());
                    damages.get(i).setAmountDamage(
                            damages.get(i).getAmountDamage() *  (1 - weakResDL.get(j).getAmountDamage())
                    );
                    System.out.println("Damage = " + damages.get(i).getAmountDamage());
                }
            }

//            for (int j = 0; j < resistanceDL.size(); j++){
//                if (damages.get(i).getDamageType() == resistanceDL.get(j).getDamageType()){
//                    damages.get(i).setAmountDamage(damages.get(i).getAmountDamage() * (resistanceDL.get(j).getAmountDamage()));
//                }
//            }
        }

        return damages;
    }
    public static DamageList calculateArmoredDamage(DamageList attackList, Armor armor){
        DamageList damages = new DamageList(attackList);
        DamageList weakResDL = armor.getWeaknessResistanceList();
        //DamageList resistanceDL = armor.getResistanceDamageList();

        for (int i = 0; i < damages.size(); i++) {
//            System.out.println("Weakness -------------------");
            for (int j = 0; j < weakResDL.size(); j++){
                if (damages.get(i).getDamageType() == weakResDL.get(j).getDamageType()){
                    System.out.println("DamageType = " + weakResDL.get(j).getDamageType());
                    //double damage = damages.get(i).getAmountDamage();
                    double weakness = armor.getWeaknessResistanceList().get(j).getAmountDamage();
                    double armHP = armor.getHitPoint();
                    armHP = armHP * (1 + weakness);
                    System.out.println("ArmHP = " + armHP);
                    double resist = calculateArmorResist(armHP);
                    System.out.println("Resist = " + resist);

                    damages.get(i).setAmountDamage(damages.get(i).getAmountDamage() * (1 - resist));
                    System.out.println("Damage = " + damages.get(i).getAmountDamage());
                }
            }
          /*  System.out.println("Resistance -------------------");
            for (int j = 0; j < resistanceDL.size(); j++){
                if (damages.get(i).getDamageType() == resistanceDL.get(j).getDamageType()){
                    System.out.println("DamageType = " + resistanceDL.get(j).getDamageType());
                    //double damage = damages.get(i).getAmountDamage();
                    double resistance = armor.getResistanceDamageList().get(j).getAmountDamage();
                    double armHP = armor.getHitPoint();
                    armHP = armHP * (1 + resistance);
                    System.out.println("ArmHP = " + armHP);
                    double resist = calculateArmorResist(armHP);
                    System.out.println("Resist = " + resist);
                    damages.get(i).setAmountDamage(damages.get(i).getAmountDamage() * (1 - resist));
                    System.out.println("Damage = " + damages.get(i).getAmountDamage());
                }
            }*/
        }

        return damages;
    }

}
