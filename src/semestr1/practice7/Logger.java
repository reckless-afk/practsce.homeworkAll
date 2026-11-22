package semestr1.practice7;

public class Logger {
    public void log(String message){
        System.out.println("[INFO]" + message);
    }
    public void log(String level, String message){
        System.out.println("[" + level + "]" + message);
    }
    public void log(String level, int errorCode, String message) {
        System.out.println("[" + level + "] (Code: " + errorCode + "):" + message);
    }
        public void log(String tag, String message, boolean timestamp){
            if (timestamp == true) {
                System.out.println("[" + tag + "] " +
                        System.currentTimeMillis() + ": " + message);
            } else {
                System.out.println("[" + tag + "] " + message);
            }

        }
    }

