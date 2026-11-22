package semestr1.practice7;

public class Point2D {
    private double x;
    private double y;
   public Point2D() {
       this.x = 0.0;
       this.y = 0.0;
    }
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;

    }
    public double distanceToOrigin() {
        double dist = Math.sqrt(this.x * x + this.y * y);
        return dist;

    }
    public double distanceTo(double targetX, double targetY){
       double dist2 = Math.sqrt(
               (this.x - targetX) * (this.x - targetX)
                       + (this.y - targetY) * (this.y - targetY));
       return dist2;
    }
    public void printPoint() {
        System.out.println("Point(" + this.x + "; " + this.y + ")");
    }
}
