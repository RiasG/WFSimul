package weapon.characters;


import damage.Damage;
import damage.DamageList;

public class CharactersMelee extends Characters{

    /**
     * Heavy damage characters
     */
    private double heavyAttackMulti;

    /**
     * Время подготовки тяжелой атаки
     */
    private double windUp;

    /**
     * Slam damage characters
     */
    private double slamAttackMulti;
    private double slamHeavyAttackMulti;

    /**
     * RadialAttack
     */
    private double radialAttackRadius;
    private double radialAttackMulti;
    private double heavyRadialAttackRadius;
    private double heavyRadialAttackMulti;
    private Damage radialAttackDamage;

    /**
     * slide attack
     */

    private double slideAttackMulti;
    private Damage slideAttackDamage;

    private int blockAngle;
    private int comboDuration;
    private double attackMulti;

    /**
     * Уменьшение урона при попадании одной аттаки по последующим целям
     */
    private double followThrough;


    public CharactersMelee() {

    }


    public double getHeavyAttackMulti() {
        return heavyAttackMulti;
    }

    public void setHeavyAttackMulti(double heavyAttackMulti) {
        this.heavyAttackMulti = heavyAttackMulti;
    }



    public double getSlamAttackMulti() {
        return slamAttackMulti;
    }

    public double getSlamHeavyAttackMulti() {
        return slamHeavyAttackMulti;
    }

    public DamageList getHeavyDamageList(){
        DamageList damages = new DamageList();
        int i = 0;
        for (Damage d:super.getDamageList()) {
            Damage damage = new Damage(d.getAmountDamage() * heavyAttackMulti, d.getDamageType());
            damages.add(damage);
            i++;
        }

        return damages;
    }


    public double getAttackMulti() {
        return attackMulti;
    }

    public double getRadialAttackMulti() {
        return radialAttackMulti;
    }

    public double getRadialAttackRadius() {
        return radialAttackRadius;
    }

    public double getWindUp() {
        return windUp;
    }

    public double getHeavyRadialAttackRadius() {
        return heavyRadialAttackRadius;
    }

    public double getHeavyRadialAttackMulti() {
        return heavyRadialAttackMulti;
    }

    public Damage getRadialAttackDamage() {
        return radialAttackDamage;
    }

    public double getSlideAttackMulti() {
        return slideAttackMulti;
    }

    public Damage getSlideAttackDamage() {
        return slideAttackDamage;
    }

    public int getBlockAngle() {
        return blockAngle;
    }

    public int getComboDuration() {
        return comboDuration;
    }

    public double getFollowThrough() {
        return followThrough;
    }
}
