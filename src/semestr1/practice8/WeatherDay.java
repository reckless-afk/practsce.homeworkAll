package semestr1.practice8;

import java.awt.image.ShortLookupTable;

public class WeatherDay {
    String date;
    double[] hourlyTemps;

    public WeatherDay(String date,  double[] hourlyTemps) {
        this.date = date;

        this.hourlyTemps = new double[hourlyTemps.length];
        for (int i = 0; i < hourlyTemps.length; i++) {
            this.hourlyTemps[i] = hourlyTemps[i];
        }
    }

    public  double getMinTemp(){
        double min =  hourlyTemps[0];
        for(int i = 0; i < hourlyTemps.length; i++){
            if(hourlyTemps[i] < min){
                min = hourlyTemps[i];
            }
        }
        return min;
    }
    public  double getMaxTemp(){
        double max = hourlyTemps[0];
        for(int i = 0; i < hourlyTemps.length; i++){
            if(hourlyTemps[i]>max){
                max = hourlyTemps[i];
            }
        }
        return max;
    }
    public double getAverageTemp() {
        double sum = 0;

        for (int i = 0; i < hourlyTemps.length; i++) {
            sum = sum + hourlyTemps[i];
        }

        return sum / hourlyTemps.length;
    }
    @Override
    public String toString() {
        String temps = "[";

        for (int i = 0; i < hourlyTemps.length; i++) {
            temps = temps + hourlyTemps[i];

            if (i < hourlyTemps.length - 1) {
                temps = temps + ", ";
            }
        }

        temps = temps + "]";

        return "WeatherDay{date='" + date +
                "', hourlyTemps=" + temps +
                ", averageTemp=" + getAverageTemp() +
                '}';
    }

}