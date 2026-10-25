package semestr1.practice4;

import java.util.Scanner;
import java.util.SequencedCollection;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Завдання 1");

        for (int i = 0; i < 3; i++) {
            System.out.println("Java - надійна та кросплатформна мова!");
        }
        System.out.println("Завдання 2");
        System.out.println("Введіть текст: ");
        String text = scaner.nextLine();
        System.out.println("Введіть кількість повторень: ");
        int N = scaner.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("[" + i + "]" + text);
        }
        System.out.println("Завдання 3");
        int money = 0;
        for (int i = 1; i <= 12; i++) {
            money = money + 500;
            System.out.println("Місяц " + i + ":" + money + "грн");
        }
        System.out.println("Завдання 4");
        double rate = 44.5;
        double coste = 0;
        for (int i = 10; i <= 100; i = i + 10) {
            double cost = i * rate;
            System.out.println("З " + i + "Євро, виходить" + cost + "грн");
        }
        System.out.println("Завдання 5");
        System.out.println("Введіть довжину рамки: ");
        int W = scaner.nextInt();
        for (int i = 1; i <= W; i++) {

            System.out.print("=");
            System.out.println("Завдання 6");
            int number = 10;

            while (number >= 1) {
                System.out.println(number);
                number--;
            }

            System.out.println("Поїхали! Ракета запущена!");
        }
        System.out.println("Завдання 7");
        System.out.println("Введіть ціле число A");

        int number1 = scaner.nextInt();
        int sum = 0;

        while (number1 != 0) {
            sum = number1 + sum;
            number1 = scaner.nextInt();
        }

        System.out.println(sum);

        System.out.println("Завдання 8");
        System.out.println("Введіть число M");
        int M = scaner.nextInt();
        int number2 = 1;
        while (number2 <= M) {
            System.out.println(number2);
            number2 = number2 * 2;
        }

        System.out.println("Завдання 9");
        System.out.println("Введіть ціле додатне число N");

        int N1 = scaner.nextInt();
        int count = 0;
        int sum2 = 0;
        while (N1 != 0) {
            int digit = N1 % 10;
            sum = sum + digit;
            count = count + 1;
            N1 = N1 / 10;
        }
        System.out.println("Кількість цифр: " + count);
        System.out.println("Сума цифр: " + sum);
        System.out.println("Введіть ціле додатне число N");
        int с = scaner.nextInt();
        int count1 = 0;
        int sum3 = 0;
        while (с != 0) {
            int digit = с % 10;
            sum3 = sum3 + digit;
            count1 = count1 + 1;
            с = с / 10;
        }
        System.out.println("Кількість цифр: " + count1);
        System.out.println("Сума цифр: " + sum3);

        System.out.println("Завдання 10");
        int s = 12345;
        int cifra = 0;
        int reverse = 0;
        while (s != 0) {
            cifra = s % 10;
            reverse = reverse * 10 + cifra;
            s = s / 10;
        }

        System.out.println("Завдання 11");
        System.out.println("Внесок у банк становить:  ");
        double start = scaner.nextDouble();
        double balance = start;
        int years = 0;
        double interest = 0.01;
        while (balance < start * 2) {
            double interestMoney = balance * interest;
            balance = balance + interestMoney;
            years = years + 1;
        }
        System.out.println("Кількість років: " + years);
        System.out.println("Завдання 12");
        System.out.println("Напишить число: ");
        int number = scaner.nextInt();
        int result = 0;
        int proba = 1;
        while (number % proba != 0) ;
        {
            proba = proba + 1;
        }
        System.out.println(proba);
        System.out.println("Завдданя 13");

        int rundom = (int) (Math.random() * 100) + 1;
        System.out.println("вгадай таємне число");
        int proba1 = scaner.nextInt();
        int move = 1;
        while (proba1 < rundom) {
            System.out.println("Більше!");
            break;
        }

        while (proba1 > rundom) {
            System.out.println("Менше!");
            break;
        }

        System.out.println("Завання 14");
        System.out.println("Виберіть пункт ");
        int choice;

        do {
            System.out.println("1. Розпочати нову гру");
            System.out.println("2. Завантажити збереження");
            System.out.println("3. Налаштування");
            System.out.println("0. Вихід");

            choice = scaner.nextInt();

            if (choice == 1) {
                System.out.println("Розпочинаємо нову гру!");
            } else if (choice == 2) {
                System.out.println("Завантажуємо збереження!");
            } else if (choice == 3) {
                System.out.println("Відкриваємо налаштування!");
            }

        } while (choice != 0);
        System.out.println("Завання 15");
        int age;
        do {
            System.out.println("Який у вас вік?");
            age = scaner.nextInt();
        } while (age < 1 || age > 120);
        System.out.println("Вік підтверджено: " + age);
        System.out.println("Завдання 16");
        // 1234
        int pin = 1234;
        int attempt = 1;
        do {
            System.out.println("Введіть PIN: ");
            int test = scaner.nextInt();
            if (test == pin) {
                System.out.println("Доступ надано");
                break;
            }
            attempt = attempt + 1;
        } while (attempt <= 3);

        System.out.println("Завдання 17");

        char answer;

        do {
            System.out.println("Введіть перше число:");
            int a = scaner.nextInt();

            System.out.println("Введіть друге число:");
            int b = scaner.nextInt();

            System.out.println("Результат: " + (a + b));

            System.out.println("Бажаєте продовжити? (y/n)");
            answer = scaner.next().charAt(0);

        } while (answer == 'y');

        System.out.println("Завдання 18");
        int cube1;
        int cube2;
        int attempt1 = 1;
        do {
            cube1 = (int) (Math.random() * 20) + 1;
            System.out.print(" Спроба:" + attempt1 + "     Перша кисть:" + cube1);
            attempt1 = attempt1 + 1;
            cube2 = (int) (Math.random() * 20) + 1;
            System.out.println("    Друга кисть:" + cube2);

        } while (cube1 != cube2);
        System.out.println("Завдання 19");
        int H;
        int Z;
        do {
            System.out.println("Ведіть чисельник: ");
            H = scaner.nextInt();

            System.out.println("Ведіть знаменник: ");
            Z = scaner.nextInt();
            System.out.println(H);
            System.out.println("___");
            System.out.println(Z);
        } while (Z == 0);
        System.out.println("Завдання 20");
        int ball;
        int sum1 = 0;
        int count2 = 0;
        do {
            System.out.println("Введіть бал:");
            ball = scaner.nextInt();

        } while (ball >= 0);

        double average = (double) sum1 / count2;

        System.out.println("Середній бал: " + average);

        System.out.println("Завдання 21");
        System.out.println("Число А: ");
        int A = scaner.nextInt();
        System.out.println("Число B: ");
        int B = scaner.nextInt();
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("Завдання 22");
        System.out.println("Введіть букавку: ");
        int Q = scaner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= Q; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);

        System.out.println("Завдання 23");
        for (int i = 1; i <= 10; i++) {
            int square = i * i;
            int cube = i * i * i;

            System.out.println("Число " + i + "|" + square + "|" + cube);
        }
        System.out.println("Завдання 24");
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                continue;
            System.out.print(i + " ");
        }
        System.out.println("Завдання 25");
        for (int i = 100; i <= 200; i++) {
            if (i % 13 == 0 && i % 7 == 0)
                break;
            System.out.println(i + " ");
        }

        System.out.println("Завдання 26");
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i + " ");
        }
        System.out.println("Завдання 27");
        int E = scaner.nextInt();
        int S = 0;
        for (int i = 1; i <= E; i++) {
            if (S % 2 == 0) {
                S = S - i;
            } else {
                S = S + i;
            }

        }
        System.out.println(S);
        System.out.println("Завдання 28");
        System.out.println("Перший член: ");
        int X = scaner.nextInt();
        System.out.println("Різниця: ");
        int riz = scaner.nextInt();
        System.out.println("Кількість: ");
        int progres = 0;
        int kal = scaner.nextInt();
        int result1;
        for (int i = 1; i <= kal; i++) {
            progres = progres + riz;
            System.out.println(i + " = " + progres);
        }
        System.out.println("Завдання 29");
        byte b = 125;
        for (int i = 1; i <= 6; i++) {
            b = (byte) (b + 1);
            System.out.println(b);
        }
        System.out.println("Завдання 30");
        System.out.println("Введіть  кількість чисел: ");
        int N2 = scaner.nextInt();
        int sum4 = 0;
        for (int i = 1; i <= N2; i++) {
            System.out.println("Введіть число:");
            int number3 = scaner.nextInt();
            sum4 = sum4 + number3;
        }
        System.out.println("Точне середнє: " + (double) sum4 / N2);
        System.out.println("Без приведення: " + sum4 / N2);

        System.out.println("Завдання 31");
        System.out.println("Напишить слово: ");
        String word = scaner.nextLine();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            char newletter = (char) (letter + 1);

            System.out.print(newletter);
        }

        System.out.println("Завдання 32");
        double price1 = 19.99;
        double price2 = 45.50;
        double price3 = 12.10;
        double price4 = 99.95;
        double price5 = 3.40;
        int full = (int) price1 + (int) price2 + (int) price3 + (int) price4 + (int) price5;
        int kopiyky = (int) ((price1 - (int) price1) * 100)
                + (int) ((price2 - (int) price2) * 100)
                + (int) ((price3 - (int) price3) * 100)
                + (int) ((price4 - (int) price4) * 100)
                + (int) ((price5 - (int) price5) * 100);

        System.out.println("Загальна сума цілих гривень: " + full);
        System.out.println("Сума копійок: " + kopiyky);

        System.out.println("Завдання 33");
        for (int i = 1; i <= 50; i++){
            int loading = (int) (((double) i / 50) * 100);
            System.out.println("Завантажено: " + loading + "%");
        }
        System.out.println("Завдання 34");
        long bigNumber = 3_000_000_000L;

        System.out.println((int) bigNumber);
        System.out.println("Завдання 35");
        for (int i = 0; i <= 10; i++) {
            double val = i / 10.0;
            System.out.println(val);
        }
        for (double d = 0.0; d <= 1.0; d += 0.1) {
            System.out.println(d);
        }

        System.out.println("Завдання 36");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

        System.out.println("Завдання 37");
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= 2; i++) {
            System.out.print("*");

            for (int j = 1; j <= 3; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.println("Завдання 38");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Завдання 39");
        System.out.println("Введіть число: ");
        int number3 = scaner.nextInt();
        for (int i = 2; i <= number3; i++) {
            boolean prostoe = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    prostoe = false;
                    break;
                }
            }
            if (prostoe) {
                System.out.println(i);
            }
        }
        System.out.println("Завдання 40");
        System.out.println("Введіть розмір дошки:");
        int q = scaner.nextInt();

        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= q; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("_ ");
                } else {
                    System.out.print("# ");
                }
            }

            System.out.println();
        }
    }
}

























