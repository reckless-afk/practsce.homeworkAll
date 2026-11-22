package semestr1.practice7;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    Time(int hours, int minutes, int seconds){
        if (hours < 0 || hours > 23) {
            hours = 0;
        }
        if (minutes < 0 || minutes > 59) {
            minutes = 0;
        }
        if (seconds < 0 || seconds > 59) {
            seconds = 0;
        }
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;

    }
    public void tick(){
        if (seconds == 60){
            minutes++;
            seconds = 0;
        }
        if (minutes == 60) {
            minutes = 0;
            hours++;
        }
        if (hours == 24) {
            hours = 0;
        }
    }
    public String toUniversalString() {
        String h = "" + hours;
        String m = "" + minutes;
        String s = "" + seconds;

        if (hours < 10) {
            h = "0" + hours;
        }

        if (minutes < 10) {
            m = "0" + minutes;
        }

        if (seconds < 10) {
            s = "0" + seconds;
        }

        return h + ":" + m + ":" + s;
    }

    public String toStandardString() {
        int standardHours = hours;

        if (standardHours == 0) {
            standardHours = 12;
        } else if (standardHours > 12) {
            standardHours = standardHours - 12;
        }

        String period = "AM";

        if (hours >= 12) {
            period = "PM";
        }

        String m = "" + minutes;
        String s = "" + seconds;

        if (minutes < 10) {
            m = "0" + minutes;
        }

        if (seconds < 10) {
            s = "0" + seconds;
        }

        return standardHours + ":" + m + ":" + s + " " + period;
    }
}



