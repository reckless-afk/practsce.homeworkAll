package semestr1.practice9;

public class Battery {
    private int capacityMah;
    private int chargePercent;

    public Battery(int capacityMah, int chargePercent) {
        this.capacityMah = capacityMah;
        if (chargePercent < 0 || chargePercent > 100) {
            this.chargePercent = 0;
        } else {
            this.chargePercent = chargePercent;
        }
    }

    public void drain(int percent) {
        chargePercent = chargePercent - percent;
        if (chargePercent < 0) {
            chargePercent = 0;

        }
    }
        public void charge ( int percent){
            chargePercent = chargePercent + percent;
            if (chargePercent < 0) {
                chargePercent = 0;
            }
        }
    public int getChargePercent() {
        return chargePercent;
    }
    }


