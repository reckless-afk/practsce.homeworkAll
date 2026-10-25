package semestr1.practice6.homework;

public class Asta {
    private String name = "Аста";
    private int hp = 1000;
    private int maxHp = 1000;
    private int antiMagicEnergy = 0;
    private int baseAttack = 120;
    private int defense = 35;
    private boolean isBlackFormActive = false;
    private boolean limitsUsed = false;
    private String[] skills = {"Удар Демоноборця", "Чорний Ураган",
            "Метеорит Демона", "Форма Чорного Демона"
    };

    public void showStatus() {
        int hpProcent = hp * 100 / maxHp;
        int filled = hp * 10 / maxHp;
        for (int i = 0; i < 10; i++) {
            if (i < filled) {
                System.out.print("█");
            } else {
                System.out.print(".");
            }
        }
        System.out.println(name);
        System.out.println("] " + hpProcent + "% (" + hp + "/" + maxHp + ")");
        for (int i = 0; i < 10; i++) {
            if (i < antiMagicEnergy / 10) {
                System.out.print("█");
            } else {
                System.out.print(".");
            }
        }
        System.out.println("] " + antiMagicEnergy + "/100");
        if (isBlackFormActive) {
            System.out.println("Трансформація: Чорний Демон активний!");
        } else {
            System.out.println("Трансформація: неактивна");
        }
    }
    public int basicSwordAttack() {
        int damage = baseAttack;

        if (isBlackFormActive) {
            damage = damage * 2;
        }

        antiMagicEnergy = antiMagicEnergy + 20;

        if (antiMagicEnergy > 100) {
            antiMagicEnergy = 100;
        }

        System.out.println("Аста атакує мечем!");
        System.out.println("Завдано шкоди: " + damage);

        return damage;
    }

    public int useSkill(int skillIndex) {
        int damage = 0;
        int energyCost = 0;

        if (skillIndex < 0 || skillIndex >= skills.length) {
            System.out.println("Такої навички немає!");
            return 0;
        }

        if (skillIndex == 0) {
            damage = 220;
            energyCost = 25;
        } else if (skillIndex == 1) {
            damage = 380;
            energyCost = 50;
        } else if (skillIndex == 2) {
            damage = 550;
            energyCost = 75;
        } else if (skillIndex == 3) {
            energyCost = 100;
        }

        if (antiMagicEnergy < energyCost) {
            System.out.println("Недостатньо антимагічної енергії!");
            return 0;
        }

        antiMagicEnergy = antiMagicEnergy - energyCost;

        System.out.println("Аста використовує: " + skills[skillIndex]);

        if (skillIndex == 3) {
            isBlackFormActive = true;

            hp = hp + 300;

            if (hp > maxHp) {
                hp = maxHp;
            }

            System.out.println("Форма Чорного Демона активована!");
            return 0;
        }

        if (isBlackFormActive) {
            damage = damage * 2;
        }

        System.out.println("Завдано шкоди: " + damage);

        return damage;
    }

    public void pushLimits() {
        if (!limitsUsed && hp > 0 && hp < maxHp * 0.25) {
            limitsUsed = true;

            hp = hp + 150;

            if (hp > maxHp) {
                hp = maxHp;
            }

            antiMagicEnergy = antiMagicEnergy + 50;

            if (antiMagicEnergy > 100) {
                antiMagicEnergy = 100;
            }

            System.out.println("Моя магія — ніколи не здаватися!");
        }
    }

    public boolean isAlive() {
        return hp > 0;
    }
    public void takeDamage(int incomingDmg) {
        int realDamage = incomingDmg - defense;

        if (realDamage < 15) {
            realDamage = 15;
        }

        hp = hp - realDamage;

        if (hp <= 0) {
            hp = 0;
        }
    }
}










