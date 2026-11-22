package semestr1.practice9;
import java.util.Arrays;

public class practice9 {
    static void main(String[] args) {


        System.out.println("Завдання 1");
        ImmutableGeoPoint point = new ImmutableGeoPoint(50, 30);

        ImmutableGeoPoint newPoint = point.shift(10, 20);

        System.out.println(point);
        System.out.println(newPoint);

        System.out.println("Завдання 2");
        double[] externalSamples = {1.5, 2.5, 3.5};

        LabMeasurement lab = new LabMeasurement(
                "Experiment 1", externalSamples);
        externalSamples[0] = 999;
        System.out.println(Arrays.toString(lab.getSamples()));
        double[] copy = lab.getSamples();
        copy[1] = 999;
        System.out.println(Arrays.toString(lab.getSamples()));

        System.out.println("Завдання 3");

        CryptoVault wallet = new CryptoVault("BTC-123456",
                "mySecret123", 2.5, true);
        System.out.println(wallet);
        wallet.unlock("mySecret123");
        wallet.sendBtc(0.5, "BTC-987654");
        System.out.println(wallet);
        wallet.lock();
        System.out.println(wallet);

        System.out.println("Завдання 4");
        ClosedInterval interval1 = new ClosedInterval(10, 5);
        ClosedInterval interval2 = new ClosedInterval(8, 15);
        ClosedInterval interval3 = new ClosedInterval(20, 30);

        System.out.println(interval1);
        System.out.println(interval2);
        System.out.println(interval3);

        System.out.println("Перетинаються 1 і 2: "
                + interval1.overlaps(interval2));

        System.out.println("Перетинаються 1 і 3: "
                + interval1.overlaps(interval3));

        interval1.resize(2, 12);

        System.out.println("Після зміни: " + interval1);

        System.out.println("Завдання 5");
        RgbColor color1 = new RgbColor(255, 100, 50);
        RgbColor color2 = new RgbColor(0, 150, 255);

        System.out.println("Перший колір: " + color1);
        System.out.println("Другий колір: " + color2);

        System.out.println("Інверсія першого: " + color1.invert());

        System.out.println("Змішаний колір: " + color1.mixWith(color2));

        System.out.println("Завдання 6");
        HighSecuritySafe safe = new HighSecuritySafe(1234);
        safe.putCash(1234, 5000);
        safe.takeCash(1234, 1000);

        safe.putCash(1111, 500);
        safe.putCash(2222, 500);
        safe.putCash(3333, 500);

        safe.putCash(1234, 1000);

        System.out.println("Завдання 7");
        double[] coefficients = {2, 3, 4};

        EncapsulatedPolynomial polynomial =
                new EncapsulatedPolynomial(coefficients);

        System.out.println(polynomial);
        System.out.println(polynomial.getDegree());
        System.out.println(polynomial.getCoefficient(1));
        System.out.println(polynomial.evaluate(2));

        System.out.println("Завдання 8");
        String[] allergies = {"Арахіс", "Пилок"};
        MedicalRecord record = new MedicalRecord(
                "12345",
                "Іван Петренко",
                2,
                true,
                allergies
        );

        System.out.println(record);
        System.out.println(record.hasAllergyTo("арахіс"));

        System.out.println("Завдання 9");
        Point2D point1 = new Point2D(2, 3);
        Point2D point2 = new Point2D(5, 7);

        CompositeCircle circle = new CompositeCircle(2, 3, 5);

        System.out.println(point1);
        System.out.println(circle);

        System.out.println(circle.containsPoint(point2));

        System.out.println("Завдання 10");
        Engine engine = new Engine("Бензин", 2000);

        Automobile automobile = new Automobile("BMW M5", engine);

        System.out.println(automobile);

        automobile.accelerate(50);
        System.out.println(automobile);

        engine.start();

        automobile.accelerate(50);
        System.out.println(automobile);

        automobile.accelerate(30);
        System.out.println(automobile);

        engine.stop();
        System.out.println(automobile);

        System.out.println("Завдання 11");
        Battery battery = new Battery(5000, 100);

        Display display = new Display(6.5, 80);

        SmartDevice phone = new SmartDevice(battery, display);

        phone.watchVideo(30);

        System.out.println("Завдання 12");
        Point2D p1 = new Point2D(2, 3);
        Point2D p2 = new Point2D(8, 7);

        LineSegment line = new LineSegment(p1, p2);

        System.out.println(line);
        System.out.println("Length: " + line.getLength());
        System.out.println("Midpoint: " + line.getMidpoint());

        System.out.println("Завдання 13");
        BankAccount familyAccount = new BankAccount("UA123", 1000);

        PlasticCard card1 = new PlasticCard("1111", "12/28", false, familyAccount);
        PlasticCard card2 = new PlasticCard("2222", "08/29", false, familyAccount);

        System.out.println("Завдання 14");
        WeaponItem sword = new WeaponItem("Sword", 50, 100);

        HeroCharacter hero = new HeroCharacter("Jin-Woo", 100, sword);

        System.out.println(hero.attack());
        System.out.println(hero.attack());

        WeaponItem axe = new WeaponItem("Axe", 80, 100);

        hero.equip(axe);

        System.out.println(hero.attack());

        System.out.println("Завдання 15");
        DeliveryAddress address1 = new DeliveryAddress("Kyiv", "Khreshchatyk", 10);
        DeliveryAddress address2 = new DeliveryAddress("Lviv", "Shevchenka", 20);

        ParcelOrder order = new ParcelOrder("ORD-001", 2.5, address1);

        System.out.println(order.changeDestination(address2));

        order.markAsShipped();

        System.out.println(order.changeDestination(address1));

        System.out.println("Завдання 16");
        TemperatureSensor sensor = new TemperatureSensor(19.0);
        HeatingUnit heater = new HeatingUnit(true, 2.0);


        ClimateController controller =
                new ClimateController(sensor, heater, 22.0);

        controller.regulate();

        System.out.println(controller);

        System.out.println("Завдання 17");
        Point2D[] points = new Point2D[10];

        Polyline line1 = new Polyline(points, 0);

        line1.addVertex(0, 0);
        line1.addVertex(3, 0);
        line1.addVertex(3, 4);

        System.out.println("Довжина: " + line1.getTotalLength());
        System.out.println("Периметр: " + line1.getClosedPerimeter());

        System.out.println("Завдання 18");
        OrderItem[] items = new OrderItem[10];

        ShoppingOrder order1 = new ShoppingOrder(items, 0);

        order1.addItem("Мишка", 500, 2);
        order1.addItem("Клавіатура", 1000, 1);
        order1.addItem("Мишка", 500, 3);

        System.out.println(order1);

        System.out.println("Завдання 25");
        CircleShape circle1 = new CircleShape("Red", 5);

        RectangleShape rectangle = new RectangleShape("Blue", 4, 6);

        System.out.println(circle1);
        System.out.println(rectangle);

        System.out.println("Завдання 26");

        SolarPowerPlant solar = new SolarPowerPlant("Solar Station", 100, 0.7);

        WindPowerPlant wind = new WindPowerPlant("Wind Station", 150, 12);

        System.out.println("Solar power: " + solar.generateMegawatts() + " MW");
        System.out.println("Solar profit: " + solar.calculateDailyProfit(50));

        System.out.println();

        System.out.println("Wind power: " + wind.generateMegawatts() + " MW");
        System.out.println("Wind profit: " + wind.calculateDailyProfit(50));
    }
}





