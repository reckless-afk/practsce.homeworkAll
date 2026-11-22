package semestr1.practice9;

public class SolarPowerPlant extends AbstractPowerPlant{
    private double sunIntensityFactor;

    public SolarPowerPlant(String stationName, double baseCapacityMw, double sunIntensityFactor){
        super(stationName,baseCapacityMw);
        if(sunIntensityFactor > 1.0 || sunIntensityFactor < 0.0){
            this.sunIntensityFactor = sunIntensityFactor;
        }
    }
    public double getSunIntensityFactor(){
        return sunIntensityFactor;
    }
    @Override
    public double generateMegawatts() {
        return baseCapacityMw * sunIntensityFactor;
    }
}

