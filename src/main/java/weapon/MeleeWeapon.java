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
        CharactersMelee chMelee = new CharactersMelee();
        charactersMelee.getDamageListWithMulti(charactersMelee.getAttackMulti());
         return new MeleeAttack(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(), charactersMelee.getAttackMulti());
    }

    @Override
    public Attack slamLightAttack(){
        Attack attack = new SlamLightAttack(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(), charactersMelee.getSlamAttackMulti());
        return attack;
    }

    @Override
    public Attack heavyAttack(){
        Attack attack = new HeavyAttackMelee(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(), charactersMelee.getHeavyAttackMulti());
        return attack;
    }

    @Override
    public Attack slamHeavyAttack(){
        Attack attack = new SlamHeavyAttack(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(), charactersMelee.getSlamHeavyAttackMulti());
        return attack;
    }

   @Override
    public Attack radialLightAttack(){
        Attack attack = new RadialMeleeAttack(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(),
                charactersMelee.getRadialAttackMulti(), charactersMelee.getRadialAttackRadius());
        return attack;
    }

    @Override
    public Attack heavyRadialLightAttack(){
        Attack attack = new HeavyRadialMeleeAttack(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(),
                charactersMelee.getHeavyRadialAttackMulti(), charactersMelee.getHeavyRadialAttackRadius());
        return attack;
    }

    @Override
    public Attack slideAttack(){
        Attack attack = new HeavyRadialMeleeAttack(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(),
                charactersMelee.getHeavyRadialAttackMulti(), charactersMelee.getHeavyRadialAttackRadius());
        return attack;
    }




}
