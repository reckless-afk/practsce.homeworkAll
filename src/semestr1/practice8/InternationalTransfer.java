package semestr1.practice8;

public class InternationalTransfer extends StandardTransfer{
    private String countryCode;

    public InternationalTransfer(double amount,String countryCode){
        super(amount);
        this.countryCode = countryCode;
    }
    @Override
    public double getFee() {
        return super.getFee() * 2 + 15.0;
    }
    @Override
    public String toString() {
        return "Country: " + countryCode +
                ", Amount: " + amount +
                ", Fee: " + getFee() +
                ", Total: " + getTotalWithFee();
    }
}
