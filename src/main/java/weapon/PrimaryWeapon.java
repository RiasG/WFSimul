package weapon;

public class PrimaryWeapon extends Weapon{


    public PrimaryWeapon() {
    }

    public PrimaryWeapon(Characters characters) {
        super(characters);
    }



    public Attack mainAttack() {
        CharactersPrimary charactersPrimary = (CharactersPrimary) super.getCharacters();
        Attack attack = new AttackPrimary(charactersPrimary.getDamageList(),charactersPrimary.getCriticalMultiplier(),
                charactersPrimary.getCriticalChance(), charactersPrimary.getStatusChance(),charactersPrimary.getMultiShot());

        return attack;
    }
}
