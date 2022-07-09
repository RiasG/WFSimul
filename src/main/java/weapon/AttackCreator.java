package weapon;

import weapon.attacks.Attack;
import weapon.characters.Characters;

public interface AttackCreator {
    Attack mainAttack (Characters characters);


}
