import weapon.*;

public class Main {
    public static void main(String[] args) {
        Weapon weapon = new PrimaryWeapon("asd", new CharactersPrimary(14, new Damage(23.0, DamageType.BLAST),
                21,2.2,0.3,2));

        System.out.println(weapon.getCharacters().getDamageList().getDamageType());


    }
}
