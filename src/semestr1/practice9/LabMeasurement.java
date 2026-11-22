package semestr1.practice9;
import java.util.Arrays;

public class LabMeasurement {
    private final String experimentName;
    private final double[] samples;


    public LabMeasurement( String experimentName,double[] samples){
        this.experimentName = experimentName;
        if (samples == null) {
            this.samples = new double[0];
        } else {
            this.samples = Arrays.copyOf(samples,samples.length);
        }

    }
    public double[] getSamples() {
        return Arrays.copyOf(samples, samples.length);
    }
}
