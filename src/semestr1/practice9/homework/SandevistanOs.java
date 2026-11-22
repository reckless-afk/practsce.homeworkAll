package semestr1.practice9.homework;

public class SandevistanOs extends AbstractCyberImplant {
    public SandevistanOs() {
        super("Militech Apogee", "Нейро-ОС", 35);
    }
    @Override
    public int getAttackBonus(){
        return 90;
    }

@Override
public int getArmorBonus() {
    return 20;
}

@Override
public String activateSpecialAbility() {
    return "⚡ САНДЕВІСТАН АКТИВОВАНО: Час сповільнено на 85%! Вороги завмерли на місці!";
}
}

