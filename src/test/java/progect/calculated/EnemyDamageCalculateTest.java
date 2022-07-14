package progect.calculated;

import org.junit.Test;
import progect.damage.Damage;
import progect.damage.DamageList;
import progect.damage.DamageType;
import progect.enemy.*;
import progect.weapon.attacks.Attack;
import progect.weapon.attacks.PrimaryAttack;

import static org.junit.Assert.*;

public class EnemyDamageCalculateTest {

    @Test
    public void enemyDamageCalculateTest(){
        DamageList damageList = new DamageList();
        damageList.add(new Damage(100, DamageType.VIRAL));
        damageList.add(new Damage(100, DamageType.CORROSIVE));
        damageList.add(new Damage(100, DamageType.RADIATION));
        damageList.add(new Damage(100, DamageType.SLASH));


        DamageList weakResHealth = new DamageList();

        weakResHealth.add(new Damage(-0.75, DamageType.VIRAL));
        weakResHealth.add(new Damage(-0.25, DamageType.SLASH));
        weakResHealth.add(new Damage(0.75, DamageType.GAS));
        weakResHealth.add(new Damage(0.5, DamageType.RADIATION));

        DamageList weakResArmor = new DamageList();

        weakResArmor.add(new Damage(-0.75, DamageType.CORROSIVE));
        weakResArmor.add(new Damage(-0.25, DamageType.COLD));
        weakResArmor.add(new Damage(0.75, DamageType.VIRAL));
        weakResArmor.add(new Damage(0.5, DamageType.SLASH));

        DamageList weakResShield = new DamageList();

        weakResShield.add(new Damage(-0.75, DamageType.MAGNETIC));
        weakResShield.add(new Damage(-0.5, DamageType.COLD));
        weakResShield.add(new Damage(-0.25, DamageType.PUNCTURE));
        weakResShield.add(new Damage(0.5, DamageType.RADIATION));
        weakResShield.add(new Damage(0.25, DamageType.SLASH));


        Health health = new Health(1000, weakResHealth);
        Armor armor = new Armor(900, weakResArmor);
        Shield shield = new Shield(1550,weakResShield);

        EnemyLifeCondition enemyLife = new EnemyLifeCondition(health, armor, shield);

        Attack attack = new PrimaryAttack(damageList,3,0.7,1,2);

        EnemyDamageCalculate.calculateDamageForEnemy(enemyLife,attack);

    }

}