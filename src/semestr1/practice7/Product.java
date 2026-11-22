package semestr1.practice7;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;
    public Product(String name, double price, int quantity, String category) {
        if (price < 0 || quantity < 0) {
            System.out.println("Помилка: ціна або кількість не можуть бути від'ємними");
        }
        else {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
            this.category = category;
        }
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public void applyDiscount(double percent){
        if (percent < 0 || percent > 100) {
            System.out.println("Процент можливий тільки від 0 до 100");
        }else {
            price = price - (price * percent / 100);

        }
    }
    public void printProduct(){
        System.out.println("Товар: " + name);
        System.out.println("Ціна: " + price);
        System.out.println("Кількість: " + quantity);
        System.out.println("Категорія: " + category);
        System.out.println("Загальна вартість: " + getTotalValue());
    }
}
