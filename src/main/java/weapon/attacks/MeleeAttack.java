package weapon.attacks;

import damage.DamageList;
import weapon.AttackMeleeCreator;
import weapon.characters.Characters;

public class MeleeAttack extends Attack {

    private double meleeAttackMulti;

    public MeleeAttack() {
        meleeAttackMulti = 1;
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
