package weapon;

public class AttackPrimaryCreator implements AttackCreator{

    public AttackPrimaryCreator() {
    }
  /*  public boolean isCritical(double critChance, double critMult){
         boolean cr;
         cr = false;
         return cr;
    }
    public int calculateCriticalMult(double critChance, double critMult){
        return 2;
    }

    public boolean isStatus(double statusChance){
        return false;

    }
*/
    public DamageType getDamageWithStatus(DamageList damages){
        return DamageType.BLAST;
    }

    @Override
    public Attack createAttack(Characters characters) {
        CharactersPrimary charactersPrimary = (CharactersPrimary) characters;
        Attack attack = new AttackPrimary(charactersPrimary.getDamageList(),charactersPrimary.getCriticalMultiplier(),
                charactersPrimary.getCriticalChance(), charactersPrimary.getStatusChance(),charactersPrimary.getMultiShot());

        return attack;
    }

}
