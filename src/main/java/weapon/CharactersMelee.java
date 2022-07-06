package weapon;

import java.util.LinkedList;



public class CharactersMelee extends Characters{

    //Heavy damage characters
    private Damage heavyDamage;
    private Damage slamHeavyDamage;
    private Damage radiaHeavyDamage;
    private double slamHeavyRadius;
    private double windUp;

    //slam light damage characters
    private Damage slamDamage;
    private double slamRadius;
    private Damage radialDamage;

    private Damage slideDamage;

    private int blockAngle;
    private int comboDuration;
    private double followThrough;


    public CharactersMelee(double attackSpeed, Damage damageList, double criticalChance,
                           double criticalMultiplier, double statusChance) {
        super(attackSpeed, damageList, criticalChance, criticalMultiplier, statusChance);
    }
}
