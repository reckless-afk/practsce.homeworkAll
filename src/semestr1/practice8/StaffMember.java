package semestr1.practice8;

public class StaffMember {
    protected String name;
    protected double baseSalary;

    public StaffMember(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }


    public double calculateMonthlyPay(){
        return baseSalary;
    }
    @Override
    public String toString() {
        return "Name: " + name +
                ", Base salary: " + baseSalary +
                ", Final salary: " + calculateMonthlyPay();
    }
}
