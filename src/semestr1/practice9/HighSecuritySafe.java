package semestr1.practice9;

public class HighSecuritySafe {
    private int pinCode;
    private double storedCash = 0;
    private int failedAttempts = 0;
    private boolean permanentlyBlocked = false;

    public HighSecuritySafe(int pinCode) {
        this.pinCode = pinCode;
        this.storedCash = storedCash;
        this.failedAttempts = failedAttempts;
        this.permanentlyBlocked = permanentlyBlocked;
    }

    private boolean checkAccess(int enteredPin) {
        if (permanentlyBlocked) {
            return false;
        }
        if (enteredPin != pinCode) {
            failedAttempts++;
            if (failedAttempts >= 3) {
                permanentlyBlocked = true;
            }
            return false;
        }
        failedAttempts = 0;
        return true;

    }
    public void putCash(int pin, double amount){
        if(checkAccess(pin)){
            if(amount > 0){
                storedCash += amount;
                System.out.println("Гроші додано: " + amount);
            } else {
                System.out.println("Доступ заборонено!");
            }

        }
    }
   public void takeCash(int pin, double amount){
       if(checkAccess(pin)){
           if(amount >0 && amount <= storedCash) {
               storedCash -= amount;
               System.out.println("Гроші знято: " + amount);
           } else {
               System.out.println("Недостатньо коштів або неправильна сума!");
           }
       } else {
           System.out.println("Доступ заборонено!");
       }
   }
}

