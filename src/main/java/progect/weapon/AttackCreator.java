package progect.weapon;

import progect.weapon.attacks.Attack;
import progect.weapon.exceprions.NullCharactersException;

public interface AttackCreator {
    Attack attack () throws NullCharactersException;


}
