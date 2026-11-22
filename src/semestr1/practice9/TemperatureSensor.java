package semestr1.practice9;

public class TemperatureSensor {
    private double currentTemp;

    public TemperatureSensor( double currentTemp){
        this.currentTemp = currentTemp;
    }
    public double getCurrentTemp() {
        return currentTemp;
    }
    public void setCurrentTemp(double currentTemp) {
        this.currentTemp = currentTemp;
    }
    @Override
    public String toString() {
        return "Поточна температура: " + currentTemp + "°C";
    }

}
