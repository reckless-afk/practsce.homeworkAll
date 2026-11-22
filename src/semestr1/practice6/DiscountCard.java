package semestr1.practice6;

public class DiscountCard {
    private String ownerName;
    private double totalSpent;
    private int discountPercent = 1;

    public void addPurchase(double cost){
        totalSpent = totalSpent + cost;
        if (totalSpent >= 10000) {
            discountPercent = 10;
        }
        else if (totalSpent >= 5000){
            discountPercent = 5;
        } else {
            discountPercent = 1;
        }
    }
    public void printCardInfo(){
        System.out.println("Сума: " + totalSpent + " грн, Знижка: " + discountPercent + "%");
    }

}
