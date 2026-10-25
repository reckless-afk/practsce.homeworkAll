package semestr1.practice2.homework;

public class Task5RpgHero {
   public static void main(String[] args) {
        int randomNum = (int) (Math.random() * (18- 8 + 1)) + 8;
        int strength = randomNum; //(Сила)
        int agility = randomNum; //(Спритність)
        int intelligence = randomNum; //(Інтелект)
        int hp = strength * 10 + agility * 2;
        int mp = intelligence * 15;
        int Armor = agility / 2;
        int dice1 = (int)(Math.random() * 6) + 1;
        int dice2 = (int)(Math.random() * 6) + 1;
        int playerAttack =  dice1 + dice2 + strength;
        final int MONSTER_ATTACK = 22;
        boolean isPlayerVictory = playerAttack > MONSTER_ATTACK;

        System.out.println("/**************************************************\\\n" +
                "|                 ПАСПОРТ ГЕРОЯ RPG                |\n" +
                "\\**************************************************/");
        System.out.println("Ім'я персонажа: " + "           Азамат Таджик");
        System.out.println("Клас: " + "                     Барига");
        System.out.println();
        System.out.println("[ХАРАКТЕРИСТИКИ]");
        System.out.println("Сила (STR): " +                 strength);
        System.out.println("Спритність (AGI): " +           agility);
        System.out.println("Інтелект (INT): " +             intelligence);
        System.out.println();
        System.out.println("[ПОХІДНІ АТРИБУТИ]");
        System.out.println("Очки здоров'я (HP): " +         hp);
        System.out.println("Очки мани (MP): " +             mp);
        System.out.println("Клас броні (Armor): " +         Armor);
        System.out.println();
        System.out.println("[СИМУЛЯЦІЯ БОЮ]");
        System.out.println("Кидок кубиків гравця: " +         dice1 + " + " + dice2 + " (бонус сили: +" + strength + ")");
        System.out.println("Загальна атака гравця: " +             playerAttack);
        System.out.println("Сила удару пракурора: " +         MONSTER_ATTACK );
        System.out.println("Чи переміг гравець? " + isPlayerVictory);
        System.out.println("\\**************************************************/");
    }
}
