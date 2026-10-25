package semestr1.practice6;

public class NumberChecker {
    public boolean isEven(int n){
        return n % 2 == 0;
    }
    public boolean isPositive(int n){
return n > 0;
    }
    public boolean isPrime(int n){
        if (n <= 1) {
            return false;
    }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
}
    }
