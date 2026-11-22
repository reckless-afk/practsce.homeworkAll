package semestr1.practice7;

public class Book {
    String title = "Не відомо";
    String author = "Невідомий";
    int year = 2000;
    double price = 0.0;

    public Book(){
        this.title = "Не відомо";
        this.author = "Невідомий";
        this.year = 2000;
        this.price = 0.0;
    }
    public Book(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        if (year < 0) {
            this.year = 2000;
        }else {
            this.year = year;
            }
        if (price < 0.0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }

        }
    public void printInfo() {
        System.out.println("Назва: " + title
                + ", Автор: " + author
                + ", Рік: " + year
                + ", Ціна: " + price + " грн");
    }

}

