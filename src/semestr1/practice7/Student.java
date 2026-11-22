package semestr1.practice7;

public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
            if (age < 15 || age > 80) {
                age = 18;
            }
        this.age = age;
        if (gpa < 0.0 || gpa > 5.0) {
            gpa = 0.0;
        }
        this.gpa = gpa;
    }

    public boolean isHonorStudent() {
        if (gpa >= 4.5) {
            return true;
        } else {
            return false;

        }
    }
    public void printStudent(){
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Середній бал: " + gpa);

        if (isHonorStudent()) {
            System.out.println("Статус: Відмінник");
        } else {
            System.out.println("Статус: Звичайний студент");
        }
    }
}


