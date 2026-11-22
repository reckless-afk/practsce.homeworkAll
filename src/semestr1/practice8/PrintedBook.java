package semestr1.practice8;

public class PrintedBook extends Publication{
    private int pageCount;
    private String coverType;
    public PrintedBook(String title, String author, int releaseYear,
                       int pageCount, String coverType) {
        super(title, author, releaseYear);
        this.pageCount = pageCount;
        this.coverType = coverType;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Кількість сторінок: " + pageCount +
                ", Тип обкладинки: " + coverType;
    }
}
