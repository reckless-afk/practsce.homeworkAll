package semestr1.practice3.homework;

import java.util.Scanner;

public class Task5InteractiveQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("   ВТЕЧА З ВІЙСЬКОГО ТРИБУНАЛУ");
        System.out.println("==============================");
        System.out.println("Ведіть ім'я герою: ");
        String name = scanner.nextLine();
        System.out.println("Виберіть клас від 1 до 3: ");
        System.out.println("1 — Воїн(HP: 120, Сила: 15, Мана: 10, Спритність: 8)");
        System.out.println("2 — Маг(HP: 75, Сила: 6, Мана: 50, Спритність: 10)");
        System.out.println("3 — Розбійник(HP: 90, Сила: 10, Мана: 15, Спритність: 18)");
        int choice = scanner.nextInt();
        String heroClass;
        int hp;
        int strength;
        int mana;
        int agility;
        boolean hasSpellBook;
        boolean escapedObstacle = false;
        switch (choice) {
            case 1: {
                heroClass = "Воїн";
                hp = 120;
                strength = 15;
                mana = 10;
                agility = 8;
                hasSpellBook = false;
                break;
            }
            case 2: {
                heroClass = "Маг";
                hp = 75;
                strength = 6;
                mana = 50;
                agility = 10;
                hasSpellBook = true;
                break;
            }
            case 3: {
                heroClass = "Розбійник";
                hp = 90;
                strength = 10;
                mana = 15;
                agility = 18;
                hasSpellBook = false;
                break;
            }
            default: {
                heroClass = "Волоцюга";
                hp = 60;
                strength = 8;
                mana = 5;
                agility = 8;
                hasSpellBook = false;
                break;
            }
        }
        System.out.println("Ви опинились перед трьома дорогами, куди ви підте?: ");
        System.out.println("північ");
        System.out.println("схід");
        System.out.println("захід");
        String side = scanner.next();
        switch (side) {
            case "північ": {
                System.out.println("Ви потрапили до кімнати загадок!");
                System.out.println("*напис на стіні* У якого верблюда є три горба?");
                scanner.nextLine();
                String ansver = scanner.nextLine();

                boolean isCorrect = ansver.equalsIgnoreCase("У вагітного");
                hp = isCorrect ? hp + 20 : hp - 30;

                if (isCorrect) {
                    System.out.println("Правильно! КАСАВЧІК, +20 HP");
                } else {
                    System.out.println("Неправильно! Тю, -30 HP");
                }
                break;
            }

            case "схід": {
                System.out.println("Ви потрапили до арсеналу!");
                System.out.println("Ви повинні взяти зброю. Є важкий сталевий меч(+ 10 урон), яким ви не вмієте користуватись, через це ви втрачаете 5HP." +
                        " А є кінжал, який дає меньше урона, але дає +5 спритності");
                System.out.println("Меч");
                System.out.println("Кинжал");
                String weapon = scanner.next().toLowerCase();
                switch (weapon) {
                    case "меч": {
                        hp = hp - 5;
                        strength = strength + 10;
                        System.out.println("Ви порізались! Ваше здоров'я: " + hp + "Але ваша атака збільшилась на 10!" + strength);
                        break;
                    }
                    case "кинжал": {
                        agility = agility + 5;
                        System.out.println("Ваша спритність збільшилась на: " + agility + "!");
                        break;
                    }
                    default: {
                        System.out.println("Ви не вибрали доступну зброю!");
                        break;
                    }


                }
                System.out.println("У кутку стоїть зачинена скриня.");
                System.out.println("Ви намагаєтеся її відкрити...");
                if (agility >= 16 || (mana >= 25 && hasSpellBook)) {
                    System.out.println("Вам вдалося відкрити скриню!");
                    System.out.println("Усередині лежить старий документ із таємницею втечі.");
                    escapedObstacle = true;
                } else {
                    System.out.println("Пастка! Ви втратили 25 HP.");
                    hp = hp - 25;
                }
                break;
            }

            case "захід": {
                System.out.println("Ви зустріли Голума");
                System.out.println("що ви оберете: 1. Лобова атака; 2. Магічний бар'єр; 3 — Прослизнути повз Голума.");
                int ansver1 = scanner.nextInt();
                switch (ansver1) {
                    case 1: {
                        if (strength >= 12 && mana >= 10 && agility >= 5) {
                            System.out.println("Ви перемогли Голума!");
                            escapedObstacle = true;
                        } else {
                            System.out.println("Вам не вистачило характеристик!");
                            hp = hp - 30;
                        }
                        break;
                    }
                    case 2: {
                        if (mana >= 20) {
                            System.out.println("Магічний бар'єр зупинив Голума!");
                            mana = mana - 10;
                            escapedObstacle = true;
                        } else {
                            System.out.println("Недостатньо мани!");
                            hp = hp - 30;
                        }
                        break;
                    }
                    case 3 : {
                        if(agility >= 15){
                            System.out.println("Ви прослизнули повз голома!");
                            escapedObstacle = true;}
                        else {
                            System.out.println("Вам не вдалося провскознути повз голома");
                            hp = hp - 15;
                        }
                        break;
                    }
                    default: {
                        System.out.println("Ви вибрали неправильну тактику!");
                        break;
                    }

                }
                break;
            }
            default: {
                System.out.println("Такого напрямку немає!");
                break;
            }
            }
        System.out.println();
        System.out.println("================================");
        System.out.println("       ХАРАКТЕРИСТИКИ ГЕРОЯ");
        System.out.println("================================");
                System.out.println("Герой: " + name);
                System.out.println("Клас: " + heroClass);
                System.out.println("HP: " + hp);
                System.out.println("Сила: " + strength);
                System.out.println("Мана: " + mana);
                System.out.println("Спритність: " + agility);
        System.out.println("================================");
        System.out.println("Після важких іспитів ви натикаєтеся на розбійників групи «Зелений слонік».");
        System.out.println("Вони хочуть, щоб ви до кінця часів чистили сортир виделкою,");
        System.out.println("але ви так просто не здаєтеся...");
        System.out.println("Чи вдасться вам вибратися з військового трибуналу?");

        System.out.println();
        if (hp <= 0) {
            System.out.println("ВИ ПРОГРАЛИ!");
            System.out.println("Зелений слонік святкує перемогу. Виделка вже чекає...");
        } else if (escapedObstacle) {
            System.out.println("ВИ ВТЕКЛИ З ВІЙСЬКОВОГО ТРИБУНАЛУ!");
            System.out.println("Вітаємо, " + name + "! Ви здобули свободу!");
        } else {
            System.out.println("Ви вижили, але не подолали перешкоду!");
            System.out.println("Зелений слонік ще не сказав останнього слова...");
        }

        System.out.println("================================");

        scanner.close();
    }

}
