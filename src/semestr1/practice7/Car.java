package semestr1.practice7;

public class Car {
    String brand;
    String model;
    int year;
    double mileage;
    boolean engineStarted;
    Car(String brand, String model, int year, double mileage){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }
    Car(String brand, String model, int year){
        this(brand , model , year , 0.0);
    }
    Car(){
      this("Unknown" , "Standard" , 2024 );
    }
    public void startEngine() {
        engineStarted = true;
    }
    public void stopEngine(){
        engineStarted = false;
    }
    public void drive(double distance) {
        if (engineStarted == true) {
            mileage = mileage + distance;
        } else {
            System.out.println("Спершу заведіть двигун!");
        }
    }
        public void printInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
            System.out.println("Mileage: " + mileage);
        }
    }



