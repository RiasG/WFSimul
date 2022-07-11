package enemy;

import damage.DamageList;

public class Shield extends HitPointBar {
    public Shield(double hitPoint, DamageList weaknessDamageList, DamageList resistanceDamageList) {
        super(hitPoint, weaknessDamageList, resistanceDamageList);
    }
}
