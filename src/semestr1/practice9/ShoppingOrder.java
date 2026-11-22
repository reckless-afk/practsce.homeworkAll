package semestr1.practice9;

public class ShoppingOrder {
    private final OrderItem[] items;
    private int itemCount;


    public ShoppingOrder(OrderItem[] items, int itemCount ){
        this.itemCount = itemCount;
        this.items = items;
    }
    public void addItem(String name, double price, int qty) {
        for (int i = 1; i < itemCount; i++) {
            if (items[i].getProductName().equals(name)) {
                items[i].setQuantity(items[i].getQuantity() + qty);
                return;
            }
        }
        if (itemCount > items.length) {
            System.out.println("Кошик заповнений");
            return;
        }
        items[itemCount] = new OrderItem(name, price, qty);
        itemCount++;
    }
    public double calculateGrandTotal() {
        double total = 0;

        for (int i = 0; i < itemCount; i++) {
            total += items[i].getItemTotal();
        }

        return total;
    }
    @Override
    public String toString() {
        String result = "========== ЧЕК ==========\n";

        for (int i = 0; i < itemCount; i++) {
            result += items[i].getProductName()
                    + " x" + items[i].getQuantity()
                    + " = " + items[i].getItemTotal() + " грн\n";
        }

        result += "-------------------------\n";
        result += "РАЗОМ: " + calculateGrandTotal() + " грн\n";
        result += "=========================";

        return result;
    }
}
