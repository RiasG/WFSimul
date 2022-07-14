package progect.enemy;

import progect.damage.DamageList;

public class Health extends HitPoint {

    public Health(double hitPoint, DamageList weaknessDamageList, DamageList resistanceDamageList) {
        super(hitPoint, weaknessDamageList, resistanceDamageList);
    }

}
