package semestr1.practice6.homework;
import java.util.Scanner;
public class Task5AnimeHeroBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Asta asta = new Asta();
        int patryHp = 1200;

        System.out.println("=== БИТВА АСТИ ПРОТИ ПАТРІ ===");
        while (asta.isAlive() && patryHp > 0){
            System.out.println("\nПатрі HP: " + patryHp + "/1200");
            System.out.println("Оберіть дію:");
            System.out.println("[1] Атака мечем");
            System.out.println("[2] Використати навичку");
            System.out.println("[3] Захисна стійка");
            System.out.println("[4] Показати статус");
            System.out.println("Ваш вибір: ");
            int choice = scanner.nextInt();
            int damage = 0;
            if (choice == 1) {
                damage = asta.basicSwordAttack();
                patryHp = patryHp - damage;
            } else if (choice == 2) {
                System.out.println("Оберіть навичку:");
                System.out.println("[1] Удар Демоноборця — 25 енергії");
                System.out.println("[2] Чорний Ураган — 50 енергії");
                System.out.println("[3] Метеорит Демона — 75 енергії");
                System.out.println("[4] Форма Чорного Демона — 100 енергії");

                int skill = scanner.nextInt();
                damage = asta.useSkill(skill - 1);
                patryHp = patryHp - damage;
            } else if (choice == 3) {
                System.out.println("Аста займає захисну стійку!");
                System.out.println("Цього ходу Патрі не атакує.");
                continue;
            } else if (choice == 4 ){
                asta.showStatus();
                continue;

            } else {
                System.out.println("Невірний вибір!");
                continue;
            }

            if (patryHp < 0) {
                patryHp = 0;
            }

            if (patryHp > 0) {
                System.out.println("\nПатрі атакує магічними променями!");
                asta.takeDamage(100);
            }
        }

        if (asta.isAlive()) {
            System.out.println("\nПеремога! Аста переміг Патрі!");
        } else {
            System.out.println("\nАста програв. Патрі переміг!");
            }
        }



    }

