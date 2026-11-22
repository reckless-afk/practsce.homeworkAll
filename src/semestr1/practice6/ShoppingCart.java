package semestr1.practice6;

public class ShoppingCart {
    private int count = 0;
    private double[] itemPrices = new double[10];

    public void addItem(double price) {
        if (count < itemPrices.length) {
            itemPrices[count] = price;
            count++;
        }
    }

    public double getTotalCost() {
        double sum = 0;

        for (int i = 0; i < count; i++) {
            sum = sum + itemPrices[i];
        }

        return sum;
    }

    public void applyDiscount(double percent) {
        for (int i = 0; i < count; i++) {
            itemPrices[i] = itemPrices[i] * (1 - percent / 100);
        }
    }
}