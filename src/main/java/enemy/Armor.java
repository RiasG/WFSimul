package enemy;

import damage.DamageList;
import weapon.attacks.Attack;

public class Armor extends HitPointBar {

    public Armor(double hitPoint, DamageList weaknessDamageList, DamageList resistanceDamageList) {
        super(hitPoint, weaknessDamageList, resistanceDamageList);
    }

}
