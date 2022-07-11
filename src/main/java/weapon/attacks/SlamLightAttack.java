package weapon.attacks;

import damage.DamageList;

public class SlamLightAttack extends MeleeAttack{

    public SlamLightAttack(DamageList attackDamageList, double attackCritMulti, double attackCritChance,
                           double attackStatusChance, double meleeAttackMulti) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance, meleeAttackMulti);
    }
}
