package semestr1.practice8;

public class Rectangle {
    private double width;
    private double height;
   public Rectangle(double width,double height) {
       if(width > 0 && height > 0) {
           this.width = width;
           this.height = height;
       }
       else {
           this.width = 1.0;
           this.height =1.0;
           }

   }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double getArea() {
        return width * height;
    }
    @Override
    public String toString() {
        return "Rectangle: width = " + width +
                ", height = " + height +
                ", area = " + getArea();
    }
}
