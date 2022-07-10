
import weapon.*;
import weapon.attacks.Attack;
import weapon.attacks.PrimaryAttack;
import weapon.characters.Characters;
import weapon.characters.CharactersMelee;
import weapon.characters.CharactersPrimary;


public class Main {
    public static void main(String[] args) {
        Characters characters = new CharactersPrimary("Karak", 2,45, new DamageList(), 0.3,2,0.4,
                NoiseLevel.NOISE, 1,0.5,30,500);
        characters.getDamageList().add(new Damage(23,DamageType.CORROSIVE));
        Weapon weapon = new PrimaryWeapon(characters);


        System.out.println(weapon.attack());
        Attack attack = weapon.attack();

        System.out.println(attack.getAttackDamageList().getFirst().getDamageType());
        System.out.println(((PrimaryAttack)attack).getMultiShot());

        Characters charactersMelee = new CharactersMelee(3);
        charactersMelee.setDamageList(new DamageList());
        charactersMelee.getDamageList().add(new Damage(33,DamageType.GAS));
        Weapon meleeWeapon = new MeleeWeapon(charactersMelee);

        ((CharactersMelee)meleeWeapon.getCharacters()).getRadialAttackDamage();
        System.out.println(((CharactersMelee) charactersMelee).getHeavyDamageList().getFirst().getDamageType().name());
        System.out.println(((CharactersMelee) charactersMelee).getHeavyDamageList().getFirst().getAmountDamage());
        System.out.println((charactersMelee).getDamageList().getFirst().getAmountDamage());
        System.out.println((charactersMelee).getDamageList().getFirst().getDamageType().name());
        System.out.println(meleeWeapon.attack().getAttackDamageList().getFirst().getDamageType());


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
