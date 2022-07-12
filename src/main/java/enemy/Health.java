package enemy;

import damage.DamageList;
import weapon.attacks.Attack;

public class Health extends HitPoint {

    public Health(double hitPoint, DamageList weaknessDamageList, DamageList resistanceDamageList) {
        super(hitPoint, weaknessDamageList, resistanceDamageList);
    }


}
