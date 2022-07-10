package weapon.attacks;

import weapon.DamageList;

public class HeavyRadialMeleeAttack extends RadialMeleeAttack {
    public HeavyRadialMeleeAttack(DamageList attackDamageList, double attackCritMulti, double attackCritChance,
                                  double attackStatusChance, double radialAttackMulti, double radialAttackRadius) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance, radialAttackMulti, radialAttackRadius);
    }
}