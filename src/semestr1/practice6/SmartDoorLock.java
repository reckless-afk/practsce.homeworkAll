package semestr1.practice6;

public class SmartDoorLock {
    private int pinCode = 1234;
    private boolean isLocked = true;
    private int failedAttempts = 0;
    public void enterPin(int enteredPin){
        if (failedAttempts >= 3) {
            System.out.println("СИСТЕМА ЗАБЛОКОВАНА! Викличте охорону.");
        }
       else if (pinCode != 1234) {
            failedAttempts = failedAttempts + 1;
            if (failedAttempts >= 3) {
                System.out.println("СИСТЕМА ЗАБЛОКОВАНА! Викличте охорону.");
                System.out.println("СИСТЕМА ЗАБЛОКОВАНА! Викличте охорону.");
            }
        }
       if (enteredPin == pinCode && failedAttempts < 3){
           isLocked = false;
           System.out.println("Ласкаво просим!");
       }
    }
}