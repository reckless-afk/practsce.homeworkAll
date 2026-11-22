package semestr1.practice9;

public class EncapsulatedPolynomial {
    private final double[] coeffs;

    public EncapsulatedPolynomial(double[] coeffs) {
        if (coeffs == null) {
            this.coeffs = new double[0];
        } else {
            this.coeffs = coeffs.clone();
        }
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public double getCoefficient(int power) {
        if (power < 0 || power >= coeffs.length) {
            return 0;
        }
        return coeffs[power];
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }
        @Override
        public String toString() {
            String result = "";

            for (int i = 0; i < coeffs.length; i++) {
                if (coeffs[i] != 0) {
                    result += coeffs[i];

                    if (i == 1) {
                        result += "x";
                    } else if (i > 1) {
                        result += "x^" + i;
                    }

                    if (i < coeffs.length - 1) {
                        result += " + ";
                    }
                }
            }

            return result;
        }
    }
