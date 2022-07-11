package enemy;

public class Enemy {
    private Health enemyHealth;
    private Shield enemyShield;
    private int enemyLevel;


    public Enemy(Health enemyHealth, int enemyLevel) {
        this.enemyHealth = enemyHealth;
        this.enemyLevel = enemyLevel;
    }

    public Enemy(Health enemyHealth, Shield enemyShield, int enemyLevel) {
        this.enemyHealth = enemyHealth;
        this.enemyShield = enemyShield;
        this.enemyLevel = enemyLevel;
    }


}
