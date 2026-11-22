package semestr1.practice8;
public class Dog extends Animal{
   private String breed;

    public Dog(String name, int age, double weight, String breed) {
        super(name, age, weight);
        if (breed != null) {
            this.breed = breed;
        } else {
            this.breed = "Unknown";
        }
    }
    public String fetchStick(){
        return "Собака " + getName() + " принесла палицю!";
    }
    @Override
    public String toString() {
        return "Собака: " + getName() +
                ", вік: " + getAge() +
                ", вага: " + getWeight() +
                ", порода: " + breed;
    }
}

