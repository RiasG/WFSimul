package weapon;

public class AttackMelee extends Attack{

    /**
     * Heavy damage characters
    */

    private DamageList heavyDamageList;
    private DamageList slamHeavyDamageList;
    private DamageList radiaHeavyDamageList;

    /**
     * slam light damage characters
     */
    private DamageList slamDamageList;
    private DamageList radialDamageList;
    private DamageList slideDamageList;


    private double followThrough;

    public AttackMelee() {
    }

    public AttackMelee(DamageList damageList, double critMulti, double critChance, double statusChance) {
        super(damageList, critMulti, critChance, statusChance);
    }
}
