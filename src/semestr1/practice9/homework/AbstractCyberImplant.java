package semestr1.practice9.homework;

public abstract class AbstractCyberImplant {
    private final String name;
    private final String slot;
    private final int humanityCost;


    public AbstractCyberImplant(String name, String slot, int humanityCost) {
        this.name = name;
        this.slot = slot;
        this.humanityCost = humanityCost;
    }

    public String getName() {
        return name;
    }

    public String getSlot() {
        return slot;
    }

    public int getHumanityCost() {
        return humanityCost;
    }

    public abstract int getAttackBonus();

    public abstract int getArmorBonus();

    public abstract String activateSpecialAbility();

    @Override
    public String toString() {
        return "Імплант: " + name +
                "\nСлот: " + slot +
                "\nВартість людяності: " + humanityCost;

    }
}


