package semestr1.practice8;

public class Cat extends Animal{
    private boolean isIndoor;
    public Cat(String name, int age, double weight, boolean isIndoor) {
        super(name, age, weight);
        this.isIndoor = isIndoor;
    }
    public String purr() {
        return "Кіт " + getName() + " муркоче: мур-мур!";
    }
    @Override
    public String toString() {
        return "Кіт: " + getName() +
                ", вік: " + getAge() +
                ", вага: " + getWeight() +
                ", хатній: " + isIndoor;
    }
}
