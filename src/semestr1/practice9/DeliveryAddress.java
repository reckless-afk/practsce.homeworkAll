package semestr1.practice9;

public class DeliveryAddress {
    private String city;
    private String street;
    private int postOfficeNumber;


    public DeliveryAddress(String city,String street,int postOfficeNumber){
        this.city = city;
        this.street = street;
        this.postOfficeNumber = postOfficeNumber;
    }
    public boolean isValid() {
        return city != null && !city.trim().isEmpty()
                && street != null && !street.trim().isEmpty()
                && postOfficeNumber > 0;
    }
    @Override
    public String toString() {
        return "City: " + city +
                ", Street: " + street +
                ", Post office: " + postOfficeNumber;
    }
}

