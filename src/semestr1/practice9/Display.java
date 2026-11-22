package semestr1.practice9;

public class Display {
    private double diagonalInches;
    private int brightnessPercent;

    public Display(double diagonalInches, int brightnessPercent) {
        this.diagonalInches = diagonalInches;

        if (brightnessPercent < 10 || brightnessPercent > 100) {
            this.brightnessPercent = 10;
        } else {
            this.brightnessPercent = brightnessPercent;
        }
    }

    public int getBrightnessPercent() {
        return brightnessPercent;
    }
}
