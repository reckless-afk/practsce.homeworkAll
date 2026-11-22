package semestr1.practice9;

public class LineSegment {
    private final Point2D start;
    private final Point2D end;

    public LineSegment(Point2D start, Point2D end) {
        this.start = new Point2D(start.getX(), start.getY());
        this.end = new Point2D(end.getX(), end.getY());
    }

    public double getLength() {
        return start.distanceTo(end);
    }

    public Point2D getMidpoint() {
        double x = (start.getX() + end.getX()) / 2;
        double y = (start.getY() + end.getY()) / 2;

        return new Point2D(x, y);
    }

    @Override
    public String toString() {
        return "LineSegment: start = " + start + ", end = " + end;
    }
}