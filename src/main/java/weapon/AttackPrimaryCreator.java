package weapon;

public class AttackPrimaryCreator implements AttackCreator{
    //private Characters characters;
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
    public Attack createAttack(Characters characters1) {
        CharactersPrimary characters = (CharactersPrimary) characters1;
        Attack attack = new AttackPrimary(characters.getDamageList(),characters.getCriticalMultiplier(),
                characters.getCriticalChance(), characters.getStatusChance(),characters.getMultiShot());

        return attack;
    }

}
