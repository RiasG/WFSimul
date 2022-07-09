package weapon.attacks;

import weapon.DamageList;

public class SlamLightAttack extends Attack{
    private double slamRadius;

    public SlamLightAttack() {
    }

    public SlamLightAttack(DamageList attackDamageList, double attackCritMulti, double attackCritChance,
                           double attackStatusChance, double slamRadius) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance);
        this.slamRadius = slamRadius;
    }
}
