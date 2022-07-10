package weapon.attacks;

import weapon.DamageList;

public class RadialMeleeAttack extends MeleeAttack{

    private double radialAttackRadius;

    public RadialMeleeAttack(DamageList attackDamageList, double attackCritMulti, double attackCritChance,
                             double attackStatusChance, double meleeAttackMulti, double radialAttackRadius) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance, meleeAttackMulti);
        this.radialAttackRadius = radialAttackRadius;
    }
}
