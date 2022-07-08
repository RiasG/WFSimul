package weapon;

public class MeleeWeapon extends Weapon{
    public MeleeWeapon(String name, Characters characters) {
        super(name, characters);
    }

    @Override
    public Attack oneAttack() {
        return null;
    }
}
