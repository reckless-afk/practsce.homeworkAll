package semestr1.practice9;

public class HeatingUnit {
    private boolean heatingOn;
    private double powerKw;

    public HeatingUnit(boolean heatingOn, double powerKw){
        this.powerKw = powerKw;
        this.heatingOn = false;
    }
    public void turnOn() {
        heatingOn = true;
    }

    public void turnOff() {
        heatingOn = false;
    }

    public boolean isHeatingOn() {
        return heatingOn;
    }
    @Override
    public String toString() {
        return "Обігрівач: " + (heatingOn ? "увімкнений" : "вимкнений")
                + ", потужність: " + powerKw + " кВт";
    }
}

