package enemy;

import damage.DamageList;

public abstract class HitPointBar {
    private double hitPoint;
    private DamageList weaknessDamageList;
    private DamageList resistanceDamageList;

    public HitPointBar(double hitPoint, DamageList weaknessDamageList, DamageList resistanceDamageList) {
        this.hitPoint = hitPoint;
        this.weaknessDamageList = weaknessDamageList;
        this.resistanceDamageList = resistanceDamageList;
    }
}
