package semestr1.practice8;

public class Employee {
    private String name;
    protected double salary;

   public Employee(String name, double salary){
        if(name != null ){
            this.name = name;}
        else {
            this.name = "?";
        }
        if (salary >= 0) {
            this.salary = salary;
        } else {
            this.salary = 0;
        }
    }

public String getName() {
    return this.name;
    }
@Override
public String toString() {
    return "Ім'я: " + name + ", зарплата: " + salary;
}
}
