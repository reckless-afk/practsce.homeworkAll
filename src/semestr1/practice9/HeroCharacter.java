package semestr1.practice9;

public class HeroCharacter {
    private final String nickname;
    private int baseStrength;
    private WeaponItem equippedWeapon;


    public HeroCharacter(String nickname,int baseStrength,WeaponItem equippedWeapon){
        this.nickname = nickname;
        this.baseStrength = baseStrength;
        this.equippedWeapon =  equippedWeapon;
    }
    public void equip(WeaponItem newWeapon){
        this.equippedWeapon = newWeapon;
    }
    public int attack() {
        if (equippedWeapon == null) {
            return baseStrength;
        }

        return baseStrength + equippedWeapon.useWeapon();
    }
}
