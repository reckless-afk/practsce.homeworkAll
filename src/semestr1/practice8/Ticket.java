package semestr1.practice8;

public class Ticket {
    private String eventName;
    private double basePrice;

    public Ticket(String eventName, double basePrice){
        this.eventName = eventName;
        this.basePrice = basePrice;
    }
    public double getFinalPrice(){
        return basePrice;
    }
    @Override
    public String toString() {
        return "Event: " + eventName +
                ", Base price: " + basePrice +
                ", Final price: " + getFinalPrice();
    }
}
