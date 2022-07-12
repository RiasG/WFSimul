package damage;

public class DamageCalculator {

    public static DamageList getDamageListWithMulti(DamageList dList, double mult){
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
            dList = getDamageListWithMulti(damageList, cMult);
        }

        return dList;
    }

}
