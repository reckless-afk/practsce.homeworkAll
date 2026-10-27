package semestr1.practice6;

public class TextFormatter {
    String text = "*** ТЕКСТ ***";

    public String formatTitle(String text) {
        return "****" + text.toUpperCase() + "****";
    }

    public int countVowels(String text){
        int count = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            if ("аоуеиіяюєїaeiou".indexOf(letter) != -1) {
                count++;
            }
        }

        return count;
    }

    }

