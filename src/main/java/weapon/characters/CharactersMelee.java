package weapon.characters;


import damage.Damage;
import damage.DamageList;

public class CharactersMelee extends Characters{
    
    /**
     * RadialAttack
     */
    private double radialAttackRadius;
    private double heavyRadialAttackRadius;
    private Damage radialAttackDamage;

    /**
     * slide attack
     */

    private Damage slideAttackDamage; // у слайд атаки зачастую тип урона

    /**
     * Множители атак
     */
    private double attackMulti;
    private double heavyAttackMulti;
    private double slideAttackMulti;
    private double heavyRadialAttackMulti;
    private double radialAttackMulti;
    private double slamAttackMulti;
    private double slamHeavyAttackMulti;

    /**
     * Дополнительные хр-ки
     */
    private double windUp; // Время подготовки тяжелой атаки
    private int blockAngle;
    private int comboDuration;


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


    /**
     *
     * @param mult
     * @return
     *
     * Все атаки ближнего боя имеют множитель урона, который берется из типа атаки, например тяжелой атаки или
     * удара по земле, зависит от типа оружия, но есть и уникальные. Так же стандартные атаки могут иметь множитель урона,
     * если являются частью комбо (это будет реализовано в стойках - моды для ближки, пока нет в разработке)
     */
    public DamageList getDamageListWithMulti(double mult){
        DamageList damages = new DamageList();
        for (Damage d:super.getDamageList()) {
            Damage damage = new Damage(d.getAmountDamage() * mult, d.getDamageType());
            damages.add(damage);
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
