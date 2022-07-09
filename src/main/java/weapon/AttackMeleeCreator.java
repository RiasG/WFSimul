package weapon;

public  interface AttackMeleeCreator extends AttackCreator{
    @Override
    public Attack mainAttack(Characters characters);

    public abstract Attack secondaryAttack(Characters characters);
}
