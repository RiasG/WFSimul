package enemy;

import damage.DamageList;

public class EnemyLifeBar {
    private Health health;
    private Armor armor;
    private Shield shield;

    public EnemyLifeBar(Health health, Armor armor, Shield shield) {
        this.health = health;
        this.armor = armor;
        this.shield = shield;
    }

    public void takeDamage(DamageList damageList){

    }

}
