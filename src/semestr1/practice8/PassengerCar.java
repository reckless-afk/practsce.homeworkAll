package semestr1.practice8;

public class PassengerCar extends Vehicle{
    private int passengerSeats;

    public PassengerCar(String brand, int maxSpeed, double fuelTankCapacity, int passengerSeats) {
        super(brand, maxSpeed, fuelTankCapacity);
        this.passengerSeats = passengerSeats;
     }

    @Override
    public String toString() {
        return "Легковий автомобіль: " + brand +
                ", максимальна швидкість: " + maxSpeed +
                ", об'єм бака: " + fuelTankCapacity +
                ", кількість місць: " + passengerSeats;
    }
}
