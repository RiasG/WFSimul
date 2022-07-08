package weapon;

public abstract class Weapon {
    private String name;
    private Characters characters;


    public Weapon(String name, Characters characters) {
        this.name = name;
        this.characters = characters;


    }


    public abstract Attack oneAttack();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Characters getCharacters() {
        return characters;
    }

    public void setCharacters(Characters characters) {
        this.characters = characters;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", characters=" + characters +
                '}';
    }

    protected void setAttack(AttackCreator attackCreator) {

    }
}
