package semestr1.practice6;

public class Employee {
    String name;
    double baseSalary;
    double bonusPercentage;
    public double calculateTotalSalary() {
        return baseSalary * ( 1 + bonusPercentage / 100);
    }
        public double calculateTax(){
            return calculateTotalSalary() *  19.5  / 100;

        }


}
