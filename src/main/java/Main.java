import weapon.*;



public class Main {
    public static void main(String[] args) {
        DamageList damageList = new DamageList();

        damageList.add(new Damage(233,DamageType.BLAST));
        damageList.add(new Damage(11,DamageType.CORROSIVE));
        System.out.println(damageList);
        for (Damage d: damageList) {
            System.out.println(d.getDamageType());

        }







    }
}
