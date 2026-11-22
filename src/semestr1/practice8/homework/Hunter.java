package semestr1.practice8.homework;

public class Hunter extends DungeonEntity{
    private char rank;
    protected int mana;
    protected int maxMana;
    public Hunter(String name, int level, int hp, int maxHp,
                  int baseAttack, int defense, char rank, int maxMana) {
        super(name, level, hp, maxHp, baseAttack, defense);
        this.rank = rank;
        this.maxMana = maxMana;
        this.mana = maxMana;
    }
    public int useManaSkill(String skillName, int manaCost, double multiplier) {
        if (mana >= manaCost) {
            mana -= manaCost;
            System.out.println(getName() + " використовується ранг: " + skillName);
            return (int) (performAttack() * multiplier);
        } else {
            System.out.println("не вистачає мани!");
            return performAttack();
        }
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Rank: " + rank +
                ", Mana: [" + "█".repeat((int) ((double) mana / maxMana * 10)) +
                "░".repeat(10 - (int) ((double) mana / maxMana * 10)) +
                "] " + mana + "/" + maxMana;
    }
}
