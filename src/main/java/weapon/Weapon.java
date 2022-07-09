package weapon;

import weapon.attacks.Attack;
import weapon.characters.Characters;

public abstract class Weapon {

    private Characters characters;

    public Weapon() {
    }

    public Weapon(Characters characters) {
        this.characters = characters;
    }

    public abstract Attack mainAttack();



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
