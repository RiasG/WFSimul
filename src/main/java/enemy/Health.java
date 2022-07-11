package enemy;

import damage.DamageList;

public class Health extends HitPointBar {
    private Armor armor;

    public Health(double hitPoint, DamageList weaknessDamageList, DamageList resistanceDamageList, Armor armor) {
        super(hitPoint, weaknessDamageList, resistanceDamageList);
        this.armor = armor;
    }

    public Health(double hitPoint, DamageList weaknessDamageList, DamageList resistanceDamageList) {
        super(hitPoint, weaknessDamageList, resistanceDamageList);
    }

}
