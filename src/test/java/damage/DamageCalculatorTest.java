package damage;

import org.junit.Test;

import static damage.DamageCalculator.calculateCritDamage;
import static damage.DamageCalculator.calculateDamageList;
import static org.junit.Assert.*;

public class DamageCalculatorTest {


    @Test
    public void testCalculate() {
        double cChance = 0.5;
        double cMult = 1.5;
        System.out.println(calculateCritDamage(cChance,cMult));
        System.out.println(cChance + " "+ cMult);

        DamageList damageList = new DamageList();
        damageList.add(new Damage(40,DamageType.VIRAL));
        damageList.add(new Damage(10,DamageType.RADIATION));
        damageList.add(new Damage(25,DamageType.COLD));

        for (Damage d:damageList) {
            System.out.println(d.getAmountDamage() +  " " + d.getDamageType().name());

        }
        damageList = calculateDamageList(damageList,cChance,cMult);

        for (Damage d:damageList) {
            System.out.println(d.getAmountDamage() +  " " + d.getDamageType().name());

        }

    }
}