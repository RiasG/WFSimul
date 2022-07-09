package weapon.attacks;

import weapon.DamageList;

public abstract class Attack {
    private DamageList attackDamageList;
    private double attackCritMulti;
    private double attackCritChance;
    private double attackStatusChance;

    public Attack() {
    }

    public Attack(DamageList attackDamageList, double attackCritMulti, double attackCritChance, double attackStatusChance) {
        this.attackDamageList = attackDamageList;
        this.attackCritMulti = attackCritMulti;
        this.attackCritChance = attackCritChance;
        this.attackStatusChance = attackStatusChance;
    }



    public DamageList getAttackDamageList() {
        return attackDamageList;
    }
}
