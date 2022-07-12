package enemy;

import damage.DamageList;
import weapon.attacks.Attack;
import weapon.attacks.PrimaryAttack;

public class Enemy {
   private EnemyLifeBar enemyLifeBar;


   public void takeAttack(Attack attack){
      DamageList damageList = new DamageList();
      if (attack instanceof PrimaryAttack){

      }

   }

}
