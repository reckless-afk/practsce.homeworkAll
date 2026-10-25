package semestr1.practice4.homework;

import java.util.Scanner;

public class Task5BrawlStarsArena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String heroClass;
        int maxPlayerHp;
        int playerHp;
        int attack;
        int superduper;
        int superCharge = 0;
        int ammo = 3;
        int bossHp = 10000;
        int bossMaxHp = 10000;
        int bossAtack = 700;
        int course = 1;
        int powerCubes = 0;
        boolean bossWeakened = false;
        boolean bossStunned = false;

        System.out.println("======================================================\n" +
                "           ⭐ BRAWL STARS: BOSS FIGHT ⭐\n" +
                "======================================================");
        System.out.println("Ласкаво просимо до гри Brawl Stars ");
        System.out.println("Оберіть свого бійця: ");
        System.out.println(" Шеллі (Shelly)     - HP: 4000 | Атака: 1200 | Супер: 2800");
        System.out.println("Кольт (Colt)       - HP: 3000 | Атака: 1600 | Супер: 3600");
        System.out.println("Ель Прімо (Primo)  - HP: 6000 | Атака: 1100 | Супер: 2200");
        int version = scanner.nextInt();
        System.out.println("Ваш вибір (1-3): " + version);
        switch (version) {
            case 1: {
                heroClass = "Шеллі";
                playerHp = 4000;
                maxPlayerHp = 4000;
                attack = 1200;
                superduper = 2800;
                break;
            }
            case 2: {
                heroClass = "Кольт";
                playerHp = 3000;
                maxPlayerHp = 3000;
                attack = 1600;
                superduper = 3600;
                break;
            }
            case 3: {
                heroClass = "Ель Прімо";
                playerHp = 6000;
                maxPlayerHp = 6000;
                attack = 1100;
                superduper = 2200;
                break;
            }
            default: {
                System.out.println("Невідомий бравлер");
                scanner.close();
                return;
            }
        }
        System.out.println("Ви обрали бійця: " + heroClass + "! Бій починається!");
        System.out.println();
        while (playerHp > 0 && bossHp > 0) {


            System.out.println("---------------- РАУНД " + course + " ----------------");
            int hpPercent = (int) ((double) playerHp / maxPlayerHp * 100);
            int bars = (int) ((double) playerHp / maxPlayerHp * 10);
            System.out.print("[" + heroClass + "] HP: [");
            for (int i = 0; i < bars; i++) {
                System.out.print("█");
            }
            for (int i = bars; i < 10; i++) {
                System.out.print("░");
            }
            System.out.println("] " + playerHp + "/" + maxPlayerHp
                    + " | " + hpPercent + "% | Набої: " + ammo + "/3");
            int superBars = (int) ((double) superCharge / 100 * 10);
            if (superBars > 10) {
                superBars = 10;
            }


            System.out.print("Супер: [");
            for (int i = 0; i < superBars; i++) {
                System.out.print("█");
            }
            for (int i = superBars; i < 10; i++) {
                System.out.print("░");
            }
            System.out.print("] " + superCharge + "%");
            if (superCharge >= 100) {
                System.out.print(" (ГОТОВИЙ!)");
            }
            System.out.println();


            int bossDamage = 700;
            int bossPercent = (int) ((double) bossHp / bossMaxHp * 100);
            String bossPhase;
            if (bossPercent > 60) {
                bossPhase = "СПОКІЙНИЙ";
            } else if (bossPercent >= 30) {
                bossDamage = (int) (bossAtack * 1.3);
                bossPhase = "ANGRY! (+30% атаки)";
            } else {
                bossDamage = (int) (bossAtack * 1.7);
                bossPhase = "ENRAGED / GOD MODE (+70% атаки)";
            }

            int bossBars = (int) ((double) bossHp / bossMaxHp * 10);
            System.out.print("[Робо-Бос] HP: [");
            for (int i = 0; i < bossBars; i++) {
                System.out.print("█");
            }
            for (int i = bossBars; i < 10; i++) {
                System.out.print("░");
            }
            System.out.println("] " + bossHp + "/" + bossMaxHp
                    + " | Фаза: " + bossPhase);
            System.out.println("Куби підсилення: " + powerCubes
                    + " шт. (+" + (powerCubes * 15) + "% до атаки)");
            System.out.println();

            System.out.println();
            System.out.println("1 - Основна атака");
            System.out.println("2 - Супер");
            System.out.println("3 - Захист і перезарядка");
            System.out.println("4 - Пошук енергетичного куба");

            System.out.println("Твій хід: ");

            int choice = scanner.nextInt();

            if (choice < 1 || choice > 4) {
                System.out.println("Невірний вибір! Спробуйте ще раз.");
                continue;
            }
            switch (choice) {
                case 1: {
                    if (ammo > 0) {
                        int damage = (int) (attack * (1 + powerCubes * 0.15));
                        bossHp = bossHp - attack;
                        ammo--;

                        superCharge += 35;

                        if (superCharge >= 100) {
                            superCharge = 100;
                            System.out.println("СУПЕРЗДІБНІСТЬ ЗАРЯДЖЕНА!");
                        }

                        System.out.println("Ти атакував боса! Завдано " + damage + " шкоди!");
                    } else {
                        System.out.println("Немає набоїв! Хід втрачено.");
                    }
                    break;

                }
                case 2: {
                    if (superCharge == 100) {
                        bossHp = bossHp - superduper;
                        System.out.println("СУПЕР-АТАКА!");
                        System.out.println("Ти атакував боса! Завдано " + superduper + " шкоди!");
                        superCharge = 0;
                    } else {
                        System.out.println("Ульта ще не заряджана");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Ти починаєш маневр!");
                    if (ammo < 3) {
                        ammo = ammo + 2;
                        if (ammo > 3) {
                            ammo = 3;
                        }
                    }
                    int heal = (int) (maxPlayerHp * 0.15);
                    playerHp = playerHp + heal;

                    if (playerHp > maxPlayerHp) {
                        playerHp = maxPlayerHp;
                    }
                    System.out.println("Відновлено HP: " + playerHp);
                    System.out.println("Набої: " + ammo + "/3");
                    break;
                }
                case 4: {
                    System.out.println("Шукаємо енергетичний куб...");
                    if (Math.random() < 0.6) {
                        System.out.println("Ти знайшов енергетичний куб!");
                        powerCubes++;
                    } else {
                        System.out.println("Куб не знайдено");
                        break;
                    }
                }


                if (bossHp <= 0) {
                    break;
                }

                System.out.println();
                System.out.println("Хід Боса");

                if (bossStunned) {
                    System.out.println("Робо-Бос оглушений і пропускає хід!");
                    bossStunned = false;
                } else {
                    int damage = bossDamage;

                    if (bossWeakened) {
                        damage = (int) (damage * 0.5);
                        bossWeakened = false;
                    }

                    if (Math.random() < 0.15) {
                        System.out.println(heroClass + " спритно ухиляється від удару!");
                    } else {
                        playerHp = playerHp - damage;

                        System.out.println("Робо-Бос атакує! " + heroClass
                                + " отримує " + damage + " шкоди!");

                        if (playerHp < 0) {
                            playerHp = 0;
                        }
                    }
                }

                ammo++;

                if (ammo > 3) {
                    ammo = 3;
                }

                course++;

            }


            System.out.println();
            System.out.println("======================================================");

            if (bossHp <= 0) {
                System.out.println("🏆 ПЕРЕМОГА! РОБО-БОСА ЗНИЩЕНО!");
                System.out.println("Раундів зіграно: " + course);
                System.out.println("Зібрано Power Cubes: " + powerCubes + " шт.");
                System.out.println("Нагорода: +10 Трофеїв 🏆, 100 Starr Drops!");
                System.out.println("Ви — Зірковий Гравець!");
            } else {
                System.out.println("💀 ПОРАЗКА! Твого бійця переможено!");
                System.out.println("Сейф арени під загрозою!");
                System.out.println("Спробуй обрати витривалішого бійця — Ель Прімо!");
                System.out.println("Раундів зіграно: " + course);
            }

            System.out.println("======================================================");

            scanner.close();

        }
    }
}





