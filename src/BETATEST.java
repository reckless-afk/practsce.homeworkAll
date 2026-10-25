import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
public class BETATEST {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Завдання 40 мазафака");
        double[][][] weather = new double[3][7][2];
        String[] cities1 = {"Київ", "Львів", "Одеса"};
        String[] daysWeather = {
                "Понеділок", "Вівторок", "Середа",
                "Четвер", "П'ятниця", "Субота", "Неділя"};
        for (int city = 0; city < cities1.length; city++){
            for (int day = 0; day < weather[city].length; day++) {
                weather[city][day][0] = 20 + city + day;
                weather[city][day][1] = 10 + city + day;
            }
        }
        for (int city = 0; city < weather.length; city++) {
            System.out.println("--- " + cities1[city] + " ---");

            for (int day = 0; day < weather[city].length; day++) {
                System.out.println(daysWeather[day]
                        + ": день " + weather[city][day][0] + "°C"
                        + ", ніч " + weather[city][day][1] + "°C");
            }
        }
    }
}








































































