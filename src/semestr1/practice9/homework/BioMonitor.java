package semestr1.practice9.homework;

public class BioMonitor {
    private int hp;
    private final int maxHp;
    private int humanity = 100;
    private boolean cyberpsychosis = false;


    public BioMonitor(int hp) {
        this.hp = hp;
        this.maxHp = hp;
    }
    public int getHp(){
        return hp;
    }
    public int getMaxHp(){
        return maxHp;
    }
    public int getHumanity(){
        return humanity;
    }
    public boolean getCyberpsychosis(){
        return cyberpsychosis;
    }
    public void reduceHumanity(int cost){
        if( cost > 0){
            humanity = Math.max(0, humanity - cost);
        }
        if(humanity < 20){
            cyberpsychosis = true;
        }
    }
    public void injectImmunoblockers(int restoreAmount){
        if (restoreAmount > 0) {
            humanity = Math.min(100, humanity + restoreAmount);
        }

        if (humanity >= 20) {
            cyberpsychosis = false;
        }
    }

    public int applyDamage(int rawDamage, int totalArmor) {
        int damage = Math.max(5, rawDamage - totalArmor);
        int actualDamage = Math.min(hp, damage);

        hp -= actualDamage;

        return actualDamage;
    }
    @Override public String toString(){
        String hpBar = "";
        String humanityBar = "";

        int filledHp = hp * 10 / maxHp;
        int filledHumanity = humanity / 10;

        for (int i = 0; i < 10; i++) {
            if (i < filledHp) {
                hpBar += "█";
            } else {
                hpBar += "░";
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i < filledHumanity) {
                humanityBar += "█";
            } else {
                humanityBar += "░";
            }
        }

        return "HP: [" + hpBar + "] " + hp + "/" + maxHp
                + "\nHumanity: [" + humanityBar + "] " + humanity
                + "/100"
                + "\nCyberpsychosis: " + cyberpsychosis;
    }
}
