package semestr1.practice8;

public class Weapon {
    private String title;
    private int baseDamage;

    public Weapon(String title,int baseDamage){
        this.title = title;
        this.baseDamage = baseDamage;
    }
    public int calculateDamage(){
        return baseDamage;
    }
    @Override
    public String toString() {
        return "Weapon: " + title +
                ", Physical damage: " + calculateDamage();
    }
}
