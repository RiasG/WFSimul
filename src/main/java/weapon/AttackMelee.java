package weapon;

public class AttackMelee extends Attack{


    private DamageList heavyDamageList;
    private DamageList slamHeavyDamageList;
    private DamageList radiaHeavyDamageList;

    private DamageList slamDamageList;
    private DamageList radialDamageList;
    private DamageList slideDamageList;
    
    public AttackMelee() {
    }

    public AttackMelee(DamageList damageList, double critMulti, double critChance, double statusChance) {
        super(damageList, critMulti, critChance, statusChance);
    }

}
