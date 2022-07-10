package weapon;

import weapon.attacks.*;
import weapon.characters.Characters;
import weapon.characters.CharactersMelee;

public class MeleeWeapon extends Weapon {
    private CharactersMelee charactersMelee;


    public MeleeWeapon(Characters characters) {
        super(characters);
        this.charactersMelee = (CharactersMelee) super.getCharacters();
    }


    public MeleeWeapon() {
    }

    @Override
    public Attack attack() {
         return new MeleeAttack(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(), charactersMelee.getAttackMulti());
    }

    public Attack slamLightAttack(){
        Attack attack = new SlamLightAttack(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(), charactersMelee.getSlamAttackMulti());
        return attack;
    }

    public Attack heavyAttack(){
        Attack attack = new HeavyAttackMelee(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(), charactersMelee.getHeavyAttackMulti());
        return attack;
    }



    public Attack slamHeavyAttack(){
        Attack attack = new SlamHeavyAttack(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(), charactersMelee.getSlamHeavyAttackMulti());
        return attack;
    }

    public Attack radialLightAttack(){
        Attack attack = new RadialMeleeAttack(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(),
                charactersMelee.getRadialAttackMulti(), charactersMelee.getRadialAttackRadius());
        return attack;
    }
    public Attack heavyRadialLightAttack(){
        //CharactersMelee charactersMelee = (CharactersMelee) super.getCharacters();
        Attack attack = new HeavyRadialMeleeAttack(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(),
                charactersMelee.getHeavyRadialAttackMulti(), charactersMelee.getHeavyRadialAttackRadius());
        return attack;
    }




}
