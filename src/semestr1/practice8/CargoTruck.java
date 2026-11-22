package semestr1.practice8;

public class CargoTruck extends Vehicle{
    private double maxLoadTons;

    public CargoTruck(String brand, int maxSpeed, double fuelTankCapacity, int passengerSeats){
        super(brand, maxSpeed, fuelTankCapacity);
        this.maxLoadTons = maxLoadTons;
    }
    public double calculateFuelConsumption() {
        return 20 + maxLoadTons * 2;
    }
    @Override
    public String toString() {
        return "Вантажівка: " + brand +
                ", максимальна швидкість: " + maxSpeed +
                ", об'єм бака: " + fuelTankCapacity +
                ", вантажопідйомність: " + maxLoadTons + " т" +
                ", витрата пального: " + calculateFuelConsumption() + " л/100 км";
    }
}
