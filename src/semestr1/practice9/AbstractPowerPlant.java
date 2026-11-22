package semestr1.practice9;

public abstract class AbstractPowerPlant {
    private final String stationName;
    protected double baseCapacityMw;


    public AbstractPowerPlant(String stationName, double baseCapacityMw) {
        this.stationName = stationName;
        this.baseCapacityMw = baseCapacityMw;
    }
    public abstract double generateMegawatts();

    public double calculateDailyProfit(double tariffPerMwh) {
        return generateMegawatts() * 24 * tariffPerMwh;
    }
}
