package progect.enemy;

import progect.damage.DamageList;

public abstract class HitPoint {
    private double hitPoint;
    private DamageList weaknessDamageList;
    private DamageList resistanceDamageList;

    public HitPoint() {
    }

    public HitPoint(double hitPoint, DamageList weaknessDamageList, DamageList resistanceDamageList) {
        this.hitPoint = hitPoint;
        this.weaknessDamageList = weaknessDamageList;
        this.resistanceDamageList = resistanceDamageList;
    }

    public double getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(double hitPoint) {
        this.hitPoint = hitPoint;
    }

    public DamageList getWeaknessDamageList() {
        return weaknessDamageList;
    }

    public void setWeaknessDamageList(DamageList weaknessDamageList) {
        this.weaknessDamageList = weaknessDamageList;
    }

    public DamageList getResistanceDamageList() {
        return resistanceDamageList;
    }

    public void setResistanceDamageList(DamageList resistanceDamageList) {
        this.resistanceDamageList = resistanceDamageList;
    }

    public boolean takeDamage(double damage){
        if (damage <= 0 ) return false;
        else {
            this.hitPoint -= damage;
            return true;
        }
    }
}
