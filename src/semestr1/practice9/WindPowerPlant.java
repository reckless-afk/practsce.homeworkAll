package semestr1.practice9;

public class WindPowerPlant extends AbstractPowerPlant {
    private double windSpeedMs;

    public WindPowerPlant(String stationName, double baseCapacityMw, double windSpeedMs) {
        super(stationName, baseCapacityMw);
        this.windSpeedMs = windSpeedMs;
    }

    @Override
    public double generateMegawatts() {
        if (windSpeedMs < 3 || windSpeedMs > 25) {
            return 0;
        }

        return baseCapacityMw;
    }
}

