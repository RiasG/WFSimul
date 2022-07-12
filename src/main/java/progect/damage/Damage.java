package progect.damage;



public class Damage {
    private double amountDamage;
    private DamageType damageType;

    public Damage(double amountDamage, DamageType damageType) {
        this.amountDamage = amountDamage;
        this.damageType = damageType;
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
}
