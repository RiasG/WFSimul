package weapon.characters;


import weapon.Damage;
import weapon.DamageList;
import weapon.NoiseLevel;

public class CharactersMelee extends Characters{

    /**
     * Heavy damage characters
     */
    private double heavyDamageMulti;

    /**
     * Время подготовки тяжелой атаки
     */
    private double windUp;

    /**
     * Slam damage characters
     */
    private double slamDamageMulti;
    private double slamHeavyDamageMulti;

    /**
     * RadialAttack
     */
    private double radialAttackRadius;
    private double heavyRadialAttackRadius;
    private Damage radialDamage;

    /**
     * slide attack
     */

    private double slideDamageMulti;
    private Damage slideDamage;

    private int blockAngle;
    private int comboDuration;

    /**
     * Уменьшение урона при попадании одной аттаки по последующим целям
     */
    private double followThrough;



    public double getHeavyDamageMulti() {
        return heavyDamageMulti;
    }

    public void setHeavyDamageMulti(double heavyDamageMulti) {
        this.heavyDamageMulti = heavyDamageMulti;
    }

    public double getSlamDamageMulti() {
        return slamDamageMulti;
    }

    public double getSlamHeavyDamageMulti() {
        return slamHeavyDamageMulti;
    }

}
