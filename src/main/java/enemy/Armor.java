package enemy;

import damage.DamageList;

public class Armor extends HitPointBar {

    public Armor(double hitPoint, DamageList weaknessDamageList, DamageList resistanceDamageList) {
        super(hitPoint, weaknessDamageList, resistanceDamageList);
    }
}
