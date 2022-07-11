package weapon;

import weapon.attacks.Attack;
import weapon.characters.Characters;

public  interface AttackMeleeCreator extends AttackCreator{
   Attack attack();

   Attack heavyAttack();
   Attack slamLightAttack();

   Attack slamHeavyAttack();
   Attack radialLightAttack();
   Attack heavyRadialLightAttack();
   Attack slideAttack();
}
