package semestr1.practice8;

public class StudentTicket extends Ticket{
    private String studentCardNumber;

    public StudentTicket(String eventName, double basePrice, String studentCardNumber){
        super(eventName,basePrice);
        this.studentCardNumber = studentCardNumber;
    }
    @Override
    public double getFinalPrice(){
       return super.getFinalPrice() * 0.5;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Student card: " + studentCardNumber;
    }
}
