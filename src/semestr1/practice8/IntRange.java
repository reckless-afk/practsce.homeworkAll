package semestr1.practice8;

public class IntRange {
    private int min;
    private int max;

    public IntRange(int min, int max) {
        if (min > max) {
            this.min = max;
            this.max = min;
        } else {
            this.min = min;
            this.max = max;
        }
    }
    public boolean contains(int value){
        return  value >= min && value <= max;
    }
    public int getLength(){
        return max - min;
    }
    @Override
    public String toString() {
        return "[" + min + " .. " + max + "] (довжина: " + getLength() + ")";

    }
}
