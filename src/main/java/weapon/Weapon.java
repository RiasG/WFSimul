package weapon;

public abstract class Weapon {

    private Characters characters;

    public Weapon( Characters characters) {
        this.characters = characters;
    }

    public abstract Attack oneAttack();



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
