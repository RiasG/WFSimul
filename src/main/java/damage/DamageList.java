package damage;

import java.util.Collection;
import java.util.LinkedList;

public class DamageList extends LinkedList<Damage> {

    public DamageList() {
    }

    public DamageList(Collection<? extends Damage> c) {
        super(c);
    }
}
