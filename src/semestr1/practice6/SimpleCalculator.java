package semestr1.practice6;

public class SimpleCalculator {
    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Помилка: ділення на нуль неможливе!");
            return 0;
        }

        return (double) a / b;
    }
}


