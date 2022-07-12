package progect.enemy;

import progect.damage.DamageList;

public class EnemyLifeCondition {
    private Health health;
    private Armor armor;
    private Shield shield;

    public EnemyLifeCondition(Health health, Armor armor, Shield shield) {
        this.health = health;
        this.armor = armor;
        this.shield = shield;
    }

    public void takeDamage(DamageList damageList){

    }

}
