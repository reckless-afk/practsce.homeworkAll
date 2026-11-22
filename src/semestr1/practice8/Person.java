package semestr1.practice8;

public class Person {
    private String fullName;
    private int birthYear;

    public Person (String fullName, int birthYear){
        this. fullName = fullName;
        this.birthYear = birthYear;

    }
    public int getAge(int currentYear){
        return currentYear - birthYear;
    }
    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Person: " + fullName +
                ", age: " + getAge(2026);
    }
}
