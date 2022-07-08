package weapon;

public abstract class Attack {
    private DamageList damageList;
    private double critMulti;
    private double critChance;
    private double statusChance;

    public Attack() {
    }

    public Attack(DamageList damageList, double critMulti, double critChance, double statusChance) {
        this.damageList = damageList;
        this.critMulti = critMulti;
        this.critChance = critChance;
        this.statusChance = statusChance;
    }



    public DamageList getDamageList() {
        return damageList;
    }
}
