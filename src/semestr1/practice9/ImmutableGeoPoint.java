package semestr1.practice9;

public class ImmutableGeoPoint {
    private final double latitude;
    private final double longitude;

    public ImmutableGeoPoint(double latitude, double longitude) {
        this.latitude = Math.max(-90.0, Math.min(90.0, latitude));
        this.longitude = Math.max(-180.0, Math.min(180.0, longitude));

    }
    public ImmutableGeoPoint shift(double dLat, double dLon){
        return new ImmutableGeoPoint(
                latitude + dLat,
                longitude + dLon);
    }
    @Override
    public String toString() {
        return "Latitude: " + latitude + ", Longitude: " + longitude;
    }
}

