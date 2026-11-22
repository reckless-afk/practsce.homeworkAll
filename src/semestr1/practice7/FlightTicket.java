package semestr1.practice7;

public class FlightTicket {
  private String ticketNumber;
    private String passengerName;
    private String flightNumber;
    private String departureCity;
    private String arrivalCity;
    private String seatNumber;
    private boolean hasBaggage;

    public FlightTicket(String ticketNumber,String passengerName,String flightNumber,String departureCity,String arrivalCity
    ,String seatNumber,boolean hasBaggage){
        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.seatNumber = seatNumber;
        this.hasBaggage = hasBaggage;
    }
    public FlightTicket(String ticketNumber, String passengerName, String flightNumber, String departureCity, String arrivalCity){
        this(ticketNumber,passengerName,flightNumber,departureCity,arrivalCity,"UNASSIGNED",false);
    }
    public void assignSeat(String seat){
        this.seatNumber = seat;
    }
    public void printBoardingPass() {
        System.out.println("Номер квитка: " + ticketNumber);
        System.out.println("Пассажир: " + passengerName);
        System.out.println("Рейс: " + flightNumber);
        System.out.println("Откуда: " + departureCity);
        System.out.println("Куда: " + arrivalCity);
        System.out.println("Место: " + seatNumber);
        System.out.println("Багаж: " + hasBaggage);
    }

}
