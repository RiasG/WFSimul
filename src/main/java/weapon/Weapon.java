package weapon;

public abstract class Weapon {
    private String name;
    private Characters characters;



    public Weapon(String name, Characters characters) {
        this.name = name;
        this.characters = characters;
    }


//    public DamageCharacter oneAttack(){
//        DamageCharacter d = characters.getDamageList();
//
//        d.getDamageList()
//
//        return d;
//    }

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
}
