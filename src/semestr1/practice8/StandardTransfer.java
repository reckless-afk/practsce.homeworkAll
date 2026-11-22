package semestr1.practice8;

public class StandardTransfer {
    protected double amount;

    public StandardTransfer(double amount){
        this.amount = amount;
    }
    public double getFee(){
        return this.amount = (amount * 1)/ 100;
    }
    public double getTotalWithFee(){
       return amount + getFee();
    }
}
