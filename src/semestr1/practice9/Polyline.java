package semestr1.practice9;

public class Polyline {
    private final Point2D[] vertices;
    private int count;

    public Polyline(Point2D[] vertices,int count){
        this.vertices = vertices;
        this.count = count;
    }
    public void addVertex(double x, double y) {
        if (count >= vertices.length) {
            System.out.println("Масив заповнений!");
            return;
        }

        vertices[count] = new Point2D(x, y);
        count++;
    }
    public double getTotalLength(){
        double total = 0;
        for(int i = 1; i < count; i++){
            total += vertices[i - 1].distanceTo(vertices[i]);
        }
        return total;
    }
    public double getClosedPerimeter() {
        if (count < 2) {
            return 0;
        }
        double perimeter = getTotalLength();
        perimeter += vertices[count - 1].distanceTo(vertices[0]);

        return perimeter;
    }
}
