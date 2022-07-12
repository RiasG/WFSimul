package progect.enemy;

import progect.damage.DamageList;
import progect.weapon.attacks.Attack;
import progect.weapon.attacks.PrimaryAttack;

public class Enemy {

   private EnemyLifeCondition enemyLifeCondition;

   public Enemy(EnemyLifeCondition enemyLifeCondition) {
      this.enemyLifeCondition = enemyLifeCondition;
   }

   public EnemyLifeCondition getEnemyLifeBar() {
      return enemyLifeCondition;
   }

   public void setEnemyLifeBar(EnemyLifeCondition enemyLifeCondition) {
      this.enemyLifeCondition = enemyLifeCondition;
   }

   public void takeAttack(Attack attack){
      DamageList damageList = new DamageList();
      if (attack instanceof PrimaryAttack){

      }

   }

}
