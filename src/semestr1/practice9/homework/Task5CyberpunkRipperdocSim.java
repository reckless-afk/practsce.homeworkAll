package semestr1.practice9.homework;

public class Task5CyberpunkRipperdocSim {
    public static void main(String[] args) {
        CyberMercenary david = new CyberMercenary("Девід Мартінес", 120);

        System.out.println("========== КЛІНІКА РІППЕРДОКА ==========");
        System.out.println(david);


        david.installImplant(new SandevistanOs());
        david.installImplant(new MantisBlades());


        david.installImplant(new SandevistanOs());

        david.installImplant(new SubdermalTitaniumArmor());

        System.out.println("\n========== ДОСЬЄ НАЙМАНЦЯ ==========");
        System.out.println(david);


        david.activateImplants();


        david.injectImmunoblockers(30);

        System.out.println("\n========== ПОЧАТОК БОЮ ==========");

        int smasherHp = 2000;

        for (int round = 1; round <= 4; round++) {

            System.out.println("\nРаунд " + round);

            int damage = david.getTotalAttack();
            smasherHp -= damage;

            if (smasherHp < 0) {
                smasherHp = 0;
            }

            System.out.println("Девід завдає " + damage + " шкоди!");
            System.out.println("HP Адама Смешера: " + smasherHp);

            david.takeDamage(150);
            david.endTurn();

            System.out.println(david);

            if (smasherHp == 0) {
                System.out.println("Адам Смешер переможений!");
                break;
            }

            if (!david.isAlive()) {
                System.out.println("Девід Мартінес загинув!");
                break;
            }
        }

        System.out.println("\n========== КІНЕЦЬ БОЮ ==========");
    }
}
