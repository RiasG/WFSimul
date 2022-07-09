package weapon.attacks;

import weapon.DamageList;

public class HeavyAttackMelee extends Attack{

    public HeavyAttackMelee() {
    }

    public HeavyAttackMelee(DamageList attackDamageList, double attackCritMulti,
                            double attackCritChance, double attackStatusChance) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance);
    }
}
