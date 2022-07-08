package weapon;

public class PrimaryWeapon extends Weapon{

    public PrimaryWeapon(Characters characters) {
        super(characters);
    }

    @Override
    public Attack oneAttack(){
        CharactersPrimary charactersPrimary = (CharactersPrimary) super.getCharacters();
        Attack attack = new AttackPrimary(charactersPrimary.getDamageList(),charactersPrimary.getCriticalMultiplier(),
                charactersPrimary.getCriticalChance(), charactersPrimary.getStatusChance(),charactersPrimary.getMultiShot());

        return attack;
    }

}
