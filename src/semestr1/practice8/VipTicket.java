package semestr1.practice8;

public class VipTicket extends Ticket{
    private boolean includesBackstage;
    private double loungeFee;

    public VipTicket(String eventName, double basePrice,boolean includesBackstage,double loungeFee ){
        super(eventName,basePrice);
        this.includesBackstage = includesBackstage;
        this.loungeFee = loungeFee;
    }
    @Override public double getFinalPrice(){
        return super.getFinalPrice() + loungeFee;

    }
    @Override
    public String toString() {
        return super.toString() +
                ", Backstage: " + includesBackstage +
                ", Lounge fee: " + loungeFee;
    }
}
