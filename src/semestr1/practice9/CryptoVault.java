package semestr1.practice9;

public class CryptoVault {
    private final String walletAddress;
    private String secretRecoveryPhrase;
    private double btcBalance;
    private boolean locked;

    public CryptoVault (String walletAddress,String secretRecoveryPhrase,double btcBalance,boolean locked ){
        this.walletAddress = walletAddress;
        this.secretRecoveryPhrase = secretRecoveryPhrase;
        this.btcBalance = btcBalance;
        this.locked = true;
    }
    public boolean unlock(String phrase) {
        if (secretRecoveryPhrase.equals(phrase)) {
            locked = false;
            return true;
        }
        return false;
    }
    public void lock() {
        locked = true;
    }
    public boolean sendBtc(double amount, String destination){
        if(locked || amount <=0 || btcBalance < amount){
            return false;
        }
        btcBalance -= amount;

        return true;
    }
    @Override
    public String toString() {
        return "Address: " + walletAddress +
                ", Locked: " + locked +
                ", Balance: " + btcBalance;
    }
}
