package Weapon;

import java.util.LinkedList;



public class CharactersMelee extends Characters{

    private int blockAngle;
    private int comboDuration;
    private double followThrough;
    private NoiseLevel noiseLevel;


    public CharactersMelee(double attackSpeed, LinkedList<Damage> damageList, double criticalChance,
                           double criticalMultiplier, double statusChance) {
        super(attackSpeed, damageList, criticalChance, criticalMultiplier, statusChance);
    }
}
