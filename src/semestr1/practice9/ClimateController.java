package semestr1.practice9;

public class ClimateController {
    private TemperatureSensor temperatureSensor;
    private HeatingUnit heatingUnit;
    private double targetTemp;
    public ClimateController(TemperatureSensor temperatureSensor,
                             HeatingUnit heatingUnit,
                             double targetTemp) {
        this.temperatureSensor = temperatureSensor;
        this.heatingUnit = heatingUnit;
        this.targetTemp = targetTemp;
    }
    public void regulate() {
        double currentTemp = temperatureSensor.getCurrentTemp();

        if (currentTemp < targetTemp - 0.5) {
            heatingUnit.turnOn();
        }

        if (currentTemp >= targetTemp) {
            heatingUnit.turnOff();
        }
    }

    @Override
    public String toString() {
        return "Клімат-контроль:\n"
                + temperatureSensor + "\n"
                + "Бажана температура: " + targetTemp + "°C\n"
                + heatingUnit;
    }
}

