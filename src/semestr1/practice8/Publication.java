package semestr1.practice8;

public class Publication {
    private String title;
    private String author;
    private int releaseYear;

    public Publication (String title, String author,int releaseYear){
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }
    @Override
    public String toString() {
        return "Назва: " + title +
                ", Автор: " + author +
                ", Рік видання: " + releaseYear;
    }
}
