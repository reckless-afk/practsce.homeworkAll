package semestr1.practice6;

public class Lamp {
    public  boolean isOn;
    public void turnOn(){
        isOn = true;
        }

    public void turnOff(){
        isOn = false;
        }

    public void toggle() {
        isOn = !isOn;
    }
    public void status(){
        if (isOn) {
            System.out.println("Лампа світить");
        }
                else {
            System.out.println("Лампа вимкнена");
        }
            }
        }


