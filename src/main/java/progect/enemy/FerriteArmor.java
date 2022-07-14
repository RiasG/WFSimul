package progect.enemy;

import progect.damage.Damage;
import progect.damage.DamageList;
import progect.damage.DamageType;

public class FerriteArmor extends Armor{

    public FerriteArmor(double hitPoint, DamageList weaknessDamageList, DamageList resistanceDamageList) {
        super(hitPoint, weaknessDamageList, resistanceDamageList);
    }

    public FerriteArmor() {
        DamageList weaknessDL = new DamageList();
        DamageList resistanceDL = new DamageList();

        weaknessDL.add(new Damage(0.5, DamageType.CORROSIVE));

        super.setWeaknessDamageList(weaknessDL);
        super.setResistanceDamageList(resistanceDL);
    }
}
