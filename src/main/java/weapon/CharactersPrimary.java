package weapon;

public class CharactersPrimary extends Characters{
    private double multiShot;
    private double projectileSpeed;
    private double reloadSpeed;
    private int magazineAmmo;
    private int fullAmmo;


    public CharactersPrimary(double attackSpeed, Damage damageList, double criticalChance,
                             double criticalMultiplier, double statusChance, double multiShot
    ) {
        super(attackSpeed, damageList, criticalChance, criticalMultiplier, statusChance);
        this.multiShot = multiShot;
    }

    public double getMultiShot() {
        return multiShot;
    }

    public void setMultiShot(double multiShot) {
        this.multiShot = multiShot;
    }
}
