package weapon;

public class Projectile {
    private DamageList damageList;
    private double statusMulti;
    private double critMulti;
    private DamageType damageWithStatus;


    public Projectile(DamageList damageList, double statusMulti, double critMulti, DamageType damageWithStatus) {
        this.damageList = damageList;
        this.statusMulti = statusMulti;
        this.critMulti = critMulti;
        this.damageWithStatus = damageWithStatus;
    }


}
