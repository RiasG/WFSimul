package weapon;

public abstract class Characters {
    private double attackSpeed;
    private double disposition;
    private DamageList damageList;
    private double criticalChance;
    private double criticalMultiplier;
    private double statusChance;
    private NoiseLevel noiseLevel;

    public Characters(double attackSpeed, double disposition, DamageList damageList,
                      double criticalChance, double criticalMultiplier,
                      double statusChance, NoiseLevel noiseLevel) {
        this.attackSpeed = attackSpeed;
        this.disposition = disposition;
        this.damageList = damageList;
        this.criticalChance = criticalChance;
        this.criticalMultiplier = criticalMultiplier;
        this.statusChance = statusChance;
        this.noiseLevel = noiseLevel;
    }

    public Characters() {
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public double getDisposition() {
        return disposition;
    }

    public void setDisposition(double disposition) {
        this.disposition = disposition;
    }

    public DamageList getDamageCharacterList() {
        return damageList;
    }

    public void setDamageCharacterList(DamageList damageListList) {
        this.damageList = damageListList;
    }

    public double getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(double criticalChance) {
        this.criticalChance = criticalChance;
    }

    public double getCriticalMultiplier() {
        return criticalMultiplier;
    }

    public void setCriticalMultiplier(double criticalMultiplier) {
        this.criticalMultiplier = criticalMultiplier;
    }

    public double getStatusChance() {
        return statusChance;
    }

    public void setStatusChance(double statusChance) {
        this.statusChance = statusChance;
    }

    public NoiseLevel getNoiseLevel() {
        return noiseLevel;
    }

    public void setNoiseLevel(NoiseLevel noiseLevel) {
        this.noiseLevel = noiseLevel;
    }
}
