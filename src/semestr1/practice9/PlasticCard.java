package semestr1.practice9;


public class PlasticCard {
    private final String cardNumber;
    private final String expiryDate;
    private boolean blocked;
    private final BankAccount linkedAccount;

    public PlasticCard(String cardNumber, String expiryDate,
                       boolean blocked, BankAccount linkedAccount) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.linkedAccount = linkedAccount;
        this.blocked = blocked;
    }

    public boolean isBlocked() {
        return blocked;
    }
    public boolean payAtTerminal(double amount) {
        if (blocked) {
            return false;
        }

        return linkedAccount.withdraw(amount);
    }

}
