package weapon.attacks;

import weapon.DamageList;

public class PrimaryAttack extends Attack {

    private double multiShot;

    public PrimaryAttack() {
    }

    public PrimaryAttack(DamageList damageList, double critMulti, double critChance, double statusChance, double multiShot) {
        super(damageList, critMulti, critChance, statusChance);
        this.multiShot = multiShot;

    }

    public double getMultiShot() {
        return multiShot;
    }
}
