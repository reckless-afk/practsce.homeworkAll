package semestr1.practice8;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 1.0;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 1.0;
        }
    }

    public double getArea() {
        return Math.PI * (this.radius);
    }

    public double getCircumference() {
        return (int) (2 * Math.PI * this.radius);
    }

    @Override
    public String toString() {
        return "Радіус: " + this.radius +
                ", Площа: " + getArea() +
                ", Довжина кола: " + getCircumference();
    }
}
