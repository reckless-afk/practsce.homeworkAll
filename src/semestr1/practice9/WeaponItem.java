package semestr1.practice9;

import semestr1.practice8.Weapon;

public class WeaponItem {
    private final String name;
    private final int bonusDamage;
    private int durability;

    public WeaponItem (String name,int bonusDamage,int durability){
        this.name = name;

        this.bonusDamage = bonusDamage;
        if(durability > 100){
            this.durability = 100;}
        else {
            this.durability = durability;
        }
        if(durability < 0){
            this.durability = 0;}
        else {
            this.durability = durability;
        }

    }
    public int useWeapon(){
        if (durability == 0) {
            return 0;
        }

        durability -= 10;

        if (durability < 0) {
            durability = 0;
        }

        return bonusDamage;
    }

}


