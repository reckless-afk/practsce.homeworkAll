package semestr1.practice2;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println("завдання 1");
        int age = 18;
        System.out.println( age);
        double height = 1.78;
        System.out.println(height);
        char firstLetter = 'A';
        System.out.println(firstLetter);
        boolean isStudent = true;
        System.out.println(isStudent);
        System.out.println("завдання 2");
        byte temperature = -15;
        System.out.println(temperature);
        short currentYear = 2026;
        System.out.println(currentYear);
        int cityPopulation = 1200000;
        System.out.println(cityPopulation);
        long worldPopulation = 8100000000L;
        System.out.println(worldPopulation);
        System.out.println("завдання 3");
        float floatValue = 1.1234567f;
        System.out.println( 1.1234567f);
             double doubleValue = 1.123456789012345;
        System.out.println(doubleValue);
        System.out.println("завдання 4");
            char symbol1 = 'J';
        System.out.println(symbol1);
            char symbol2 = 74;
        System.out.println(symbol2);
            char symbol3 ='\u004A';
        System.out.println(symbol3);
        System.out.println("завдання 5");
            boolean isJavaFun = true;
        System.out.println(isJavaFun);
            boolean isFishFly = false;
        System.out.println(isFishFly);
            boolean isSkyBlue = true;
        System.out.println(isSkyBlue);
        System.out.println("завдання 6");
            final double GRAVITY = 9.81;
        System.out.println(GRAVITY);
            final int DAYS_IN_WEEK = 7;
        System.out.println(DAYS_IN_WEEK);
            final String UNIVERCWITY_NAME = "Львівська Політехніка";
        System.out.println(UNIVERCWITY_NAME);
        System.out.println("завдання 7");
            int intVal = 250;
            double doubleVal = intVal;
        System.out.println( intVal);
        System.out.println(doubleVal);
        System.out.println("завдання 8");
            double priceWithPennies = 49.99;
            int roundedPrice = (int) priceWithPennies;
        System.out.println(roundedPrice);
        System.out.println("завдання 9");
        int number = 5;
        double userWeight = 72.5;
        String userCity = "Kyiv";
        boolean IsValidUser = true;
        System.out.println(number);
        System.out.println(userCity);
        System.out.println(IsValidUser);
        System.out.println("завдання 10");
        String firstName = "Тарас";
        String lastName = "Шевченко";
        age = 47;
        System.out.println("Мене звати " + firstName + " " + lastName + ", мені " + age + " років.");
        System.out.println("завдання 11");
        int a = 10;
        int b = 20;
        System.out.println("Сума без дужок: " + a + b); // тут інтл думає що я склеюю 10 і 20, через текст. А знизу є дужки і інтл робить функцію як потужний приклад;
        System.out.println("Сума з дужками: " + (a + b));
        System.out.println("завдання 12");
        String login = "ivan.petrenko";
        String domain = "gmail.com";
        String role = "student";
        System.out.println("Корстувач "  + login + " (Роль:" + role + ") Має пошту: " + login + "@" + domain);
        System.out.println("завдання 13");
        String productName = "Ноутбук";
        int quantity = 2;
        double pricePerUnit = 24500.50;
        System.out.println("ЧЕК:\n"
                + "Товар:" + productName +
                "\n" + "Кількість:" + quantity +
                "шт.\n" + "Ціна: " + pricePerUnit);
        System.out.println("завдання 14");
        String currency = "UAH";
        int hryvnias = 1500;
        int kopecks = 75;
        System.out.println("Поточний баланс: " + hryvnias + "." + kopecks);
        System.out.println("завдання 15");
        String protocol = "https://";
        String host = "api.example.com";
        String endpoint = "/users";
        int userId = 42;
        System.out.println("Запит відправлено на:" + protocol + host + endpoint);
        System.out.println("завдання 16");
        String language = "Java";
        int level = 1;
        boolean isReady = true;
        System.out.println("Мова: " + language +  " | " + "Рівень:" + level +" | " + "Готовність до практики: " + isReady );
        System.out.println("завдання 17");
        number = 19;
        int remainder = number % 2;
        System.out.println("Число " + number + " при діленні на 2 дає остачу: " + remainder);
        System.out.println("завдання 18");
        int totalSeconds = 385;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        System.out.println(totalSeconds + " секунд = " + minutes + " хв " + seconds + " сек");
        System.out.println("завдання 19");
        int n = 47;
        System.out.println(a =(n / 10));
        System.out.println(b =(n % 10));
        System.out.println("число: " + n + "." + " Десятки: " + b + "." + " Сума цифр: " + "11");
        System.out.println("завдання 20");
        int score = 100;
        score += 50;
        System.out.println("Після додавання: " + score);
        score -= 20;
        System.out.println("Після віднімання: " + score);
        score *= 2;
        System.out.println("Після множення: " + score);
        score /= 4;
        System.out.println("Після ділення: " + score);
        System.out.println("завдання 21");
        int counter = 5;
        System.out.println(++counter); // x++  → покажи → додай 1 ++x  → додай 1 → покажи
        System.out.println("завдання 22");
        counter = 5;
        System.out.println(counter++); //  пояснив в 21 завданні
        System.out.println("завдання 23");
        int grade1 = 4;
        int grade2 = 5;
        int grade3 = 4;
        System.out.println((grade1 + grade2 + grade3)/ 3);
        System.out.println("Завдання 24");
        double celsius = 25.0;
        System.out.println("25.0" + "°C" + " = " + celsius * 1.8 + 32 + "\n" + "25.0" + "°C" + "=" + celsius + 273.15);
        System.out.println("Завдання 25");
        int userAge = 17;
        boolean isAdult = userAge >= 18;
        System.out.println(" Вік: 17. Чи є повнолітнім: " + isAdult );
        System.out.println("Завдання 26");
        int x = 15;
        int y = 20;
        System.out.println("x == y: " +  (x == y) + "\n" + "x != y: " + (x != y) + "\n" + "x > y: " + (x > y));
        System.out.println("Завдання 27");
        int speed = 75;
        boolean isSafeSpeed = (speed >= 20) && (speed <= 80);
        System.out.println(isSafeSpeed);
        System.out.println("Завдання 28");
        int personAge = 70;
        boolean hasFreePass = (personAge < 7) || (personAge >= 65);
        System.out.println("Вік: " + personAge + ". " + "Право на безкоштовний проїзд: " + hasFreePass);
        System.out.println("Завдання 29");
        boolean isDoorLocked = true;
        boolean canEnter = !isDoorLocked;
        System.out.println("Двері зачинені: " + isDoorLocked  + "\n" + "Чи можна увійти: " + canEnter );
        System.out.println("Завдання 30");
        number = 30;
        boolean isDivisibleByBoth = (number % 3 == 0) && (number % 5 == 0);
        System.out.println("результат для числа 30: " + isDivisibleByBoth);
        number = 25;
        isDivisibleByBoth = (number % 3 == 0) && (number % 5 == 0);
        System.out.println("результат для числа 25: " + isDivisibleByBoth);
        System.out.println("Завдання 31");
        boolean hasPassword = true;
        boolean hasSmsCode = true;
        boolean isAccountBlocked = false;
        boolean canLogin = hasPassword && hasSmsCode && !isAccountBlocked;
        System.out.println("Виведіть статус доступу: " + canLogin);
        System.out.println("Завдання 32");
        int year = 2024;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(isLeapYear);
        System.out.println("Завдання 33");
        double a1 = 3.0;
        double b1 = 4.0;
        double c = Math.sqrt(Math.pow(a1, 2) + Math.pow(b1, 2));
        System.out.println("Катети: " + a1 + " та " + b1 + ". Гіпотенуза: " + c);
        System.out.println("Завдання 34");
        double radius = 5.0;
        double length = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Радіус: " + radius);
        System.out.println("Довжина кола: " + length);
        System.out.println("Площа круга: " + area);
        System.out.println("Завдання 35");
        double dayTemp = 18.5;
        double nightTemp = -3.2;
        double difference = Math.abs(dayTemp - nightTemp);
        double maxTemp = Math.max(dayTemp, nightTemp);
        double minTemp = Math.min(dayTemp, nightTemp);
        System.out.println(difference + "\n" + maxTemp + "\n" + minTemp);
        System.out.println("Завдання 36");
        double num = 5.67;
        System.out.println(Math.round(num));
        System.out.println(Math.ceil(num));
        System.out.println(Math.floor(num));
        System.out.println("Завдання 37");
        double a2 = 1.0;
        double b2 = -7.0;
        double c2 = 10.0;
        double d = Math.pow(b2, 2) - 4 * a2 * c2;
        double x1 = (-b2 + Math.sqrt(d)) / (2 * a2);
        double x2 = (-b2 - Math.sqrt(d)) / (2 * a2);
        System.out.println("Дискримінант: " + d);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println("Завдання 38");
        int dice =(int) (Math.random() * 6) + 1;
        System.out.println("Випало на кубику: " + dice);
        System.out.println("Завдання 39");
        int min = -9;
        int max = 11;
        int randomTemp = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Погода на завтра:" + randomTemp );
        System.out.println("Завдання 40");
        double P = 10000.0;
        double r = 12.0;
        int t = 3;
        double S = P * Math.pow(1 + r / 100, t);
        double profit = S - P;

        System.out.println("+------------------------------------+"
                + "\n" + "|    ДЕПОЗИТНИЙ КАЛЬКУЛЬАТОР         |"
                + "\n" + "+------------------------------------+");
        System.out.println("Початкова сума: " + P + " грн");
        System.out.println("Термін: " + t + " роки під " + r + " річних");
        System.out.println("Підсумкова сума: грн " + (P + Math.floor(S)));
        System.out.println("Чистий прибуток: грн " + Math.floor(profit));
        System.out.println("+------------------------------------+");








        






            }
        }










