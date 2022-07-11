package weapon.attacks;

import damage.DamageList;
import weapon.AttackMeleeCreator;
import weapon.characters.Characters;

public class MeleeAttack extends Attack {


    public MeleeAttack() {
    }

    public MeleeAttack(DamageList attackDamageList, double attackCritMulti, double attackCritChance,
                       double attackStatusChance) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance);
    }


}
