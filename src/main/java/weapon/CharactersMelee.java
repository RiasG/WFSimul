package weapon;


public class CharactersMelee extends Characters{

    //Heavy damage characters
    private DamageCharacter heavyDamageCharacter;
    private DamageCharacter slamHeavyDamageCharacter;
    private DamageCharacter radiaHeavyDamageCharacter;
    private double slamHeavyRadius;
    private double windUp;
    //slam light damage characters
    private DamageCharacter slamDamageCharacter;
    private double slamRadius;
    private DamageCharacter radialDamageCharacter;
    private DamageCharacter slideDamageCharacter;
    private int blockAngle;
    private int comboDuration;
    private double followThrough;

    public CharactersMelee(double attackSpeed, double disposition, DamageCharacter damageCharacterList,
                           double criticalChance, double criticalMultiplier,
                           double statusChance, NoiseLevel noiseLevel, DamageCharacter heavyDamageCharacter, DamageCharacter slamHeavyDamageCharacter, DamageCharacter radiaHeavyDamageCharacter,
                           double slamHeavyRadius, double windUp, DamageCharacter slamDamageCharacter,
                           double slamRadius, DamageCharacter radialDamageCharacter, DamageCharacter slideDamageCharacter,
                           int blockAngle, int comboDuration, double followThrough) {
        super(attackSpeed, disposition, damageCharacterList, criticalChance, criticalMultiplier, statusChance, noiseLevel);
        this.heavyDamageCharacter = heavyDamageCharacter;
        this.slamHeavyDamageCharacter = slamHeavyDamageCharacter;
        this.radiaHeavyDamageCharacter = radiaHeavyDamageCharacter;
        this.slamHeavyRadius = slamHeavyRadius;
        this.windUp = windUp;
        this.slamDamageCharacter = slamDamageCharacter;
        this.slamRadius = slamRadius;
        this.radialDamageCharacter = radialDamageCharacter;
        this.slideDamageCharacter = slideDamageCharacter;
        this.blockAngle = blockAngle;
        this.comboDuration = comboDuration;
        this.followThrough = followThrough;
    }

}
