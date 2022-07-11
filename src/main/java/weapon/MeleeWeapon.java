package weapon;

import weapon.attacks.*;
import weapon.characters.Characters;
import weapon.characters.CharactersMelee;

public class MeleeWeapon extends Weapon implements AttackMeleeCreator{
    private CharactersMelee charactersMelee;


    public MeleeWeapon(Characters characters) {
        super(characters);

        //TODO выучить наконец исключения
        try {
            this.charactersMelee = (CharactersMelee) characters;
        }catch (ClassCastException cnfx){
            cnfx.printStackTrace();
        }

    }

    public MeleeWeapon() {
    }

    @Override
    public Attack attack() {
        return new MeleeAttack(
                charactersMelee.getDamageListWithMulti(charactersMelee.getAttackMulti()),
                charactersMelee.getCriticalMultiplier(), charactersMelee.getCriticalChance(),
                charactersMelee.getStatusChance()
        );
    }

    @Override
    public Attack heavyAttack(){
        return new HeavyAttackMelee(
                charactersMelee.getDamageListWithMulti(charactersMelee.getHeavyAttackMulti()),
                charactersMelee.getCriticalMultiplier(), charactersMelee.getCriticalChance(),
                charactersMelee.getStatusChance()
        );
    }

    @Override
    public Attack slamLightAttack(){
        return new SlamLightAttack(
                charactersMelee.getDamageListWithMulti(charactersMelee.getSlamAttackMulti()),
                charactersMelee.getCriticalMultiplier(), charactersMelee.getCriticalChance(),
                charactersMelee.getStatusChance()
        );
    }



    @Override
    public Attack slamHeavyAttack(){
        return new SlamHeavyAttack(
                charactersMelee.getDamageListWithMulti(charactersMelee.getSlamHeavyAttackMulti()),
                charactersMelee.getCriticalMultiplier(), charactersMelee.getCriticalChance(),
                charactersMelee.getStatusChance()
        );
    }

   @Override
    public Attack radialLightAttack(){
        return new RadialMeleeAttack(
                charactersMelee.getDamageListWithMulti(charactersMelee.getRadialAttackMulti()),
                charactersMelee.getCriticalMultiplier(), charactersMelee.getCriticalChance(),
                charactersMelee.getStatusChance(), charactersMelee.getRadialAttackRadius()
        );
    }

    @Override
    public Attack heavyRadialAttack(){
        return new HeavyRadialMeleeAttack(
                charactersMelee.getDamageListWithMulti(charactersMelee.getRadialAttackMulti()),
                charactersMelee.getCriticalMultiplier(), charactersMelee.getCriticalChance(),
                charactersMelee.getStatusChance(), charactersMelee.getHeavyRadialAttackRadius()
        );
    }

    @Override
    public Attack slideAttack(){
        return new SlideAttack(charactersMelee.getDamageListWithMulti(charactersMelee.getRadialAttackMulti()),
                charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance()
        );
    }




}
