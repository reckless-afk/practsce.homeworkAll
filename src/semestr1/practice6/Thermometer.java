package semestr1.practice6;

public class Thermometer {
    private double temperature;

    public void setTemperature(double t) {
        if (t < -273.15) {
            System.out.println("Помилка: температура не можоже бути за абсолютний 0");
        } else {
            temperature = t;
        }
    }

    public double getTemperature() {
        return temperature;

    }


}