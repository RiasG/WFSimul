package weapon;

public class ProjectileCreator extends AttackCreator{
    private CharactersPrimary characters;

    public ProjectileCreator() {

    }

    public boolean isCritical(double critChance, double critMult){
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

    public DamageType getDamageWithStatus(DamageList damages){
        return DamageType.BLAST;
    }


    private Projectile createProjectile() {
        Projectile p = new Projectile();
        characters = (CharactersPrimary)super.getCharacters();

        p.setDamageList(characters.getDamageList());
        p.setCritMulti(characters.getCriticalMultiplier());
        p.setCritChance(characters.getCriticalChance());
        p.setStatusChance(characters.getStatusChance());

        return p;

        /*if (isCritical(characters.getCriticalChance(), characters.getCriticalMultiplier()))  {
            p.setCritMulti(calculateCriticalMult(characters.getCriticalChance(), characters.getCriticalMultiplier()));

        }else p.setCritMulti(1);

        if(isStatus(characters.getStatusChance())){
            p.se);


        }
*/

    }



}
