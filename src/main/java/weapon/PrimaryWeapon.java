package weapon;

public class PrimaryWeapon extends Weapon{



    public PrimaryWeapon(String name, Characters characters) {
        super(name, characters);
    }

    @Override
    public Attack oneAttack(){
        AttackCreator attackCreator = new AttackPrimaryCreator();
        return attackCreator.createAttack(this.getCharacters());
    }

    @Override
    public String toString() {
        return "PrimaryWeapon{" +
                "attackCreator=" +
                '}';
    }
}
