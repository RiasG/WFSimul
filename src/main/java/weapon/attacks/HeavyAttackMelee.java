package weapon.attacks;

import weapon.DamageList;

public class HeavyAttackMelee extends Attack{

    private double heavyDamageMulti;

    public HeavyAttackMelee() {
    }

    public HeavyAttackMelee(DamageList attackDamageList, double attackCritMulti, double attackCritChance,
                            double attackStatusChance, double heavyDamageMulti) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance);
        this.heavyDamageMulti = heavyDamageMulti;
    }
}
