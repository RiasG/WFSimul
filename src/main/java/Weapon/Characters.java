package Weapon;

import java.util.LinkedList;

public abstract class Characters {
    private double attackSpeed;
    private double disposition;

    private LinkedList<Damage> damageList;
    private double criticalChance;
    private double criticalMultiplier;
    private double statusChance;

    public Characters(double attackSpeed, LinkedList<Damage> damageList, double criticalChance, double criticalMultiplier, double statusChance) {
        this.attackSpeed = attackSpeed;
        this.damageList = damageList;
        this.criticalChance = criticalChance;
        this.criticalMultiplier = criticalMultiplier;
        this.statusChance = statusChance;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public LinkedList<Damage> getDamageList() {
        return damageList;
    }

    public void setDamageList(LinkedList<Damage> damageList) {
        this.damageList = damageList;
    }

    public double getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(double criticalChance) {
        this.criticalChance = criticalChance;
    }

    public double getCriticalMultiplier() {
        return criticalMultiplier;
    }

    public void setCriticalMultiplier(double criticalMultiplier) {
        this.criticalMultiplier = criticalMultiplier;
    }

    public double getStatusChance() {
        return statusChance;
    }

    public void setStatusChance(double statusChance) {
        this.statusChance = statusChance;
    }
}
