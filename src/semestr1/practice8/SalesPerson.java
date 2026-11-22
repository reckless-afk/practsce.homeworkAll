package semestr1.practice8;

public class SalesPerson  extends StaffMember {
    private double salesVolume;
    private double commissionRate;
    public SalesPerson(String name, double baseSalary,
                       double salesVolume, double commissionRate) {
        super(name, baseSalary);
        this.salesVolume = salesVolume;
        this.commissionRate = commissionRate;
    }
    @Override
    public double calculateMonthlyPay() {
        return super.calculateMonthlyPay() +
                salesVolume * (commissionRate / 100.0);
    }
    @Override
    public String toString() {
        return "SalesPerson: " + name +
                ", Base salary: " + baseSalary +
                ", Final salary: " + calculateMonthlyPay();
    }

}
