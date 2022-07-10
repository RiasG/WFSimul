package weapon;

import weapon.attacks.*;
import weapon.characters.Characters;
import weapon.characters.CharactersMelee;

public class MeleeWeapon extends Weapon {
    public MeleeWeapon(Characters characters) {
        super(characters);
    }

    public MeleeWeapon() {
    }

    @Override
    public Attack attack() {
        CharactersMelee charactersMelee = (CharactersMelee) super.getCharacters();
        Attack attack = new MeleeAttack(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(), charactersMelee.getAttackMulti());

        return attack;
    }

    public Attack slamLightAttack(){
        CharactersMelee charactersMelee = (CharactersMelee) super.getCharacters();
        Attack attack = new SlamLightAttack(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(), charactersMelee.getSlamAttackMulti());
        return attack;
    }

    public Attack heavyAttack(){
        CharactersMelee charactersMelee = (CharactersMelee) super.getCharacters();
        Attack attack = new HeavyAttackMelee(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(), charactersMelee.getHeavyAttackMulti());
        return attack;
    }



    public Attack slamHeavyAttack(){
        CharactersMelee charactersMelee = (CharactersMelee) super.getCharacters();
        Attack attack = new SlamHeavyAttack(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(), charactersMelee.getSlamHeavyAttackMulti());
        return attack;
    }

    public Attack radialLightAttack(){
        CharactersMelee charactersMelee = (CharactersMelee) super.getCharacters();
        Attack attack = new RadialMeleeAttack(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(),
                charactersMelee.getRadialAttackMulti(), charactersMelee.getRadialAttackRadius());
        return attack;
    }
    public Attack heavyRadialLightAttack(){
        CharactersMelee charactersMelee = (CharactersMelee) super.getCharacters();
        Attack attack = new HeavyRadialMeleeAttack(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(),
                charactersMelee.getHeavyRadialAttackMulti(), charactersMelee.getHeavyRadialAttackRadius());
        return attack;
    }




}
