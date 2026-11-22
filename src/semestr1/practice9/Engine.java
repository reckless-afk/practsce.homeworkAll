package semestr1.practice9;

public class Engine {
    private final String fuelType;
    private final int volumeCc;
    private int rpm;
    private boolean started;

    public Engine(String fuelType, int volumeCc) {
        this.fuelType = fuelType;
        this.volumeCc = volumeCc;
        this.rpm = 0;
        this.started = false;
    }
    public void start() {
        started = true;
        rpm = 800;
    }
    public void stop(){
        started = true;
        rpm = 0;
    }
    public void setRpm(int rpm){
        if (started && rpm >= 0) {
            this.rpm = rpm;
        }
    }
    public boolean isStarted() {
        return started;
    }

    public int getRpm() {
        return rpm;
    }
    @Override
    public String toString() {
        return "Engine{fuelType='" + fuelType +
                "', volumeCc=" + volumeCc +
                ", rpm=" + rpm +
                ", started=" + started + "}";
    }
}

