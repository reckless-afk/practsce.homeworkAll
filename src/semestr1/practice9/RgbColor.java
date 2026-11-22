package semestr1.practice9;

public class RgbColor {
    private final int red;
    private final int green;
    private final int blue;

    public RgbColor(int red,int green,int blue){
        this.red = clamp(red);
        this.green = clamp(green);
        this.blue = clamp(blue);
    }
    private static int clamp(int val) {
        if (val < 0) {
            return 0;
        }
        if (val > 255) {
            return 255;
        }
        return val;
    }
    public String toHex(){
        return String.format("#%02X%02X%02X", red, green, blue);
    }
    public RgbColor invert() {
        return new RgbColor(
                255 - red,
                255 - green,
                255 - blue);
    }
    public RgbColor mixWith(RgbColor other){
        return new RgbColor(
                (red + other.red) / 2,
                (green + other.green) / 2,
                (blue + other.blue) / 2);

    }
    @Override
    public String toString() {
        return "RGB(" + red + ", " + green + ", " + blue + ") " + toHex();
    }
}

