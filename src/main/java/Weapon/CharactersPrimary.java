package Weapon;

import java.util.LinkedList;

public class CharactersPrimary extends Characters{
    private double multiShot;


    public CharactersPrimary(double attackSpeed, LinkedList<Damage> damageList, double criticalChance,
                             double criticalMultiplier, double statusChance, double multiShot) {
        super(attackSpeed, damageList, criticalChance, criticalMultiplier, statusChance);
        this.multiShot = multiShot;
    }

    public double getMultiShot() {
        return multiShot;
    }

    public void setMultiShot(double multiShot) {
        this.multiShot = multiShot;
    }
}
