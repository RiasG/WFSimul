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
    public Attack mainAttack() {
        CharactersMelee charactersMelee = (CharactersMelee) super.getCharacters();
        Attack attack = new LightAttackMelee(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance());

        return attack;
    }

    public Attack heavyAttack(){
        CharactersMelee charactersMelee = (CharactersMelee) super.getCharacters();
        Attack attack = new HeavyAttackMelee(charactersMelee.getHeavyDamageList(),charactersMelee.getHeavyDamageCritMulti(),
                charactersMelee.getHeavyDamageCriticalChance(), charactersMelee.getStatusChance());
        return attack;
    }

    public Attack slamLightAttack(){
        CharactersMelee charactersMelee = (CharactersMelee) super.getCharacters();
        Attack attack = new SlamLightAttack(charactersMelee.getHeavyDamageList(),charactersMelee.getHeavyDamageCritMulti(),
                charactersMelee.getHeavyDamageCritMulti(), charactersMelee.getStatusChance(), charactersMelee.getSlamRadius());
        return attack;
    }

    public Attack slamHeavyAttack(){
        CharactersMelee charactersMelee = (CharactersMelee) super.getCharacters();
        Attack attack = new SlamHeavyAttack(charactersMelee.getHeavyDamageList(),charactersMelee.getHeavyDamageCritMulti(),
                charactersMelee.getHeavyDamageCritMulti(), charactersMelee.getStatusChance(), charactersMelee.getHeavySlamRadius());
        return attack;
    }

    public Attack HeavyAttack(){
        CharactersMelee charactersMelee = (CharactersMelee) super.getCharacters();
        Attack attack = new SlamHeavyAttack(charactersMelee.getHeavyDamageList(),charactersMelee.getHeavyDamageCritMulti(),
                charactersMelee.getHeavyDamageCritMulti(), charactersMelee.getStatusChance(), charactersMelee.getHeavySlamRadius());
        return attack;
    }



}
