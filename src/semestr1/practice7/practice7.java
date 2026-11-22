package semestr1.practice7;

public class practice7 {
  public static void main(String[] args) {
    System.out.println("Завдання 1");
    Book book1 = new Book();
    Book book2 = new Book("Кобзар", "Тарас Шевченко", 1840, 350.0);
    book1.printInfo();
    book2.printInfo();

    System.out.println("Завдання 2");
    Student student1 = new Student("Арсеній", 18, 4.8);
    Student student2 = new Student("Іван", 12, 6.0);

    student1.printStudent();
    System.out.println();

    student2.printStudent();

    System.out.println("Завдання 3");

    BankAccount account = new BankAccount("123456789", "Арсеній", 1000);

    account.printAccount();

    account.deposit(500);

    account.withdraw(2000);

    account.printAccount();

    System.out.println("Завдання 4");
    Point2D point1 = new Point2D();
    Point2D point2 = new Point2D(4.0, 3.0);
    Point2D point3 = new Point2D(1.0, 2.0);

    point1.printPoint();
    point2.printPoint();
    point3.printPoint();

    System.out.println("Відстань до початку координат: "
            + point2.distanceToOrigin());

    System.out.println("Відстань між точками: "
            + point2.distanceTo(1.0, 2.0));

    System.out.println("Завдання 5");
    Product product = new Product("Телефон", 10000, 2, "Техніка");
    System.out.println("До знижки:");
    product.printProduct();

    System.out.println("Застосовуємо знижку 20%...");
    product.applyDiscount(20);

    System.out.println("Після знижки:");
    product.printProduct();

    System.out.println("Нова вартість партії: " + product.getTotalValue());

    System.out.println("Завдання 6");

    Time time = new Time(23, 59, 57);

    System.out.println("Початковий час:");
    System.out.println(time.toUniversalString());
    System.out.println(time.toStandardString());

    System.out.println("Хід часу:");

    for (int i = 0; i < 5; i++) {
      time.tick();
      System.out.println(time.toUniversalString());
    }

    System.out.println("Завдання 7");
    Rectangle rectangle = new Rectangle(5.0, 3.0);
    Rectangle square = new Rectangle(4.0);

    System.out.println("Прямокутник:");
    System.out.println("Площа: " + rectangle.getArea());
    System.out.println("Периметр: " + rectangle.getPerimeter());
    System.out.println("Це квадрат? " + rectangle.isSquare());

    System.out.println();

    System.out.println("Квадрат:");
    System.out.println("Площа: " + square.getArea());
    System.out.println("Периметр: " + square.getPerimeter());
    System.out.println("Це квадрат? " + square.isSquare());

    System.out.println();

    System.out.println("Порівняння:");
    System.out.println("Площі однакові? " +
            (rectangle.getArea() == square.getArea()));

    System.out.println("Периметри однакові? " +
            (rectangle.getPerimeter() == square.getPerimeter()));

    System.out.println("Завдання 8");

    Employee employee = new Employee(1, "Арсеній Діденко", "Programmer", 30000);

    employee.printBadge();

    employee.raiseSalary(15);

    System.out.println("Нова річна зарплата: " + employee.getAnnualSalary());

    System.out.println("Завдання 9");
    User user1 = new User("Ашот", "bahkir@gmail.com", "ADMIN", true);

    User user2 = new User("ivan", "ivan@gmail.com");

    User user3 = new User("petro");

    User user4 = new User();

    user1.printProfile();
    user2.printProfile();
    user3.printProfile();
    user4.printProfile();

    System.out.println("Завдання 10");
    Fraction fraction1 = new Fraction(12, 8);
    Fraction fraction2 = new Fraction(5);
    Fraction fraction3 = new Fraction();

    fraction1.print();
    fraction2.print();
    fraction3.print();

    System.out.println(fraction1.toDouble());
    System.out.println(fraction2.toDouble());
    System.out.println(fraction3.toDouble());

    System.out.println("Завдання 11");
    Car car = new Car("BMW", "M5", 2024);

    car.startEngine();
    car.drive(150);
    car.stopEngine();

    car.printInfo();

    System.out.println("Завдання 12");

    SmartBulb bulb1 = new SmartBulb(70, 5000, true);

    SmartBulb bulb2 = new SmartBulb(80);

    SmartBulb bulb3 = new SmartBulb();

    bulb1.printStatus();
    bulb2.printStatus();
    bulb3.printStatus();

    System.out.println("Завдання 13");
    String sql = new QueryBuilder("users")
            .select("id, name, email")
            .where("age >= 18")
            .build();

    System.out.println(sql);

    System.out.println("Завдання 14");

    CoffeeOrder order1 = new CoffeeOrder("Еспресо");
    CoffeeOrder order2 = new CoffeeOrder("Капучино", "Large");
    CoffeeOrder order3 = new CoffeeOrder("Лате", "Small", 2, true);

    order1.printReceipt();
    System.out.println("----------------");

    order2.printReceipt();
    System.out.println("----------------");

    order3.printReceipt();

    System.out.println("Завдання 15");
    Box box1 = new Box(5, "Картон");

    // Створюємо її копію
    Box box2 = new Box(box1);

    System.out.println("Перша коробка:");
    box1.printBox();

    System.out.println("----------------");

    System.out.println("Копія коробки:");
    box2.printBox();

    System.out.println("----------------");

    System.out.println("Об'єми однакові: " +
            (box1.getVolume() == box2.getVolume()));
    System.out.println("Завдання 16");

    FlightTicket ticket = new FlightTicket(
            "AB123",
            "Невський",
            "PS101",
            "Киев",
            "Варшава"
    );

    ticket.assignSeat("12A");

    ticket.printBoardingPass();

    System.out.println("Завдання 17");

    MathOperations math = new MathOperations();

    System.out.println(math.add(5, 10));
    System.out.println(math.add(5.5, 10.5));
    System.out.println(math.add(5, 10, 15));
    System.out.println(math.add("Привет", "мир"));

    System.out.println(math.multiply(5, 3));
    System.out.println(math.multiply(2.5, 4.0));
    System.out.println(math.multiply("Hi", 3));

    System.out.println("Завдання 18");
    DocumentPrinter documentPrinter = new  DocumentPrinter();
    documentPrinter.print("Какііііі");
    documentPrinter.print(123);
    documentPrinter.print(16.531213,2);
    String[] lines = {"Java", "Python", "C++"};
    documentPrinter.print(lines);
    documentPrinter.print("hello world", true);
    documentPrinter.print("hello world", false);

    System.out.println("Завдання 19");
    AreaCalculator calculator = new AreaCalculator();

    System.out.println("Площадь квадрата: "
            + calculator.calculateArea(5));

    System.out.println("Площадь прямоугольника: "
            + calculator.calculateArea(4, 6));

    System.out.println("Площадь круга: "
            + calculator.calculateArea(3, true));

    System.out.println("Площадь трапеции: "
            + calculator.calculateArea(5, 7, 4));

    System.out.println("Завдання 20");
    Logger logger = new Logger();

    logger.log("Програму запущено");
    logger.log("WARNING", "Низький заряд батареї");
    logger.log("ERROR", 404, "Сторінку не знайдено");
    logger.log("SYSTEM", "Користувач увійшов у систему", true);

  }
}
