package semestr1.practice8.homework;

public class ShadowMonarch extends Hunter {
    private String[] shadowNames = new String[5];
    private int[] shadowBonuses = new int[5];
    private int shadowCount = 0;

    public ShadowMonarch(String name, int level, int maxHp,
                         int maxMana, int baseAttack, int defense) {
        super(name, level, maxHp, maxHp, baseAttack, defense, 'S', maxMana);
    }

    public boolean arise(String shadowName, int bonusAtk) {
        if (mana < 30) {
            System.out.println("Недостатньо мани!");
            return  false;
        }
        if (shadowCount >= shadowNames.length) {
            System.out.println("Немає місця для нового імпланту!");
        return false;
    }
    shadowNames[shadowCount] = shadowName;
    shadowBonuses[shadowCount] = bonusAtk;
    shadowCount++;
    mana -= 30;
        System.out.println("Імплант " + shadowName + " успішно встановлено!");
        return true;
    }
    public int getTotalShadowBonus() {
        int total = 0;
        for (int i = 0; i < shadowCount; i++) {
            total += shadowBonuses[i];
        }

        return total;
    }
    @Override
    public int performAttack() {
        return super.performAttack() + getTotalShadowBonus();
    }
    @Override
    public void levelUp() {
        super.levelUp();
        maxHp += 150;
        hp = maxHp;
        maxMana += 50;
        mana = maxMana;
        baseAttack += 25;
        System.out.println("[СИСТЕМА: РІВЕНЬ ПІДВИЩЕНО!]");
        System.out.println("Новий рівень: " + getlevel());
    }
    @Override public String toString(){
        String result = super.toString();
        result += "\n--- ТІНЬОВИЙ ЛЕГІОН ---\n";

        for (int i = 0; i < shadowCount; i++) {
            result += shadowNames[i] +
                    " (+" + shadowBonuses[i] + " ATK)\n";
        }

        result += "Загальний бонус атаки: +" + getTotalShadowBonus();

        return result;
    }


}

