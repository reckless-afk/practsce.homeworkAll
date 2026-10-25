package semestr1.practice6;

public class Stopwatch {
    public int seconds;
    public void tick() {
        seconds = seconds + 1;
    }
        public void addSeconds(int s) {
            seconds = s + seconds;
        }
    int minutes;
    int remainingSeconds;
    public void displayTime(){
        if (seconds > 60) {
             minutes = seconds / 60;
             remainingSeconds = seconds % 60;
            System.out.println(minutes + ":" + remainingSeconds );
        }

    }
}
