package semestr1.practice9;

public class RectangleShape extends AbstractShape {
    private double width;
    private double height;

    public RectangleShape(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;

    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

