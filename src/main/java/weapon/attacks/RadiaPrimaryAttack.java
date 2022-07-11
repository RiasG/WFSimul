package weapon.attacks;

import damage.DamageList;

public class RadiaPrimaryAttack extends Attack{
    private double radialAttackRadius;

    public RadiaPrimaryAttack(DamageList attackDamageList, double attackCritMulti,
                              double attackCritChance, double attackStatusChance, double radialAttackRadius) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance);
        this.radialAttackRadius = radialAttackRadius;
    }
}
