package semestr1.practice8.homework;

public class DungeonBoss extends DungeonEntity {
    private String bossTitle = "Адам Смешер";
    private boolean enraged;

    public DungeonBoss(String name, int level, int hp, int maxHp, int baseAttack, int defense, String bossTitle, boolean enraged) {
        super(name, level, hp, maxHp, baseAttack, defense);
        this.bossTitle = bossTitle;
    }

    @Override
    public int takeDamage(int rawDamage) {
        int damage = super.takeDamage(rawDamage);
        if (hp > 0 && hp <= maxHp * 0.4 && !enraged) {
            enraged = true;
            System.out.println("БОС ВПАДАЄ У ФАЗУ ЛЮТІ!");
            System.out.println("Атака зросла на 50%!");
        }
        return damage;
    }
    @Override
    public int performAttack() {

        if (enraged) {
            return (int) (super.performAttack() * 1.5);
        } else {
            return super.performAttack();
        }
    }
}





