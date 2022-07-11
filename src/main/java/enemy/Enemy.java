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

    public Health getEnemyHealth() {
        return enemyHealth;
    }

    public void setEnemyHealth(Health enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    public Shield getEnemyShield() {
        return enemyShield;
    }

    public void setEnemyShield(Shield enemyShield) {
        this.enemyShield = enemyShield;
    }

    public int getEnemyLevel() {
        return enemyLevel;
    }

    public void setEnemyLevel(int enemyLevel) {
        this.enemyLevel = enemyLevel;
    }
}
