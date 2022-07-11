package weapon;

import weapon.attacks.Attack;
import weapon.characters.Characters;

public abstract class Weapon implements AttackCreator{

    private Characters characters;

    public Weapon() {
    }

    public Weapon(Characters characters) {
        this.characters = characters;
    }

    public abstract Attack attack();


    public Characters getCharacters() {
        return characters;
    }

    public void setCharacters(Characters characters) {
        this.characters = characters;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" +  '\'' +
                ", characters=" + characters +
                '}';
    }

}
