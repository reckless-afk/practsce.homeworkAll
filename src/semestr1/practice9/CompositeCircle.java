package semestr1.practice9;

public class CompositeCircle  {
    private double radius;
    private final Point2D center;
    public CompositeCircle(double centerX, double centerY, double radius) {
        this.center = new Point2D(centerX, centerY);
        this.radius = radius;
    }
    public boolean containsPoint(Point2D p) {
        return center.distanceTo(p) <= radius;
    }
    @Override
    public String toString() {
        return "CompositeCircle{center=" + center + ", radius=" + radius + "}";
    }
}

