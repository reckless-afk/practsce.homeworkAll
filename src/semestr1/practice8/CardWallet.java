package semestr1.practice8;

public class CardWallet {
    private String cardNumber;
    private String pinCode;
    private double balance;

    public CardWallet(String cardNumber, String pinCode, double balance) {
        if (cardNumber != null && cardNumber.length() == 16) {
            this.cardNumber = cardNumber;
        } else {
            this.cardNumber = "0000000000000000";
        }
        this.pinCode = pinCode;
        this.balance = balance;
    }
    public boolean changePin(String oldPin, String newPin){
        if(this.pinCode.equals(oldPin)){
            this.pinCode = newPin;
            return true;}
        else {
            return false;
        }
    }
    @Override
    public String toString() {
        String maskedCard = "**** **** **** " + cardNumber.substring(12);

        return "CardWallet{card='" + maskedCard +
                "', balance=" + balance + " UAH}";
    }
}



