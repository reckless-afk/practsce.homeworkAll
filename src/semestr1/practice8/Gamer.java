package semestr1.practice8;

public class Gamer {
    private String nickname;
    private int hoursPlayed;

    public Gamer (String nickname,int hoursPlayed ) {
        this.nickname = nickname;
        this.hoursPlayed = hoursPlayed;
    }
    @Override
    public String toString() {
        return "Нікнейм: " + nickname +
                ", Годин зіграно: " + hoursPlayed;

    }
}
