
import weapon.*;



public class Main {
    public static void main(String[] args) {
        Characters characters = new CharactersPrimary("Karak", 2,45, new DamageList(), 0.3,2,0.4,
                NoiseLevel.NOISE, 1,0.5,30,500);
        characters.getDamageList().add(new Damage(23,DamageType.CORROSIVE));
        Weapon weapon = new PrimaryWeapon(characters);


        System.out.println(weapon.mainAttack());
        Attack attack = weapon.mainAttack();

        System.out.println(attack.getDamageList().getFirst().getDamageType());
        System.out.println(((AttackPrimary)attack).getMultiShot());

        //DamageList damageList = new DamageList();

//        damageList.add(new Damage(233,DamageType.BLAST));
//        damageList.add(new Damage(11,DamageType.CORROSIVE));
//        System.out.println(damageList);
//        for (Damage d: damageList) {
//            System.out.println(d.getDamageType());
//
//        }






    }
}
