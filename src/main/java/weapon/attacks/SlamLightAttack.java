package weapon.attacks;

import weapon.DamageList;

public class SlamLightAttack extends Attack{
    private double slamDamageMulti;

    public SlamLightAttack() {
    }

    public SlamLightAttack(DamageList attackDamageList, double attackCritMulti, double attackCritChance, double attackStatusChance, double slamDamageMulti) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance);
        this.slamDamageMulti = slamDamageMulti;
    }
}
