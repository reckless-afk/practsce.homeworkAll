package semestr1.practice3;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Завдання 1");
        System.out.println("=== ВХІДНІ ДАНІ ===");
        System.out.println("Ведіть своє ім'я ");
        String name = scanner.nextLine();
        System.out.print("Введіть прізвище: ");
        String surname = scanner.nextLine();
        System.out.println("Вік ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Місто проживання ");
        String home = scanner.nextLine();
        System.out.println("-------------------");
        System.out.println("Привіт" + ", " + name + " " + surname + "З міста" + home + "Твій вік: " + age);


        System.out.println("Завдання 2");
        System.out.println("Введіть перше число: ");
        int a = scanner.nextInt();
        System.out.println("Введіть друге число: ");
        int b = scanner.nextInt();
        System.out.println("Cума: " + (a + b));
        System.out.println("Різниця : " + (a - b));
        System.out.println("Добуток: " + (a * b));
        System.out.println("Остача: " + (a % b));


        System.out.println("Завдання 3");
        System.out.println("Введіть суму в гривнях (UAH): ");
        double uah = scanner.nextDouble();

        System.out.println("Ведіть курс USD: ");
        double usd = scanner.nextDouble();

        System.out.println("Сума до видачі: " + (uah / usd));
        System.out.println("Округлено: " + Math.round(uah / usd));
        System.out.println("Завдання 4");
        System.out.print("Номер студентського квитка: ");
        int tikcet = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Повне ім'я студента: ");
        String fullname = scanner.nextLine();
        System.out.println(fullname + "," + "Квиток №" + tikcet +
                "Спеціальність: Інженерія програмного забезпечення");
        System.out.println("Завдання 5");
        System.out.println("Ваш зріст (м): ");
        double height = scanner.nextDouble();

        System.out.println("Ваша вага (кг): ");
        double weight = scanner.nextDouble();

        System.out.println("Розрахований BMI: ");
        double bmi = weight / (height * height);
        System.out.println("Розрахований BMI: " + bmi);
        System.out.println("Завдання 6");
        System.out.println("Введіть символ: ");
        char ch = scanner.next().charAt(0);
        System.out.println("Символ: " + ch + " | Код символу: " + (int) ch);
        System.out.println("Завдання 7");
        System.out.println("Катет A:");
        double katetA = scanner.nextInt();

        System.out.println("Катет B:");
        double katetB = scanner.nextInt();

        double gipot = Math.sqrt(Math.pow(katetA, 2) + Math.pow(katetB, 2));
        System.out.println(gipot);
        double P = (katetA + katetB + gipot);
        double area = (katetA * katetB) / 2;

        System.out.println("Гіпотенуза: " + gipot);
        System.out.println("Периметр: " + P);
        System.out.println("Площа: " + area);


        System.out.println("Завдання 8");
        System.out.println("Товар: ");
        String tovar = scanner.nextLine();
        System.out.println("Ціна");
        double price = scanner.nextDouble();

        System.out.println("Кількість: ");
        int namber = scanner.nextInt();

        System.out.println("Загальна кількість: ");
        double allpraice = namber * price;
        scanner.nextLine();
        System.out.println("Загальна кількість: " + allpraice);
        System.out.print("З них ПДВ 20%: " + allpraice * 20 / 100 + "грн");
        System.out.println("Завдання 9");
        System.out.println("Введіть ціле число: ");
        int numeric = scanner.nextInt();
        if (numeric > 0) {
            System.out.println("Додатнє число: ");
        } else if (numeric < 0) {
            System.out.println("Від'ємне число: ");
        } else if (numeric == 0) {
            System.out.println("число дорівнює нулю: ");
        }
        System.out.println("Завдання 10");
        System.out.println("Введіть ціле число: ");
        int number1 = scanner.nextInt();
        if (number1 == 0) {
            System.out.println("Число є нулем");
        } else if (number1 % 2 == 0) {
            System.out.println("Число " + number1 + " є парним.");
        } else {
            System.out.println("Число " + number1 + " є непарним.");
        }
        System.out.println("Завдання 11");
        System.out.println("Ведіть вік: ");
        int age1 = scanner.nextInt();
        if (age1 < 0 || age1 > 120) {
            System.out.println("Некоректний вік");
        } else if (age1 <= 12) {
            System.out.println("Дитина");
        } else if (age1 <= 17) {
            System.out.println("Підліток");
        } else if (age1 <= 64) {
            System.out.println("Дорослий");

        } else {
            System.out.println("Літня людина");
        }
        System.out.println("Завдання 12");
        System.out.println("підсумковий тестовий бал студента: ");
        int ball = scanner.nextInt();
        if (ball < 0 || ball > 100) {
            System.out.println("Некоректний бал");
        } else if (ball >= 0 && ball <= 59) {
            System.out.println("Незадовільно(F)");
        } else if (ball >= 60 && ball <= 63) {
            System.out.println("Достатньо (Е)");
        } else if (ball >= 64 && ball <= 73) {
            System.out.println("Задовільно (D)");
        } else if (ball >= 74 && ball <= 81) {
            System.out.println("Добре (C)");
        } else if (ball >= 82 && ball <= 89) {
            System.out.println(" добре (B)");
        } else {
            System.out.println("Відмінно (А)");
        }
        System.out.println("Завдання 13");
        System.out.println("Введіть 3 числа : ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A > B && A > C) {
            System.out.println("Максимум" + A);
        } else if (B > A && B > C) {
            System.out.println("Мaксимум" + B);
        } else {
            System.out.println("Максимум" + C);
        }

        if (A < B && A < C) {
            System.out.println("Мінімум: " + A);
        } else if (B < A && B < C) {
            System.out.println("Мінімум: " + B);
        } else {
            System.out.println("Мінімум: " + C);
        }
        System.out.println("Завдання 14");
        System.out.println("координати точки: ");
        double coordinatesX = scanner.nextDouble();
        double coordinatesY = scanner.nextDouble();
        if (coordinatesX == 0 && coordinatesY == 0) {
            System.out.println("Точка " + coordinatesX + "і" + coordinatesY + "Лежать на початку координати");
        } else if (coordinatesX == 0) {
            System.out.println("Точка " + coordinatesX + coordinatesY + "лежить на осі Y.");
        } else if (coordinatesY == 0) {
            System.out.println("Точка " + coordinatesX + coordinatesY + "лежить на осі X.");
        } else if (coordinatesX > 0 && coordinatesY > 0) {
            System.out.println("Точка " + coordinatesX + coordinatesY + "знаходиться у I чверті.");
        } else if (coordinatesX < 0 && coordinatesY > 0) {
            System.out.println("Точка " + coordinatesX + coordinatesY + "знаходиться у II чверті.");
        } else if (coordinatesX < 0 && coordinatesY < 0) {
            System.out.println("Точка " + coordinatesX + coordinatesY + "знаходиться у III чверті.");
        } else {
            System.out.println("Точка" + coordinatesX + coordinatesY + "знаходиться у IV чверті.");
        }
        System.out.println("Завдання 15");
        int x = 5;
        int y = 20;
        if (x > 10)
            if (y > 10)
                System.out.println("y більше 10");
            else

                System.out.println("Завдання 16");
        System.out.println("y не більше 10");
        System.out.println("Завдання 16");
        System.out.println("Введіть обсяг спожитої електроенергії (в кВт·год): ");
        double KV = scanner.nextDouble();
        if (KV <= 100) {
            System.out.println(KV * 2.64);
        } else {
            System.out.println(100 * 2.64 + (KV - 100) * 4.32);
        }
        System.out.println("Завдання 17");
        System.out.println("Введіть значення X та Y: ");
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int max = (X > Y) ? X : Y;
        System.out.println("Максимальне число: " + max);
        System.out.println("Завдання 18");
        System.out.println("Введіть значення");
        int n = scanner.nextInt();
        n = (n < 0) ? -n : n;
        System.out.println("Абсолютне значення " + n);
        System.out.println("Завдання 19");
        System.out.println("Введіть число: ");
        int number2 = scanner.nextInt();
        String result = (number2 % 2 == 0) ? "Парне" : "Непарне";
        System.out.println(result);
        System.out.println("Завдання 20");
        System.out.println("Бал студента: ");
        int mark = scanner.nextInt();

        String result1 = (mark >= 60 ? "Зараховано" : "Незараховано");
        System.out.println(result1);
        System.out.println("Завдання 21");
        System.out.println("Напіщі ціферку:");
        int number3 = scanner.nextInt();
        String status = (number3 > 0) ? "Додатне" : (number3 < 0) ? "Від'ємне" : "Нуль";
        System.out.println("Атвічаю твоя ціферка ета " + status);
        System.out.println("Завдання 22");
        System.out.println("Cума покупки: ");
        double sum = scanner.nextDouble();
        double result2 = (sum > 1000)
                ? sum - (sum * 10) / 100
                : sum - (sum * 2) / 100;
        System.out.println("До сплати зі знижкою: " + result2);
        System.out.println("Завдання 23");
        System.out.println("Введіть два числа: ");
        double pi = scanner.nextDouble();
        double didi = scanner.nextDouble();
        System.out.println((didi != 0) ?
                (double) pi / didi
                : "Ахтунг: Ішак, бєле на нолік дєліть неможна");
        System.out.println("Завдання 24");
        System.out.println("Введіть кількість помилок: ");

        int count = scanner.nextInt();

        String result4 = (count == 1)
                ? "Знайдено 1 помилку"
                : "Знайдено " + count + " помилок";

        System.out.println(result4);
        System.out.println("Завдання 25");

        System.out.println("Напишить два числа щоб поділити їх: ");
        int x1 = 10;
        int divisor = 0;
        if (divisor != 0 && (x1 / divisor > 1)) {
            System.out.println("Успішне ділення");
        } else {
            System.out.println("Ділення безпечно пропущено завдяки short-circuit!");
        }// Оскільки divisor дорівнює 0, ця умова false.

        System.out.println("Завдання 26");
        System.out.println("Напішить два числа для інкримента: ");
        int counter1 = 10;
        int counter2 = 0;
        boolean b1 = false && (++counter1 > 0);
        boolean b2 = false & (++counter2 > 0);
        System.out.println("counter1 = " + counter1);
        System.out.println("counter2 = " + counter2);
        System.out.println("Завдання 27");
        int number = 5;
        if (number > 0 || (10 / 0 == 0)) {
            System.out.println("Умова виконана, аварійне ділення не викликалося!");
        }// томущо перша умова вказує що int number 5 > 0.
        System.out.println("Завдання 28");
        int counterC = 0;
        int counterB = 0;
        boolean test1 = true || (++counterC > 0);
        boolean test2 = true | (++counterB > 0);
        System.out.println("counterC = " + counterC);
        System.out.println("counterB = " + counterB);
        System.out.println("Завдання 29");
        System.out.println("Введіть години: ");
        int hours = scanner.nextInt();
        System.out.print("Введіть хвилини: ");
        int minutes = scanner.nextInt();
        boolean isValidTime = (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59);
        if (isValidTime) {
            System.out.println(hours + ":" + minutes);
        } else {
            System.out.println("Помилка: некоректний час");
        }

        System.out.println("Завдання 30");
        System.out.println("Введіть сторону а: ");
        int a1 = scanner.nextInt();
        System.out.println("Введіть сторону b: ");
        int b3 = scanner.nextInt();
        System.out.println("Введіть сторону c: ");
        int c1 = scanner.nextInt();
        if ((a1 + b3) > c1 && (a1 + c1) > b3 && (b3 + c1) > a1) {
            System.out.println("Трикутник існує: true");
        } else {
            System.out.println("Трикутник існує: false");
        }
        System.out.println("Завдання 31");

        System.out.print("Введіть число: ");
        int N = scanner.nextInt();

        boolean isEvenBitwise = (N & 1) == 0;
        boolean isEvenNormal = N % 2 == 0;

        System.out.println("Парне через &: " + isEvenBitwise);
        System.out.println("Парне через %: " + isEvenNormal);

        System.out.println("& 1 перевіряє останній двійковий біт числа.");
        System.out.println("Якщо останній біт 0 — число парне, якщо 1 — непарне.");

        System.out.println("Завдання 32");
        System.out.println("Введіть PIN: "); // 4333
        int isPinCorrect = 4333;
        int isPinCorrec = scanner.nextInt();
        double Balance = 40000.0;
        if (isPinCorrec == isPinCorrect) {
            System.out.println("|| КАРТА РОЗБЛОКОВАНА ||");
            System.out.println("БАЛАНС: " + Balance);
            System.out.println("СУМА ЗНЯТТЯ: ");
            double withdrawal = scanner.nextDouble();
            double isDailyLimitExceeded = 20000.0;
            if (withdrawal <= Balance && withdrawal <= 20000) {
                System.out.println("Зачекайте будь ласка...Дякую що скористались банкоматомю.");
            } else {
                System.out.println("Привищено добовий леміт, спрбуйте будь ласка пізніше.");
            }
        } else {
            System.out.println("|| КАРТА ЗБЛОКОВАНА ||");
        }
        System.out.println("Завдання 33");
        System.out.println("Введіть номер дня:");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понеділок");
                break;
            case 2:
                System.out.println("Вівторок");
                break;
            case 3:
                System.out.println("Середа");
                break;
            case 4:
                System.out.println("Четвер");
                break;
            case 5:
                System.out.println("П'ятниця");
                break;
            case 6:
                System.out.println("Субота");
                break;
            case 7:
                System.out.println("Неділя");
                break;
            default:
                System.out.println("Некоректний номер дня");
        }

        System.out.println("Завдання 34");
        System.out.println("Введіть номер дня: ");
        int day1 = scanner.nextInt();


        switch (day1) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Будній (робочий) день");
                break;

            case 6:
            case 7:
                System.out.println("Вихідний день");
                break;

            default:
                System.out.println("Некоректний номер дня");
        }
        System.out.println("Завдання 35");
        System.out.println("Введіть номер місяця: ");
        int month = scanner.nextInt();

        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 0;
        };

        System.out.println("Кількість днів: " + days);
        System.out.println("Завдання 36");
        System.out.println("Введіть назву місяця: ");

        String name1 = scanner.nextLine();

        String season = switch (name1) {
            case "січень", "лютий", "грудень" -> "Зима";
            case "березень", "квітень", "травень" -> "Весна";
            case "червень", "липень", "серпень" -> "Літо";
            case "вересень", "жовтень", "листопад" -> "Осінь";
            default -> "Некоректна назва місяця";
        };

        System.out.println(season);

        System.out.println("Завдання 37");
        System.out.println("Оберіть спосіб доставки:");
        System.out.println("1 — Самовивіз");
        System.out.println("2 — Кур'єр");
        System.out.println("3 — Поштомат");

        int delivery = scanner.nextInt();

        System.out.println("Введіть вагу товару:");
        double weight1 = scanner.nextDouble();

        int price1 = switch (delivery) {
            case 1 -> 0;

            case 2 -> {
                if (weight1 > 5) {
                    yield 150;
                } else {
                    yield 90;
                }
            }

            case 3 -> 60;

            default -> -1;
        };

        System.out.println("Вартість доставки: " + price1 + " грн");
        System.out.println("Завдання 38");

        System.out.print("Число 1: ");
        double a4 = scanner.nextDouble();

        System.out.print("Оберіть операцію (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        System.out.print("Число 2: ");
        double b4 = scanner.nextDouble();

        double result6 = switch (op) {
            case '+' -> a4 + b4;
            case '-' -> a4 - b4;
            case '*' -> a4 * b4;
            case '/' -> {
                if (b4 == 0) {
                    System.out.println("Помилка: ділення на нуль");
                    yield 0;
                } else {
                    yield a4 / b4;
                }
            }
            default -> {
                System.out.println("Некоректна операція");
                yield 0;
            }
        };

        System.out.println("Результат: " + result6);
        System.out.println("Завдання 39");
        System.out.println("Введіть команду: ");

        String command = scanner.nextLine();
        // == порівнює посилання на об'єкти, а не сам текст.
        // Тому command == start може повернути false.
        if (command == "start") {
            System.out.println("== спрацювало");
        }
        if (command.equalsIgnoreCase("start")) {
            System.out.println("Система успішно запущена!");
        }

        switch (command) {
            case "start" -> System.out.println("Система успішно запущена!");
            case "pause" -> System.out.println("Система призупинена!");
            case "stop" -> System.out.println("Система зупинена!");
            case "exit" -> System.out.println("Вихід із системи!");
            default -> System.out.println("Невідома команда!");
        }


        System.out.println("Завдання 40");
        System.out.println("================ БАНКОМАТ ================");
        System.out.println("Введіть PIN: ");
        int pin = scanner.nextInt();
        if (pin == 1234) {
            System.out.println("Авторизація успішна!");
            System.out.print("Оберіть дію");
            System.out.print("(1 - Перевірити баланс, ");
            System.out.print("2 - Поповнити рахунок, ");
            System.out.print("3 - Зняти готівку, ");
            System.out.print("4 - Завершити роботу)");
            double balance = 5000.0;
            int operation = scanner.nextInt();
            switch (operation) {
                case 1 -> {
                    System.out.println("Перевірити баланс");
                    System.out.println("Ваш баланс: " + balance + " грн");
                    System.out.println("5000.0");

                }
                case 2 -> System.out.println("Поповнити рахунок");

                case 3 -> {
                    System.out.println("Зняти готівку");
                    System.out.println("Введіть суму зняття: ");
                    System.out.println("Увага! Комісія операції: 20.0 грн ");
                    double money1 = scanner.nextDouble();
                    if (money1 > 0 && money1 <= balance) {
                        double commission = money1 > 1000 ? money1 * 1 / 100 : 0;
                        System.out.println("Зачекайте будь ласка... Гарного дня!");


                    } else {
                        System.out.println("Не достатньо коштів");
                    }
                }
                case 4 -> System.out.println("Завершити роботу");
            }

        } else {
            System.out.println("Пароль не вірний!");
        }
        scanner.close();
    }
}





































































































