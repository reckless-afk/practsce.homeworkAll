package semestr1.practice7;

public class SmartBulb {
    int brightness;
    int colorTemp;
    boolean isOn;
    SmartBulb(int brightness, int colorTemp, boolean isOn){
        if(brightness > 100){
            brightness = 100;
        }

        if(colorTemp < 2700 || colorTemp > 6500 ){
            System.out.println("Помилка");
        }

        this.brightness = brightness;
        this.colorTemp = colorTemp;
        this.isOn = isOn;
    }
    public SmartBulb(int brightness) {
        this(brightness, 4000, true);
    }
    public SmartBulb() {
        this(50);
    }
    public void printStatus() {
        System.out.println("Яскравість: " + brightness + "%");
        System.out.println("Температура: " + colorTemp + " K");
        System.out.println("Лампочка увімкнена: " + isOn);
        System.out.println("--------------------");
    }
}
