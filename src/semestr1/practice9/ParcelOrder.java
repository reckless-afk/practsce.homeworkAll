package semestr1.practice9;

public class ParcelOrder {
    private final String orderId;
    private double weightKg;
    private DeliveryAddress destination;
    private boolean shipped;

    public ParcelOrder(String orderId, double weightKg, DeliveryAddress destination) {
        this.orderId = orderId;
        this.weightKg = weightKg;
        this.destination = destination;
        this.shipped = false;
    }
    public boolean changeDestination(DeliveryAddress newAddress) {
        if (shipped || newAddress == null || !newAddress.isValid()) {
            return false;
        }

        this.destination = newAddress;
        return true;
    }
    public void markAsShipped() {
        this.shipped = true;
    }
}
