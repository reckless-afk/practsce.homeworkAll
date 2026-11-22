package semestr1.practice8;

public class Product {
   private String sku;
   private String title;
   private double price;
   private int stock;

    public Product(String sku, String title,double price, int stock){
        this.sku = sku;
        this.title = title;
    if ( price >= 0.0){
        this.price = price;}
    else {
        this.price = 0.0;
    }
    if (stock >= 0){
        this.stock = stock;}
    else {
        this.stock = 0;
    }

    }

    public double getTotalCost(){
      return price * stock;
    }
    public void setPrice(double price) {
        if (price >= 0.0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            this.stock = 0;
        }
    }
    @Override
        public String toString() {
            return "[SKU: " + sku + "] " + title +
                    " | Ціна: " + price + " грн" +
                    " | Залишок: " + stock + " шт." +
                    " | Разом: " + getTotalCost() + " грн";
    }
}

