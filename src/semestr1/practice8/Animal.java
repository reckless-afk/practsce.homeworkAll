package semestr1.practice8;

public class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal(String name, int age, double weight) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Unknown";
        }
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
        if (weight > 0) {
            this.weight = weight;
        } else {
            this.weight = 1.0;
        }
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return "Ім'я: " + name +
                ", вік: " + age +
                ", вага: " + weight;
    }
}
