package semestr1.practice9;

public class BankAccount {
    private final String iban;
    private double balance;

    public BankAccount(String iban, double balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }


    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }

        balance += amount;
        return true;
    }
        public boolean withdraw ( double amount){
            if (amount <= 0 || amount > balance) {
                return false;
            }

            balance -= amount;
            return true;
        }
    }
