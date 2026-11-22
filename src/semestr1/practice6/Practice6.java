package semestr1.practice6;

public class Practice6 {
    public static void main(String[] args) {
        System.out.println("Завдання 1");
        Student s1 = new Student();
        s1.name = "Деніс";
        s1.age = 19;
        s1.gpa = 4.75;
        System.out.println(s1.name + ", " + s1.age + ", " + s1.gpa);

        System.out.println("Завдання 2");
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2021;
        car1.speed = 180;
        Car car2 = new Car();
        car2.brand = "BMW";
        car2.model = "M5";
        car2.year = 2023;
        car2.speed = 250;
        if (car1.year > car2.year) {
            System.out.println("Toyota новіше");
        } else {
            System.out.println("BMW новіше");
        }

        System.out.println("Завдання 3");
        Book emptyBook = new Book();
        System.out.println(emptyBook.title);
        System.out.println(emptyBook.author);
        System.out.println(emptyBook.pages);
        System.out.println(emptyBook.isRead);
        System.out.println(emptyBook.title + emptyBook.author + emptyBook.pages + emptyBook.isRead);

        System.out.println("Завдання 4");
        Rectangle rectangle = new Rectangle();
        rectangle.width = 7.5;
        rectangle.height = 4.0;
        double S = rectangle.width * rectangle.height;
        double P = 2 * (rectangle.width + rectangle.height);
        System.out.println("Площа прямокутника:" + S + " Периметр пря мокутника: " + P);

        System.out.println("Завдання 5");
        Product product = new Product();
        product.name = "Монітор";
        product.price = 6500.0;
        product.quantity = 8;
        double all = product.price * product.quantity;
        System.out.println(all + "грн");

        System.out.println("Завдання 6");
        Smartphone smartphone = new Smartphone();
        smartphone.model = "Samsung";
        smartphone.batteryLevel = 100;
        smartphone.isTurnedOn = true;
        smartphone.batteryLevel = smartphone.batteryLevel - 35;
        if (smartphone.batteryLevel == 0) {
            smartphone.isTurnedOn = false;
        }
        System.out.println("Модель: " + smartphone.model);
        System.out.println("Заряд: " + smartphone.batteryLevel);
        System.out.println("Увімкнений: " + smartphone.isTurnedOn);

        System.out.println("Завдання 7");

        Point2D A = new Point2D();
        A.x = 0;
        A.y = 0;

        Point2D B = new Point2D();
        B.x = 3;
        B.y = 4;
        double distance = Math.sqrt(
                Math.pow(B.x - A.x, 2) + Math.pow(B.y - A.y, 2));
        System.out.println("Відстань між точками: " + distance);

        System.out.println("Завдання 8");
        Student first = new Student();
        first.name = "Іван";
        Student second = first;
        second.name = "Петро";
        System.out.println(first.name); // Томущо ми не создали ще одного new  петро приписується какби до того самого івана

        System.out.println("Завдання 9");
        Greeter greeter = new Greeter();
        greeter.sayHello();
        greeter.sayHelloTo("Іван");

        System.out.println("Завдання 10");
        Animal cat = new Animal();
        cat.name = "Башмак";
        cat.species = "Заморский";
        Animal dog = new Animal();
        dog.name = "Єбалай";
        dog.species = "Алабай";
        cat.printInfo();
        cat.makeSound();
        dog.printInfo();
        dog.makeSound();

        System.out.println("Завдання 11");
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.decrement();
        counter.printCount();

        System.out.println("Завдання 12");
        TrafficLight light = new TrafficLight();
        light.changeColor("Червоний");
        light.showSignal();

        light.changeColor("Жовтий");
        light.showSignal();

        light.changeColor("Зелений");
        light.showSignal();

        System.out.println("Завдання 13");
        Player player = new Player();
        player.nickname = "біляш";
        player.takeDamage(30);
        System.out.println(player.health);
        player.heal(20);
        System.out.println(player.health);

        player.takeDamage(100);

        System.out.println("Завдання 14");
        Lamp lamp = new Lamp();
        lamp.turnOn();
        lamp.turnOff();
        lamp.toggle();
        lamp.status();

        System.out.println("Завдання 15");
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.tick();
        stopwatch.addSeconds(124);
        stopwatch.displayTime();

        System.out.println("Завдання 16");
        Printer printer = new Printer();
        printer.model = "Canon";
        printer.printDocument("Звіт", 20);
        System.out.println("Паперу залишилося: " + printer.paperCount);
        printer.printDocument("Книга", 200);
        System.out.println("Паперу залишилося: " + printer.paperCount);

        System.out.println("Завдання 17");
        SimpleCalculator calculator = new SimpleCalculator();

        System.out.println(calculator.add(10, 5));
        System.out.println(calculator.subtract(10, 5));
        System.out.println(calculator.multiply(10, 5));
        System.out.println(calculator.divide(10, 5));

        // Перевірка ділення на нуль
        System.out.println(calculator.divide(10, 0));

        System.out.println("Завдання 18");
        Circle circle = new Circle();
        circle.radius = 5.0;

        System.out.println("Площа круга: " + circle.getArea());
        System.out.println("Довжина кола: " + circle.getCircumference());

        System.out.println("Завдання 19");
        TemperatureConverter converter = new TemperatureConverter();
        double fahrenheit = converter.celsiusToFahrenheit(25);
        System.out.println("25°C у Фаренгейтах: " + fahrenheit);

        double celsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println("Назад у Цельсіях: " + celsius);

        System.out.println("Завдання 20");
        NumberChecker checker = new NumberChecker();

        int[] numbers = {7, 12, -5};

        for (int n : numbers) {
            System.out.println("Число: " + n);
            System.out.println("Парне: " + checker.isEven(n));
            System.out.println("Додатне: " + checker.isPositive(n));
            System.out.println("Просте: " + checker.isPrime(n));
            System.out.println();
        }

            System.out.println("Завдання 21");
        CurrencyExchange exchange = new CurrencyExchange();
        double dollars = exchange.toUSD(1000);
        System.out.println(dollars);

        System.out.println("Завдання 22");
        Employee employee = new Employee();
        employee.baseSalary = 30000;
        employee.bonusPercentage = 15;
        System.out.println(employee.calculateTotalSalary());
        System.out.println(employee.calculateTax());

        System.out.println("Завдання 23");
        TextFormatter formatter = new TextFormatter();

        String word = "Привіт";

        System.out.println(formatter.formatTitle(word));
        System.out.println(formatter.countVowels(word));

        System.out.println("Завдання 24");
        Triangle triangle = new Triangle();
        System.out.println(triangle.isValid());
        System.out.println(triangle.getArea());

        System.out.println("Завдання 25 ");
        SecretVault vault = new SecretVault();
        //has private access
        System.out.println(vault.verifyCode("Pass123"));
        System.out.println(vault.verifyCode("hacked"));

        System.out.println("Завдання 26 ");
        UserAccount account = new UserAccount();

        account.setCredentials("Senya", "12345");

        System.out.println(account.login("Senya", "12345"));
        System.out.println(account.login("Senya", "11111"));

        account.changePassword("12345", "67890");

        System.out.println(account.login("Senya", "67890"));

        System.out.println("Завдання 27 ");
        BankAccount account1 = new BankAccount();
        account1.deposit(1000);

        System.out.println(account1.withdraw(1500));
        System.out.println(account1.getBalance());

        System.out.println("Завдання 28 ");
        Thermometer thermometer = new Thermometer();
        thermometer.setTemperature(-1000);

        System.out.println("Завдання 29 ");
        CarSpeedometer car = new CarSpeedometer();

        System.out.println("Початкова швидкість: " + car.getSpeed() + " км/год");
        car.accelerate(80);
        System.out.println("Розгонулися на 80. Швидкість: " + car.getSpeed() + " км/год");
        car.accelerate(200);
        System.out.println("Спробували розігнатися ще на 200. Швидкість (межа 240): " + car.getSpeed() + " км/год");
        car.brake(50);
        System.out.println("Загальмували на 50. Швидкість: " + car.getSpeed() + " км/год");
        car.brake(300);
        System.out.println("Спробували різко загальмувати на 300. Швидкість (межа 0): " + car.getSpeed() + " км/год");


        System.out.println("Завдання 30");

        Person person1 = new Person();
        person1.setName("Олександр");
        person1.setAge(20);

        Person person2 = new Person();
        person2.setName("Софія");
        person2.setAge(135);
        System.out.println("--- Перша персона ---");
        person1.printSummary();
        System.out.println("--- Друга персона ---");
        person2.printSummary();

        System.out.println("Завдання 31");
        DiscountCard discountCard = new DiscountCard();
      discountCard.addPurchase(30000);
      discountCard.printCardInfo();

        System.out.println("Завдання 32");
        SmartDoorLock lock = new SmartDoorLock();
        lock.enterPin(1111);
        lock.enterPin(2222);
        lock.enterPin(3333);
        lock.enterPin(1234);

        System.out.println("Завдання 33");
        GradeBook book = new GradeBook();
        int[] grades = {85, 92, 78, 96, 65};
        book.setData("Арсеній", grades);
        System.out.println("Студент: " + book.getStudentName());
        System.out.println("Середній бал: " + book.getAverage());
        System.out.println("Найвища оцінка: " + book.getHighestGrade());
        System.out.println("Найнижча оцінка: " + book.getLowestGrade());

        System.out.println("Завдання 34");
        ArrayStats stats = new ArrayStats();
        stats.setNumbers(numbers);
        System.out.println("Парних чисел: " + stats.countEvens());
        System.out.println("Непарних чисел: " + stats.countOdds());
        System.out.println("Сума: " + stats.calculateSum());

        System.out.println("Завдання 35");
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(25.5);
        cart.addItem(10.0);
        cart.addItem(40.0);
        System.out.println("До знижки: " + cart.getTotalCost());
        cart.applyDiscount(15);
        System.out.println("Після знижки: " + cart.getTotalCost());

        System.out.println("Завдання 36");
        TemperatureTracker tracker = new TemperatureTracker();

        double[] temps = {15.0, 18.5, 20.0, 17.0, 22.5, 19.0, 16.5};

        tracker.setTemps(temps);

        System.out.println("Днів вище 20°C: " + tracker.countDaysAbove(20));

        System.out.println("Завдання 37");
        ArraySearcher searcher = new ArraySearcher();
        searcher.setData(new int[]{4, 8, 2, 1});

        System.out.println(searcher.contains(8));
        System.out.println(searcher.contains(5));

        System.out.println(searcher.findIndex(2));
        System.out.println(searcher.findIndex(5));

        System.out.println("Завдання 38");
        Vector3D vector = new Vector3D();

        vector.setCoords(2, 3, 6);

        System.out.println(vector.getMagnitude());

        vector.multiplyByScalar(2);

        vector.printVector();

        System.out.println("Завдання 39");
        int[][] numbers1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Matrix2D matrix = new Matrix2D();

        matrix.setGrid(numbers1);

        System.out.println("Матриця:");
        matrix.printMatrix();

        System.out.println("Сума всіх чисел: " + matrix.getTotalSum());
        System.out.println("Сума другого рядка: " + matrix.getRowSum(1));

    }
}







