package semestr1.practice8;

public class Manager extends StaffMember{
    private double teamBonus;

    public Manager(String name, double baseSalary, double teamBonus) {
        super(name, baseSalary);
        this.teamBonus = teamBonus;
    }
    @Override
    public double calculateMonthlyPay() {
        return super.calculateMonthlyPay() + teamBonus;
    }
    @Override
    public String toString() {
        return "Manager: " + name +
                ", Base salary: " + baseSalary +
                ", Team bonus: " + teamBonus +
                ", Final salary: " + calculateMonthlyPay();
    }
}
