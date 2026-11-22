package semestr1.practice7;

public class AreaCalculator {
    public double calculateArea(double side) {
        return side * side;
    }

    public double calculateArea(double width, double height) {
        return width * height;
    }

    public double calculateArea(double radius, boolean isCircle) {
        return (Math.PI * Math.pow(radius, 2));
    }

    public double calculateArea(double a, double b, double c ,boolean isTriangle) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double calculateArea(double base1, double base2, double height) {
        return ((base1 + base2) / 2) * height;
    }
}