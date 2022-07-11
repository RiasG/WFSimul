package weapon.attacks;

import damage.DamageList;

public class MeleeAttack extends Attack {

    private double meleeAttackMulti;

    public MeleeAttack() {
    }

    public MeleeAttack(DamageList attackDamageList, double attackCritMulti, double attackCritChance,
                       double attackStatusChance, double meleeAttackMulti) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance);
        this.meleeAttackMulti = meleeAttackMulti;

    }

    public double getMeleeAttackMulti() {
        return meleeAttackMulti;
    }

    public void setMeleeAttackMulti(double meleeAttackMulti) {
        this.meleeAttackMulti = meleeAttackMulti;
    }
}
