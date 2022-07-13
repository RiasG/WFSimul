package progect.enemy;

import progect.damage.DamageList;

public class Health extends HitPoint {
    Armor armor;

    public Health(double hitPoint, DamageList weaknessDamageList, DamageList resistanceDamageList, Armor armor) {
        super(hitPoint, weaknessDamageList, resistanceDamageList);
        this.armor = armor;
    }

    public Health(double hitPoint, DamageList weaknessDamageList, DamageList resistanceDamageList) {
        super(hitPoint, weaknessDamageList, resistanceDamageList);
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
