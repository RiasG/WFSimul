package damage;

import org.junit.Test;
import progect.calculated.DamageCalculator;
import progect.damage.Damage;
import progect.damage.DamageList;
import progect.damage.DamageType;
import progect.enemy.Armor;
import progect.enemy.Health;
import progect.enemy.HitPoint;
import progect.enemy.Shield;

import static progect.calculated.DamageCalculator.calculateCritMult;
import static progect.calculated.DamageCalculator.calculateCriticalDamageList;


public class DamageCalculatorTest {


    @Test
    public void testCalculateCrit() {
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
    public void testCalculateHealthDamage() {
        DamageList damageList = new DamageList();
        damageList.add(new Damage(100, DamageType.VIRAL));
        damageList.add(new Damage(100, DamageType.CORROSIVE));
        damageList.add(new Damage(100, DamageType.RADIATION));
        damageList.add(new Damage(100, DamageType.SLASH));


        DamageList weakRes = new DamageList();

        weakRes.add(new Damage(-0.25, DamageType.VIRAL));
        weakRes.add(new Damage(-0.75, DamageType.CORROSIVE));
        weakRes.add(new Damage(0.5, DamageType.RADIATION));
        weakRes.add(new Damage(0.75, DamageType.SLASH));

        Health health = new Health(1000, weakRes);



        DamageList dL = new DamageList(DamageCalculator.calculateHealthDamage(damageList, health));

        for (Damage d: dL) {
            System.out.println(d.getAmountDamage());
        }
        for (Damage d: damageList) {
            System.out.println(d.getAmountDamage());
        }
        for (Damage d: dL) {
            health.takeDamage(d.getAmountDamage());
        }
        System.out.println(health.getHitPoint());

    }

    @Test
    public void testCalculateArmorDamage(){
        DamageList damageList = new DamageList();
        damageList.add(new Damage(100, DamageType.VIRAL));
        damageList.add(new Damage(100,DamageType.CORROSIVE));
        damageList.add(new Damage(100,DamageType.RADIATION));
        damageList.add(new Damage(100,DamageType.SLASH));


        DamageList weakResist = new DamageList();
        weakResist.add(new Damage(-0.25, DamageType.VIRAL));
        weakResist.add(new Damage(-0.75,DamageType.CORROSIVE));
        weakResist.add(new Damage(0.5,DamageType.RADIATION));
        weakResist.add(new Damage(0.75,DamageType.SLASH));

        Armor armor = new Armor(1000, weakResist);

        DamageList dList = new DamageList(DamageCalculator.calculateArmoredDamage(damageList, armor));


        for (Damage d: dList) {
            System.out.println(d.getAmountDamage());
        }
        for (Damage d: damageList) {
            System.out.println(d.getAmountDamage());
        }

        Health health = new Health(1000, new DamageList());
        for (Damage d: dList ) {
            health.takeDamage(d.getAmountDamage());
        }
        System.out.println(health.getHitPoint());






    }
}