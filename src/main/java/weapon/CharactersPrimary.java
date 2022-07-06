package weapon;

public class CharactersPrimary extends Characters{
    private double multiShot;
    private double projectileSpeed;
    private double reloadSpeed;
    private int magazineAmmo;
    private int fullAmmo;


    public CharactersPrimary(double attackSpeed, double disposition, DamageCharacter damageCharacterList,
                             double criticalChance, double criticalMultiplier,
                             double statusChance, NoiseLevel noiseLevel, double multiShot,
                             double projectileSpeed, double reloadSpeed, int magazineAmmo, int fullAmmo) {
        super(attackSpeed, disposition, damageCharacterList, criticalChance, criticalMultiplier, statusChance, noiseLevel);
        this.multiShot = multiShot;
        this.projectileSpeed = projectileSpeed;
        this.reloadSpeed = reloadSpeed;
        this.magazineAmmo = magazineAmmo;
        this.fullAmmo = fullAmmo;
    }


}
