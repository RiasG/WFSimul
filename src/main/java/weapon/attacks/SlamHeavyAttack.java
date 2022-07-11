package weapon.attacks;

import damage.DamageList;

public class SlamHeavyAttack extends MeleeAttack {
    public SlamHeavyAttack(DamageList attackDamageList,
                           double attackCritMulti, double attackCritChance,
                           double attackStatusChance, double meleeAttackMulti) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance, meleeAttackMulti);
    }
}
