package Weapon;

import java.util.HashMap;

public class Damage {
    private double amountDamage;
    private DamageType damageType;

    private HashMap<Double, DamageType> damageBox;


    public HashMap<Double, DamageType> getDamageBox() {
        return damageBox;
    }

    public void setDamageBox(HashMap<Double, DamageType> damageBox) {
        this.damageBox = damageBox;
    }

    public Damage(HashMap<Double, DamageType> damageBox) {
        this.damageBox = damageBox;
    }
}
