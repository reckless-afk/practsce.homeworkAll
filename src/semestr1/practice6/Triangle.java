package semestr1.practice6;

public class Triangle {
    double a = 3;
    double b = 4;
    double c = 5;
    public boolean isValid(){
       return a + b > c && a + c > b && b + c > a;
    }
    public double getPerimeter(){
        return a + b + c;
    }
    public double getArea(){
        if (!isValid()) {
            return 0.0;
        }
        double p = getPerimeter() / 2;

        return Math.sqrt (p*(p-a)*(p-b)*(p-c));
    }
}
