package semestr1.practice6;

public class CurrencyExchange {
    double usdRate = 41.5;
    public double toUSD(double uah) {
        return uah / usdRate;
    }
    public double toUAH(double usd){
        return usd * usdRate;
    }
}
