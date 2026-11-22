package semestr1.practice7;

public class DocumentPrinter {
    public void print(String message){
        System.out.println(message);
    }
    public void print(int number){
        System.out.println("[INT]:" + 123);
    }
    public void print(double number, int decimals){
        String result = String.format("%.2f", 15.6789);
    }
    public void print(String[] lines){
        for(int i = 0; i < lines.length; i++){
            System.out.println((i + 1) + "." + lines[i]);

        }
    }
    public void print(String message, boolean uppercase){
        if (uppercase == true){
            System.out.println(message.toUpperCase());}
        else {
            System.out.println(message);
        }
    }
}
