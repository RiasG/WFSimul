package weapon;

public class MeleeWeapon extends Weapon {
    public MeleeWeapon(Characters characters) {
        super(characters);
    }

    public MeleeWeapon() {
    }

    @Override
    public Attack mainAttack() {
        CharactersMelee charactersMelee = (CharactersMelee) super.getCharacters();
        Attack attack = new AttackMelee(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(), charactersMelee.getStatusChance());

        return attack;
    }

    public Attack heavyAttack(){
        return null;
    };


    public Attack secondaryAttack(Characters characters) {
        return null;
    }


    public Attack mainAttack(Characters characters) {
        CharactersMelee charactersMelee = (CharactersMelee) super.getCharacters();
        Attack attack = new AttackMelee(charactersMelee.getDamageList(),charactersMelee.getCriticalMultiplier(),
                charactersMelee.getCriticalChance(),charactersMelee.getStatusChance());
        return attack;
    }


}
