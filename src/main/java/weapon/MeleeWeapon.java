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

    public Attack slamLightAttack(){
        CharactersMelee charactersMelee = (CharactersMelee) super.getCharacters();
        Attack attack = new SlamLightAttack(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(), charactersMelee.getSlamDamageMulti());
        return attack;
    }

    public Attack heavyAttack(){
        CharactersMelee charactersMelee = (CharactersMelee) super.getCharacters();
        Attack attack = new HeavyAttackMelee(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(), charactersMelee.getHeavyDamageMulti());
        return attack;
    }



    public Attack slamHeavyAttack(){
        CharactersMelee charactersMelee = (CharactersMelee) super.getCharacters();
        Attack attack = new SlamHeavyAttack(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance(), charactersMelee.getSlamHeavyDamageMulti());
        return attack;
    }




}
