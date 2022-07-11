package weapon.attacks;

import damage.DamageList;

public class HeavyAttackMelee extends MeleeAttack{

    public HeavyAttackMelee() {
    }

    public HeavyAttackMelee(DamageList attackDamageList, double attackCritMulti,
                            double attackCritChance, double attackStatusChance, double meleeAttackMulti) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance, meleeAttackMulti);
    }
}
