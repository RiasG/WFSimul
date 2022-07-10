package weapon;

import weapon.attacks.Attack;
import weapon.attacks.PrimaryAttack;
import weapon.characters.Characters;
import weapon.characters.CharactersPrimary;

public class PrimaryWeapon extends Weapon{


    public PrimaryWeapon() {
    }

    public PrimaryWeapon(Characters characters) {
        super(characters);
    }


    public Attack attack() {
        CharactersPrimary charactersPrimary = (CharactersPrimary) super.getCharacters();
        Attack attack = new PrimaryAttack(charactersPrimary.getDamageList(),charactersPrimary.getCriticalMultiplier(),
                charactersPrimary.getCriticalChance(), charactersPrimary.getStatusChance(),charactersPrimary.getMultiShot());

        return attack;
    }
}
