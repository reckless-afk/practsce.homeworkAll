package semestr1.practice9.homework;

public class SubdermalTitaniumArmor extends AbstractCyberImplant{
    public SubdermalTitaniumArmor() {
        super("Підшкірна Титанова Броня", "Шкіра", 20);
    }
        @Override
        public int getAttackBonus () {
            return 10;
        }

        @Override
        public int getArmorBonus () {
            return 65;
        }

        @Override
        public String activateSpecialAbility () {
            return "🛡️ Нано-пластини поглинають кінетичний удар!";
        }
    }




