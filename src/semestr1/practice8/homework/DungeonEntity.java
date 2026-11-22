package semestr1.practice8.homework;

import org.w3c.dom.ls.LSOutput;

public class DungeonEntity {
    private  String name = "Vi";
    private int level = 40;
    protected int hp = 100;
    protected int maxHp = 100;
    protected int baseAttack = 15;
    protected int defense = 5;

    public DungeonEntity (String name,int level,int hp,int maxHp,int baseAttack,int defense){
        if(name == null){
            this.name = "Невідоме імя";}
        else { this.name = name;
        }
        if (level <= 0) {
            this.level = 0;}
        else {this.level = level;
        }
        if (hp <= 0) {
            this.hp = 0;
        } else if (hp > maxHp) {
            this.hp = maxHp;
        } else {
            this.hp = hp;
        }
        if (maxHp <= 0) {
            this.maxHp = 0;}
        else {this.maxHp = maxHp;
        }
        if (baseAttack <= 0) {
            this.baseAttack = 0;
        } else {
            this.baseAttack = baseAttack;
       }
       if(defense <= 0){
           this.defense = 0;}
       else {
           this.defense = defense;
       }


    }
    public String getName(){
        return name;
    }
    public int getlevel() {
        return level;
    }
    public int gethp() {
        return hp;
    }
    public int getmaxHp() {
        return maxHp;
    }
    public int getintbaseAttack() {
        return baseAttack;
    }
    public int getdefense(){
        return defense;
    }
    public int takeDamage(int rawDamage) {

        int actual = Math.max(5, rawDamage - defense);
        hp = Math.max(0, hp - actual);
        return actual;
    }
    public int performAttack() {
        return baseAttack;
    }
    public void levelUp() {
        level++;
    }
    public boolean isAlive(){
        return hp > 0;
    }
    protected String buildHealthBar() {
    int filled = (int)((double)hp / maxHp * 10);
        int empty = 10 - filled;
        return "[" + "█".repeat(filled) +
                "░".repeat(empty) + "]";
    }
    @Override
    public String toString() {
        return "Name: " + name +
                ", Level: " + level +
                ", HP: " + buildHealthBar() + " " + hp + "/" + maxHp +
                ", Attack: " + baseAttack +
                ", Defense: " + defense;
    }
}
