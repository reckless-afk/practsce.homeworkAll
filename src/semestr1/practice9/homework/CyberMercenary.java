package semestr1.practice9.homework;

public class CyberMercenary {
    private final String nickname;
    private final int baseAttack;
    private final BioMonitor bioMonitor;
    private final AbstractCyberImplant[] implants;
    private int implantCount;

    public CyberMercenary(String nickname, int baseAttack) {
        this.nickname = nickname;
        this.baseAttack = baseAttack;

        this.bioMonitor = new BioMonitor(1000);
        this.implants = new AbstractCyberImplant[4];
        this.implantCount = 0;
    }
    public boolean installImplant(AbstractCyberImplant implant){
        if(implant == null){
            return false;
        }
        if(implantCount >= implants.length){
            System.out.println("❌ Немає вільних слотів!");
            return false;
        }
        for(int i = 0; i < implantCount; i++){
            if(implants[i].getSlot().equals(implant.getSlot())) {
                System.out.println("❌ Слот " + implant.getSlot() + " вже зайнятий!");
                return false;
            }
        }
        implants[implantCount] = implant;
        implantCount++;
        bioMonitor.reduceHumanity(implant.getHumanityCost());

        System.out.println("🔧 Встановлено: " + implant.getName());

        return true;
    }
    public int getTotalAttack() {
        int totalAttack = baseAttack;

        for (int i = 0; i < implantCount; i++) {
            totalAttack += implants[i].getAttackBonus();
        }

        if (bioMonitor.getCyberpsychosis()) {
            totalAttack = (int) (totalAttack * 1.5);
        }

        return totalAttack;
    }


    public int getTotalArmor() {
        int totalArmor = 0;

        for (int i = 0; i < implantCount; i++) {
            totalArmor += implants[i].getArmorBonus();
        }

        return totalArmor;
    }


    public void activateImplants() {
        for (int i = 0; i < implantCount; i++) {
            System.out.println(implants[i].activateSpecialAbility());
        }
    }


    public void endTurn() {
        if (bioMonitor.getCyberpsychosis()) {
            int damage = bioMonitor.getHp() / 10;
            bioMonitor.applyDamage(damage, 0);

            System.out.println("⚠️ Нервове перевантаження! Втрачено HP: " + damage);
        }
    }


    public void takeDamage(int damage) {
        int actualDamage = bioMonitor.applyDamage(damage, getTotalArmor());

        System.out.println(nickname + " отримав " + actualDamage + " шкоди!");
    }


    public void injectImmunoblockers(int amount) {
        bioMonitor.injectImmunoblockers(amount);
    }
    public boolean isAlive() {
        return bioMonitor.getHp() > 0;
    }

    @Override
    public String toString() {
        String result = "CyberMercenary{" +
                "nickname='" + nickname + '\'' +
                ", TotalATK=" + getTotalAttack() +
                ", TotalDEF=" + getTotalArmor() +
                "}\n";

        result += bioMonitor.toString();
        result += "\nВстановлені імпланти (" + implantCount + "/4):\n";

        for (int i = 0; i < implantCount; i++) {
            result += (i + 1) + ". " + implants[i] + "\n";
        }

        return result;
    }
}

