package damage;

import org.junit.Test;
import progect.DamageCalculator;
import progect.damage.Damage;
import progect.damage.DamageList;
import progect.damage.DamageType;
import progect.enemy.Armor;
import progect.enemy.Health;
import progect.weapon.attacks.Attack;
import progect.weapon.attacks.PrimaryAttack;

import javax.crypto.spec.PSource;

import static progect.DamageCalculator.calculateCritMult;
import static progect.DamageCalculator.calculateCriticalDamageList;


public class DamageCalculatorTest {


    @Test
    public void testCalculate() {
        double cChance = 1;
        double cMult = 0.5;
        System.out.println(calculateCritMult(cChance,cMult));
        System.out.println(cChance + " "+ cMult);

        DamageList damageList = new DamageList();
        damageList.add(new Damage(40, DamageType.VIRAL));
        damageList.add(new Damage(10,DamageType.RADIATION));
        damageList.add(new Damage(25,DamageType.COLD));

        for (Damage d:damageList) {
            System.out.println(d.getAmountDamage() +  " " + d.getDamageType().name());

        }
        damageList = calculateCriticalDamageList(damageList,cChance,cMult);

        for (Damage d:damageList) {
            System.out.println(d.getAmountDamage() +  " " + d.getDamageType().name());

        }

        System.out.println(DamageCalculator.calculateMult(3.5));



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
        resistance.add(new Damage(0.5,DamageType.CORROSIVE));

        DamageList dList = new DamageList(damageList);


        double cChance = 0.5;
        double cMult = 2;
        Health health = new Health(1000,weakness,resistance);
        Attack attack = new PrimaryAttack(damageList,cMult,cChance,0.5,3);

        System.out.println(health.getHitPoint());

        DamageCalculator.calculateDamageByHitPoint(health, attack);

        System.out.println(health.getHitPoint());
        for (Damage d: attack.getAttackDamageList()) {
            System.out.println(d.getAmountDamage());

        }
        for (int i = 0; i < damageList.size(); i++)
            health.takeDamage(damageList.get(i).getAmountDamage());
        System.out.println(health.getHitPoint());
    }

    @Test
    public void testCalculateArmorResist(){
        DamageList damageList = new DamageList();
        damageList.add(new Damage(100, DamageType.VIRAL));
        damageList.add(new Damage(100,DamageType.SLASH));
        damageList.add(new Damage(100,DamageType.CORROSIVE));


        DamageList weakness = new DamageList();
        DamageList resistance = new DamageList();
        weakness.add(new Damage(0.25, DamageType.VIRAL));
        weakness.add(new Damage(0.5,DamageType.CORROSIVE));
        resistance.add(new Damage(0.5,DamageType.RADIATION));
        resistance.add(new Damage(0.5,DamageType.SLASH));

        Armor armor = new Armor(1000, weakness,resistance);
        System.out.println(DamageCalculator.calculateArmorResist(armor));
        damageList = DamageCalculator.calculateDamageBeforeArmResist(damageList,armor);

        for (Damage d: damageList) {
            System.out.println(d.getAmountDamage());
        }

    }
}