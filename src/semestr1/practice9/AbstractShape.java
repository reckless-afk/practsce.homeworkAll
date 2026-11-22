package semestr1.practice9;

public abstract class AbstractShape {
    private String color;

    public AbstractShape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Color: " + color +
                ", Area: " + getArea() +
                ", Perimeter: " + getPerimeter();
    }
}

