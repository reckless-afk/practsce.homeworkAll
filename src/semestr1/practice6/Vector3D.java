 package semestr1.practice6.homework;

public class Vector3D {
    private double[] coords = new double[3];

    public void setCoords(double x, double y, double z) {
        coords[0] = x;
        coords[1] = y;
        coords[2] = z;
}
       public double getMagnitude() {
           return Math.sqrt(coords[0] * coords[0] +
                   coords[1] * coords[1] +
                   coords[2] * coords[2]);

       }
public void multiplyByScalar(double scalar){
    for(int i = 0; i < coords.length; i++) {
        coords[i] = coords[i] * scalar;}
    }
    public void printVector() {
        System.out.println("(" + coords[0] + ", " + coords[1] + ", " + coords[2] + ")");
    }
}
