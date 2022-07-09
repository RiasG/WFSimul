package weapon.attacks;

import weapon.DamageList;
import weapon.attacks.Attack;

public class AttackPrimary extends Attack {

    private double multiShot;

    public AttackPrimary() {
    }

    public AttackPrimary(DamageList damageList, double critMulti, double critChance, double statusChance, double multiShot) {
        super(damageList, critMulti, critChance, statusChance);
        this.multiShot = multiShot;

    }

    public double getMultiShot() {
        return multiShot;
    }
}
