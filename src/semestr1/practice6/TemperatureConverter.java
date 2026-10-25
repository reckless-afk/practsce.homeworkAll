package semestr1.practice6;

public class TemperatureConverter {
    public double celsiusToFahrenheit(double c){
        return  c * 1.8 + 32;
    }
    public double fahrenheitToCelsius(double f){
        return (f-32)/ 1.8;
    }
}
