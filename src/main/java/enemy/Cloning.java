package enemy;

import damage.DamageList;

public class Cloning extends Health{
    public Cloning(double hitPoint, DamageList weaknessDamageList, DamageList resistanceDamageList, Armor armor) {
        super(hitPoint, weaknessDamageList, resistanceDamageList, armor);
    }

    public Cloning(double hitPoint, DamageList weaknessDamageList, DamageList resistanceDamageList) {
        super(hitPoint, weaknessDamageList, resistanceDamageList);
    }


}
