package weapon;

import java.util.LinkedList;

public class DamageCharacter {

    private LinkedList<Damage> damageList;



    public DamageCharacter(LinkedList<Damage> damageList) {
        this.damageList = damageList;
    }



    public LinkedList<Damage> getDamageList() {
        return damageList;
    }

    public void setDamageList(LinkedList<Damage> damageList) {
        this.damageList = damageList;
    }
}
