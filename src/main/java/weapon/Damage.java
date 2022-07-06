package weapon;

import java.util.HashMap;

public class Damage {
    private double amountDamage;

    private DamageType damageType;

    private HashMap<Double, DamageType> damageBox;

    public Damage(double amountDamage, DamageType damageType) {
        this.amountDamage = amountDamage;
        this.damageType = damageType;
    }

    public Damage(HashMap<Double, DamageType> damageBox) {
        this.damageBox = damageBox;
    }

    public double getAmountDamage() {
        return amountDamage;
    }

    public void setAmountDamage(double amountDamage) {
        this.amountDamage = amountDamage;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public HashMap<Double, DamageType> getDamageBox() {
        return damageBox;
    }

    public void setDamageBox(HashMap<Double, DamageType> damageBox) {
        this.damageBox = damageBox;
    }
}
