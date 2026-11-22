package semestr1.practice6;

public class TemperatureTracker {
    private double[] dailyTemps = new double[7];

    public void setTemps(double[] temps) {
        dailyTemps = temps;
    }

    public int countDaysAbove(double threshold) {
            int count = 0;
            for (int i = 0; i < dailyTemps.length; i++) {
                if (dailyTemps[i] > threshold) {
                    count++;
                }
            }
        return count;
    }


}
