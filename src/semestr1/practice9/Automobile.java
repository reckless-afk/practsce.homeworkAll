package semestr1.practice9;

public class Automobile {
    private final String model;
    private double speed;
    private final Engine engine;

    public Automobile(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.speed = 0;
    }

    public void accelerate(double deltaSpeed) {
        if (engine.isStarted() && deltaSpeed > 0) {
            speed += deltaSpeed;

            engine.setRpm(engine.getRpm() + (int) (deltaSpeed * 100));
        }
    }

    @Override
    public String toString() {
        return "Automobile{model='" + model +
                "', speed=" + speed +
                ", engine=" + engine + "}";
    }
}