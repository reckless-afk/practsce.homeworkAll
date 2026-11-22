package semestr1.practice9.homework;

public class MantisBlades extends AbstractCyberImplant {
    public MantisBlades() {
        super("Термальні Клинки Богомола", "Руки", 25);
    }

    @Override
    public int getAttackBonus() {
        return 110;
    }

    @Override
    public int getArmorBonus() {
        return 5;
    }

    @Override
    public String activateSpecialAbility() {
        return "🔥 Вихор розпечених клинків Богомола розтинає броню ворога!";
    }
}
