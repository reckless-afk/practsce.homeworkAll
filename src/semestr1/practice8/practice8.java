package semestr1.practice8;

public class practice8 {
  public static void main(String[] args) {
      System.out.println("Завдання 1");
      Student student = new Student("Маша", 7, 36);
      System.out.println(student.getCourse());
      System.out.println(student.getCourse());
      student.setCourse(6);
      student.setGpa(95.0);

      System.out.println(student.getCourse());
      System.out.println(student.getGpa());
      System.out.println("Завдання 2");
      Product product1 = new Product("A-101", "Монітор", 6499.50, 4);
      Product product2 = new Product("B-202", "Клавіатура", 1200.00, 10);
      Product product3 = new Product("C-303", "Миша", 750.50, 5);
      System.out.println(product1);
      System.out.println(product2);
      System.out.println(product3);

      product1.setPrice(7000);
      product1.setStock(3);
      System.out.println("Після зміни:");
      System.out.println(product1);

      System.out.println("Завдання 3");
      Circle circle = new Circle(-5);

      System.out.println(circle);

      circle.setRadius(-10);

      System.out.println(circle);

      circle.setRadius(5);

      System.out.println(circle);

      System.out.println("Завдання 4");
      CardWallet wallet = new CardWallet(
              "1234567812344589",
              "1234",
              12500.00
      );

      System.out.println(wallet);

      System.out.println(wallet.changePin("1234", "5678"));
      System.out.println(wallet.changePin("1234", "9999"));

      System.out.println(wallet);


      System.out.println("Завдання 5");
      SensorNode sensor = new SensorNode("SENSOR-01", 2.5, 20.0);

      System.out.println(sensor);
      System.out.println(sensor.getSensorId());
      System.out.println(sensor.getCalibratedValue());

      System.out.println("Завдання 6");
      double[] temperatures = {12.5, 15.0, 18.5, 20.0, 16.5};

      WeatherDay day = new WeatherDay("07.11.2026", temperatures);

      System.out.println(day);

      System.out.println("Minimum: " + day.getMinTemp());
      System.out.println("Maximum: " + day.getMaxTemp());
      System.out.println("Average: " + day.getAverageTemp());

      temperatures[0] = 100;

      System.out.println(day);

      System.out.println("Завдання 7");
      IntRange range = new IntRange(20, 5);

      System.out.println(range);
      System.out.println(range.contains(10));
      System.out.println(range.contains(25));
      System.out.println(range.getLength());

      System.out.println("Завдання 8");
      InvoiceItem invoiceItem = new InvoiceItem("Клавіатура", 2, 1500, 10);
      System.out.println("Позиція чека:" + invoiceItem);
      System.out.println(invoiceItem.getFinalAmount());

      System.out.println("Завдання 9");
      Employee employee = new Employee("Александр", 30000);
      Developer developer = new Developer("Арсений", 45000, "Java");

      System.out.println(employee);
      System.out.println(developer);

      System.out.println("Завдання 10");
      Dog dog = new Dog("Бобік", 3, 12.5, "Хаскі");

      Cat cat = new Cat("Мурчик", 2, 4.5, true);

      System.out.println(dog);
      System.out.println(dog.fetchStick());

      System.out.println();

      System.out.println(cat);
      System.out.println(cat.purr());

      System.out.println("Завдання 11");
      PassengerCar car = new PassengerCar("BMW", 240, 60, 5);

      CargoTruck truck = new CargoTruck("Volvo", 120, 300, 20);

      System.out.println(car);

      System.out.println();

      System.out.println(truck);

      System.out.println("Завдання 12");
      Rectangle rectangle = new Rectangle(5, 10);
      Box3D box = new Box3D(5, 10, 3);

      System.out.println(rectangle);
      System.out.println(box);

      System.out.println("Завдання 13");
      UniversityStudent student1= new UniversityStudent(
              "Арсеній Діденко", 2008,
              "KN-123", "Computer Science", 2000
      );

      Professor professor = new Professor(
              "Іван Петренко", 1980,
              "Doctor of Science", 45
      );

      System.out.println(student);
      System.out.println("Student age: " + student1.getAge(2026));

      System.out.println(professor);
      System.out.println("Professor age: " + professor.getAge(2026));

      System.out.println("Завдання 14");
      Smartphone phone1 = new Smartphone(
              "Samsung", 25000, 256, true
      );

      Smartphone phone2 = new Smartphone(
              "Xiaomi", 15000, 128
      );

      Smartphone phone3 = new Smartphone(
              "Apple"
      );

      System.out.println(phone1);
      System.out.println(phone2);
      System.out.println(phone3);

      System.out.println("Завдання 15");
      PrintedBook book = new PrintedBook("Кобзар", "Тарас Шевченко", 1840, 256, "Тверда"
      );

      AudioBook audioBook = new AudioBook(
              "Кобзар", "Тарас Шевченко", 1840, 185, "Олександр");
      System.out.println(book);
      System.out.println(audioBook);

      System.out.println("Завдання 16");
      Gamer gamer = new Gamer("Player123", 1500);

      ProEsportsPlayer pro = new ProEsportsPlayer(
              "s1mple", 12000, "NAVI", 500000, 25
      );

      System.out.println(gamer);
      System.out.println(pro);

      System.out.println("Середній приз за перемогу: "
              + pro.getAveragePrizePerWin() + " USD");

      System.out.println("Завдання 17");
      Manager manager = new Manager("Ivan", 30000, 5000);

      SalesPerson salesperson = new SalesPerson(
              "Anna", 20000, 100000, 5
      );

      System.out.println(manager);
      System.out.println(salesperson);

      System.out.println("Завдання 18");
      StandardTransfer standard = new StandardTransfer(1000);
      InternationalTransfer international = new InternationalTransfer(1000, "PL");
      System.out.println("Standard transfer:");
      System.out.println("Fee: " + standard.getFee());
      System.out.println("Total: " + standard.getTotalWithFee());
      System.out.println();

      System.out.println("International transfer:");
      System.out.println(international);

      System.out.println("Завдання 19");
      Ticket ticket = new Ticket("Concert", 1000);

      StudentTicket student2 = new StudentTicket(
              "Concert", 1000, "ST12345"
      );

      VipTicket vip = new VipTicket(
              "Concert", 1000, true, 500
      );

      System.out.println(ticket);
      System.out.println(student2);
      System.out.println(vip);

      System.out.println("Завдання 20");
      Weapon weapon = new Weapon("Iron Sword", 50);

      EnchantedSword sword = new EnchantedSword(
              "Fire Sword", 50, "Fire", 20, 3
      );

      System.out.println(weapon);
      System.out.println(sword);
  }
}




