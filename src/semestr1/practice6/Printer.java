package semestr1.practice6;

public class Printer {
    public String model;
    public int paperCount = 100;
    public void printDocument(String title, int pages){
        if (paperCount >= pages){
            paperCount = paperCount - pages;
        paperCount -= pages;
            System.out.println("Документ " + title + " успішно надруковано!");
        }
        else {
            System.out.println("Помилка: Недостатньо паперу в принтері [model]!");
        }

    }
}
