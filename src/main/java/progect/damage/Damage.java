package progect.damage;



public class Damage {
    private double amountDamage;
    private DamageType damageType;
    private double damagePercent;




    public Damage(double amountDamage, DamageType damageType) {
        this.amountDamage = amountDamage;
        this.damageType = damageType;
    }

    public Damage(Damage damage) {
        this.amountDamage = damage.getAmountDamage();
        this.damageType = damage.getDamageType();
    }

    public Damage(double amountDamage, DamageType damageType, double damagePercent) {
        this.amountDamage = amountDamage;
        this.damageType = damageType;
        this.damagePercent = damagePercent;
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

    public double getDamagePercent() {
        return damagePercent;
    }

    public void setDamagePercent(double damagePercent) {
        this.damagePercent = damagePercent;
    }

}
