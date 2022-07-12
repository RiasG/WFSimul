package enemy;

import damage.DamageList;
import weapon.attacks.Attack;

public class Shield extends HitPoint {
    public Shield(double hitPoint, DamageList weaknessDamageList, DamageList resistanceDamageList) {
        super(hitPoint, weaknessDamageList, resistanceDamageList);
    }


}
