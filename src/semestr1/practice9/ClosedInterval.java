package semestr1.practice9;

public class ClosedInterval {
    private double start;
    private double end;
    public ClosedInterval(double start,double end) {
        if (start > end) {
            double temp = start;
            start = end;
            end = temp;
        }
        this.start = start;
        this.end = end;
    }
    public void resize(double newStart, double newEnd){
        if(newStart > newEnd){
            newStart = newEnd;
            newEnd = newStart;
        }
        this.start = newStart;
        this.end = newEnd;
    }
    public double getLength(){
        return end - start;
    }
    public double getMidpoint() {
        return (start + end) / 2;
    }
    public boolean overlaps(ClosedInterval other) {
        return this.start <= other.end && this.end >= other.start;
    }

    @Override
    public String toString() {
        return "[" + start + "; " + end + "]"
                + " (центр: " + getMidpoint()
                + ", довжина: " + getLength() + ")";
    }
}
