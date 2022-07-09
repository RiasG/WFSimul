package weapon.attacks;

import weapon.DamageList;

public class LightAttackMelee extends Attack {

    private double slamHeavyRadius;
    private double slamHeavyDamageMulti;


    private DamageList slamHeavyDamageList;
    private DamageList radiaHeavyDamageList;

    private DamageList slamDamageList;
    private DamageList radialDamageList;
    private DamageList slideDamageList;

    public LightAttackMelee() {
    }

    public LightAttackMelee(DamageList damageList, double critMulti, double critChance, double statusChance) {
        super(damageList, critMulti, critChance, statusChance);
    }

}
