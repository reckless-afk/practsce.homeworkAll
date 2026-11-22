package semestr1.practice7;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

        if (initialBalance < 0) {
            balance = 0.0;
        }
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (balance > 0) {
            balance = balance + amount;
            System.out.println("Поповнення");
        } else {
            System.out.println("Операція неможлива!");

        }
    }


    public boolean withdraw(double amount) {

        if (amount <= 0 || amount > balance) {
            System.out.println("Недостатньо коштів або неправильна сума!");
            return false;
        } else {
            balance = balance - amount;
            System.out.println("Знято з рахунку: " + amount);
            return true;
        }

    }

    public void printAccount() {
        System.out.println("Номер рахунку: " + accountNumber);
        System.out.println("Власник: " + ownerName);
        System.out.println("Баланс: " + balance);
    }
}