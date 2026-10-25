package semestr1.practice6;

public class Circle {
    public double radius;
    public double getArea(){
        return Math.PI * Math.pow(2, radius);
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
