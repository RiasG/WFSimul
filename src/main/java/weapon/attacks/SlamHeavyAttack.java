package weapon.attacks;

import weapon.DamageList;

public class SlamHeavyAttack extends Attack {
    private double slamHeavyDamageMulti;

    public SlamHeavyAttack(DamageList attackDamageList, double attackCritMulti,
                           double attackCritChance, double attackStatusChance, double slamHeavyDamageMulti) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance);
        this.slamHeavyDamageMulti = slamHeavyDamageMulti;
    }
}
