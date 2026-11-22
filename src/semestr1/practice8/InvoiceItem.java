package semestr1.practice8;

public class InvoiceItem {
   private String description;
   private int quantity;
   private double unitPrice;
   private double discountPercent;

    public InvoiceItem(String description, int quantity,double unitPrice,double discountPercent){
        this.description = description;
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 1;
        }
        if (unitPrice >= 0) {
            this.unitPrice = unitPrice;
        } else {
            this.unitPrice = 0;
        }
        if (discountPercent >= 0 && discountPercent <= 50) {
            this.discountPercent = discountPercent;
        } else {
            this.discountPercent = 0;
        }
    }
    public double getFinalAmount(){
        return quantity - unitPrice;
    }
    @Override
    public String toString() {
        return "Опис: " + description +
                ", кількість: " + quantity +
                ", ціна: " + unitPrice +
                ", знижка: " + discountPercent + "%" +
                ", сума: " + getFinalAmount();
    }

}
