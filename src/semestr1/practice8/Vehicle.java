package semestr1.practice8;

public class Vehicle {
    protected String brand;
    protected int maxSpeed;
    protected double fuelTankCapacity;

    public Vehicle(String brand, int maxSpeed, double fuelTankCapacity){
        if(brand != null){
            this.brand = brand;
        }
        else {
            System.out.println("?");
        }

        if (maxSpeed >= 0) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 0;
        }
        if (fuelTankCapacity > 0) {
            this.fuelTankCapacity = fuelTankCapacity;
        } else {
            this.fuelTankCapacity = 0;
        }

    }
}
