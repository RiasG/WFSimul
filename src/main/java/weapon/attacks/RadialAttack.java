package weapon.attacks;

import damage.DamageList;

public class RadialAttack extends Attack{
    private double radialAttackRadius;

    public RadialAttack(DamageList attackDamageList, double attackCritMulti,
                        double attackCritChance, double attackStatusChance, double radialAttackRadius) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance);
        this.radialAttackRadius = radialAttackRadius;
    }
}
