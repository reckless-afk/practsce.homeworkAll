package semestr1.practice7;

public class Rectangle {
    private double width;
    private double height;

    Rectangle() {
        width = 1.0;
        height = 1.0;
    }

    public Rectangle(double size) {
        width = size;
        height = size;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }
}
