package weapon.attacks;

import damage.DamageList;

public class SlideAttack extends MeleeAttack{
    public SlideAttack() {
    }

    public SlideAttack(DamageList attackDamageList, double attackCritMulti, double attackCritChance, double attackStatusChance) {
        super(attackDamageList, attackCritMulti, attackCritChance, attackStatusChance);
    }
}
