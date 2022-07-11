package enemy;

import damage.Damage;
import damage.DamageList;
import damage.DamageType;

public class ResistanceAndWeakness {
    private DamageList cloningResistance;
    private DamageList cloningWeakness;

    public ResistanceAndWeakness() {
        this.cloningResistance = new DamageList();
        this.cloningWeakness = new DamageList();
        cloningResistance.add(new Damage(0.75, DamageType.GAS));
        cloningWeakness.add(new Damage(0.75, DamageType.VIRAL));
    }
}
