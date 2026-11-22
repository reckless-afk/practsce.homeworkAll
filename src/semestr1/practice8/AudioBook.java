package semestr1.practice8;

public class AudioBook extends Publication{
    private int durationMinutes;
    private String narrator;
    public AudioBook(String title, String author, int releaseYear,
                     int durationMinutes, String narrator) {

        super(title, author, releaseYear);
        this.durationMinutes = durationMinutes;
        this.narrator = narrator;
    }
    public String formatDuration() {
        int hours = durationMinutes / 60;
        int minutes = durationMinutes % 60;
        return hours + " год " + minutes + " хв";
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Тривалість: " + formatDuration() +
                ", Оповідач: " + narrator;
    }
}

