package semestr1.practice9;

public class OrderItem {
    private final String productName;
    private final double unitPrice;
    private int quantity;

    public OrderItem(String productName,double unitPrice,int quantity){
        this.productName =productName;
        this. unitPrice =  unitPrice;
        this.quantity = quantity;
    }
    public double getItemTotal() {
        return unitPrice * quantity;
    }
    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
