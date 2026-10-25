package semestr1.practice6;

public class TrafficLight {
    public String currentColor;

    public void changeColor(String newColor) {
        currentColor = newColor;
    }

    public void showSignal() {
        switch (currentColor) {
            case "Червоний":
                System.out.println("Стій!");
                break;
            case "Жовтий":
                System.out.println("Увага!");
                break;
            case "Зелений":
                System.out.println("Їдь!");
                break;
        }
    }
}