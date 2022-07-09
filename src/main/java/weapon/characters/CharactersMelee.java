package weapon.characters;


import weapon.DamageList;
import weapon.NoiseLevel;

public class CharactersMelee extends Characters{

    /**
     * Heavy damage characters
     */
    private DamageList heavyDamageList;
    private double heavyDamageCritMulti;
    private double heavyDamageCritChance;
    private DamageList slamHeavyDamageList;
    private DamageList radialHeavyDamageList;
    private double slamHeavyRadius;

    private double slamHeavyDamageMulti;
    private double heavySlamRadius;


    /**
     * Время подготовки тяжелой атаки
     */
    private double windUp;

    /**
     * Slam light damage characters
     */
    private DamageList slamDamageList;
    private DamageList radialDamageList;

    /**
     * slide attack
     */

    private DamageList slideDamageList;
    private double slideDamageMulti;
    private double slamRadius;
    private int blockAngle;
    private int comboDuration;

    /**
     * Уменьшение урона при попадании одной аттаки по последующим целям
     */
    private double followThrough;



    public CharactersMelee(String name, double attackSpeed, double disposition, DamageList damageList,
                           double criticalChance, double criticalMultiplier,
                           double statusChance, NoiseLevel noiseLevel, double slamHeavyRadius,
                           double windUp, double slamRadius, int blockAngle, int comboDuration, double followThrough) {
        super(name, attackSpeed, disposition, damageList, criticalChance, criticalMultiplier, statusChance, noiseLevel);
        this.slamHeavyRadius = slamHeavyRadius;
        this.windUp = windUp;
        this.slamRadius = slamRadius;
        this.blockAngle = blockAngle;
        this.comboDuration = comboDuration;
        this.followThrough = followThrough;
    }

    public CharactersMelee(String name, double attackSpeed,
                           double disposition, DamageList damageList, double criticalChance,
                           double criticalMultiplier, double statusChance, NoiseLevel noiseLevel,
                           DamageList heavyDamageList, DamageList slamHeavyDamageList, DamageList radiaHeavyDamageList,
                           double slamHeavyRadius, double windUp, DamageList slamDamageList, DamageList radialDamageList, DamageList slideDamageList,
                           double slamRadius, int blockAngle, int comboDuration, double followThrough) {
        super(name, attackSpeed, disposition, damageList, criticalChance, criticalMultiplier, statusChance, noiseLevel);
        this.heavyDamageList = heavyDamageList;
        this.slamHeavyDamageList = slamHeavyDamageList;
        this.radialHeavyDamageList = radiaHeavyDamageList;
        this.slamHeavyRadius = slamHeavyRadius;
        this.windUp = windUp;
        this.slamDamageList = slamDamageList;
        this.radialDamageList = radialDamageList;
        this.slideDamageList = slideDamageList;
        this.slamRadius = slamRadius;
        this.blockAngle = blockAngle;
        this.comboDuration = comboDuration;
        this.followThrough = followThrough;
    }

    public DamageList getHeavyDamageList() {
        return heavyDamageList;
    }

    public void setHeavyDamageList(DamageList heavyDamageList) {
        this.heavyDamageList = heavyDamageList;
    }

    public double getHeavyDamageCritMulti() {
        return heavyDamageCritMulti;
    }

    public double getSlamRadius() {
        return slamRadius;
    }

    public void setSlamRadius(double slamRadius) {
        this.slamRadius = slamRadius;
    }

    public void setHeavyDamageCritMulti(double heavyDamageCritMulti) {
        this.heavyDamageCritMulti = heavyDamageCritMulti;
    }

    public double getHeavyDamageCriticalChance() {
        return this.heavyDamageCritChance;
    }

    public double getHeavySlamRadius() {
        return this.heavySlamRadius;
    }
}
