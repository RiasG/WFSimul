package weapon;


public class CharactersMelee extends Characters{

    //Heavy damage characters
    private DamageList heavyDamageList;
    private DamageList slamHeavyDamageList;
    private DamageList radiaHeavyDamageList;
    private double slamHeavyRadius;
    private double windUp;
    //slam light damage characters
    private DamageList slamDamageList;
    private double slamRadius;
    private DamageList radialDamageList;
    private DamageList slideDamageList;
    private int blockAngle;
    private int comboDuration;
    private double followThrough;

    public CharactersMelee(double attackSpeed, double disposition, DamageList damageList,
                           double criticalChance, double criticalMultiplier,
                           double statusChance, NoiseLevel noiseLevel, double slamHeavyRadius,
                           double windUp, double slamRadius, int blockAngle, int comboDuration, double followThrough) {
        super(attackSpeed, disposition, damageList, criticalChance, criticalMultiplier, statusChance, noiseLevel);
        this.slamHeavyRadius = slamHeavyRadius;
        this.windUp = windUp;
        this.slamRadius = slamRadius;
        this.blockAngle = blockAngle;
        this.comboDuration = comboDuration;
        this.followThrough = followThrough;
    }
}
