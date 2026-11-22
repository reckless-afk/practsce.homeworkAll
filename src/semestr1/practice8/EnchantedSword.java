package semestr1.practice8;

public class EnchantedSword extends Weapon {
    private String element;
    private int magicPower;
    private int enchantmentLevel;

    public EnchantedSword (String title,int baseDamage,String element,int magicPower,int enchantmentLevel){
        super(title,baseDamage);
        this.element = element;
        this.magicPower =  magicPower;
        this.enchantmentLevel =enchantmentLevel;
    }
    @Override
    public int calculateDamage(){
      return super.calculateDamage() + magicPower * enchantmentLevel;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Element: " + element +
                ", Magic damage: " + magicPower * enchantmentLevel +
                ", Total damage: " + calculateDamage();
    }
}
