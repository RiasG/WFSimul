package weapon;

public class AttackMeleeCreator implements AttackCreator {
    @Override
    public Attack createAttack(Characters characters) {
        Attack attack = new AttackMelee();
        return null;
    }
}
