package semestr1.practice6;

public class UserAccount {
    private String username;
    private String password;
    public void setCredentials(String u, String p){
        username = u;
        password = p;
    }
    public boolean login(String enteredUser, String enteredPass) {
        if (enteredUser.equals(username) && enteredPass.equals(password)) {
            return true;
        } else {
            System.out.println("Неправильний пароль або ім'я");
            return false;
            }
        }

    public void changePassword(String oldPass, String newPass) {
        if (oldPass.equals(password)) {
            password = newPass;
            System.out.println("Пароль змінено");
        } else {
            System.out.println("Старий пароль неправильний");
        }
    }


}
