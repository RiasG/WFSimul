package progect.weapon;

import progect.weapon.attacks.PrimaryAttack;
import progect.weapon.characters.Characters;
import progect.weapon.attacks.Attack;
import progect.weapon.characters.CharactersPrimary;

public class PrimaryWeapon extends Weapon implements AttackCreator{

    CharactersPrimary charactersPrimary;

    public PrimaryWeapon() {
    }

    public PrimaryWeapon(Characters characters) {
        super(characters);
        charactersPrimary = (CharactersPrimary) characters;
    }

    @Override
    public Attack attack() {
        CharactersPrimary charactersPrimary = (CharactersPrimary) super.getCharacters();
        Attack attack = new PrimaryAttack(charactersPrimary.getDamageList(),charactersPrimary.getCriticalMultiplier(),
                charactersPrimary.getCriticalChance(), charactersPrimary.getStatusChance(),charactersPrimary.getMultiShot());

        return attack;
    }


}
