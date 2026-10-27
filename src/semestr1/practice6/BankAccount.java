package semestr1.practice6;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }
        public boolean withdraw( double amount){
            if (amount > balance){
                return false;
            }
            else {
                balance = balance - amount;
                return true;
            }
        }
            public double getBalance() {
                return balance;
            }
    }

