package damage;

import org.junit.Test;
import progect.DamageCalculator;
import progect.damage.Damage;
import progect.damage.DamageList;
import progect.damage.DamageType;
import progect.enemy.AlloyArmor;
import progect.weapon.attacks.HeavyAttackMelee;

import static progect.DamageCalculator.calculateCritDamage;
import static progect.DamageCalculator.calculateDamageList;


public class DamageCalculatorTest {


    @Test
    public void testCalculate() {
        double cChance = 1.7;
        double cMult = 1.5;
        System.out.println(calculateCritDamage(cChance,cMult));
        System.out.println(cChance + " "+ cMult);

        DamageList damageList = new DamageList();
        damageList.add(new Damage(40, DamageType.VIRAL));
        damageList.add(new Damage(10,DamageType.RADIATION));
        damageList.add(new Damage(25,DamageType.COLD));

        for (Damage d:damageList) {
            System.out.println(d.getAmountDamage() +  " " + d.getDamageType().name());

        }
        damageList = calculateDamageList(damageList,cChance,cMult);


        for (Damage d:damageList) {
            System.out.println(d.getAmountDamage() +  " " + d.getDamageType().name());

        }

        //DamageCalculator.calculateDamageOnHitPoint(new AlloyArmor(),new HeavyAttackMelee());



    }

    @Test
    public void testCalculateWeaknessResist(){
        DamageList damageList = new DamageList();
        damageList.add(new Damage(40, DamageType.VIRAL));
        damageList.add(new Damage(10,DamageType.RADIATION));
        damageList.add(new Damage(25,DamageType.COLD));
        damageList.add(new Damage(100,DamageType.CORROSIVE));
        damageList.add(new Damage(80,DamageType.TOXIC));

        DamageList weakness = new DamageList();
        DamageList resistance = new DamageList();
        weakness.add(new Damage(0.5, DamageType.VIRAL));
        weakness.add(new Damage(0.25,DamageType.ELECTRICITY));
        resistance.add(new Damage(0.75,DamageType.COLD));
        resistance.add(new Damage(0.5,DamageType.RADIATION));

        DamageCalculator.calculateWeaknessResistance(damageList,weakness,resistance);

        //TODO с первого раза (easy)
        for (Damage d:damageList) {
            System.out.println(d.getAmountDamage() +  " " + d.getDamageType().name());
        }
    }
}