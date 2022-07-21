package progect.enemy;

import progect.damage.DamageList;
import progect.weapon.attacks.Attack;
import progect.weapon.attacks.PrimaryAttack;

public class Enemy {
   private EnemyLifeCondition enemyLifeCondition;
   private int enemyLevel;

   public Enemy() {
   }


   public Enemy(EnemyLifeCondition enemyLifeCondition, int enemyLevel) {
      this.enemyLifeCondition = enemyLifeCondition;
      this.enemyLevel = enemyLevel;
   }

   public Enemy(EnemyLifeCondition enemyLifeCondition) {
      this.enemyLifeCondition = enemyLifeCondition;
   }

   public EnemyLifeCondition getEnemyLifeBar() {
      return enemyLifeCondition;
   }

   public void setEnemyLifeCondition(EnemyLifeCondition enemyLifeCondition) {
      this.enemyLifeCondition = enemyLifeCondition;
   }

   public void takeAttack(Attack attack){
      DamageList damageList = new DamageList();
      if (attack instanceof PrimaryAttack){
         damageList = attack.getAttackDamageList();


      }

   }

}
