package semestr1.practice7;

public class CoffeeOrder {
    private String type;
    private String size;
    private int sugarCount;
    private boolean withSyrup;
    private double finalPrice;


    public CoffeeOrder(String type, String size, int sugarCount, boolean withSyrup) {
        this.type = type;
        this.size = size;
        this.sugarCount = sugarCount;
        this.withSyrup = withSyrup;
        this.finalPrice = calculatePrice();
    }

    public CoffeeOrder(String type, String size) {
        this(type, size, 0, false);
    }

    public CoffeeOrder(String type) {
        this(type, "Medium");
    }

    private double calculatePrice() {
        double price = 0;
        if (type.equals("Еспресо")) {
            price = 40;
        } else if (type.equals("Капучино")) {
            price = 55;
        } else if (type.equals("Лате")) {
            price = 60;
        }
        if (size.equals("Medium")) {
            price *= 1.3;
        } else if (size.equals("Large")) {
            price *= 1.6;
        }

        if (withSyrup) {
            price += 15;
        }
        return price;
    }
    public void printReceipt() {
        System.out.println("Тип кави: " + type);
        System.out.println("Розмір: " + size);
        System.out.println("Кількість цукру: " + sugarCount);
        System.out.println("Сироп: " + withSyrup);
        System.out.println("Загальна ціна: " + finalPrice + " грн");
    }
}

