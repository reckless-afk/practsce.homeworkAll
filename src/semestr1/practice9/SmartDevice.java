package semestr1.practice9;

public class SmartDevice {
    private final Battery battery;
    private final Display display;

    public SmartDevice(Battery battery, Display display) {
        this.battery = battery;
        this.display = display;
    }
    public void watchVideo(int minutes) {
        int percent;

        if (display.getBrightnessPercent() > 70) {
            percent = 2;
        } else {
            percent = 1;
        }

        int totalDrain = (minutes / 10) * percent;

        battery.drain(totalDrain);

        if (battery.getChargePercent() == 0) {
            System.out.println("Смартфон вимкнувся!");
        } else {
            System.out.println("Залишок заряду: " + battery.getChargePercent() + "%");
        }
    }
}

