package weapon;

import weapon.attacks.Attack;

public  interface AttackMeleeCreator extends AttackCreator{
   Attack attack();
   Attack heavyAttack();
   Attack slamLightAttack();
   Attack slamHeavyAttack();
   Attack radialLightAttack();
   Attack heavyRadialAttack();
   Attack slideAttack();
}
