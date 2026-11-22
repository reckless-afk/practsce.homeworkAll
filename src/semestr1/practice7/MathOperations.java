package semestr1.practice7;

public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(String a, String b) {
        return a + " " + b;
    }


    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public String multiply(String text, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += text;
        }
        return result;
    }
}