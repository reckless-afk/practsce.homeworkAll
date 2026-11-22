package semestr1.practice9;

public class Point2D {
    private double x;
    private double y;


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public  double distanceTo(Point2D other) {
        double dx = other.x - this.x;
        double dy = other.y - this.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "Point2D{x=" + x + ", y=" + y + "}";
    }
}