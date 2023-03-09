public class Program {
    public static void main(String[] args) {
        Bus bus = new Bus("Автобус", "Микро", 3, 6, 23, "Россия");
        bus.setBrand("ПАЗ 3205");
        System.out.println(bus.getAppointment());
        System.out.println(bus);
        bus.getStatusEngine();
        System.out.println();
        Bus bus2 = new Bus("Автобус", 80);
        bus2.setBrand("ЛиАЗ");
        bus2.body = "Гармошка";
        bus2.doors = 4;
        bus2.wheels = 8;
        bus2.country = "Россия";
        System.out.println(bus2);
        bus2.powerOn();
        bus2.powerOn();
        bus2.powerOff();
        bus2.powerOff();
        System.out.println();
        Car car = new Car("Легковой автомобиль", "Седан");
        car.setBrand("Mersedes GLE");
        car.capacity = 5;
        car.color = "Black edition";
        car.doors = 5;
        car.wheels = 4;
        System.out.println(car.getAppointment());
        System.out.println(car);
        car.getStatusEngine();
        System.out.println();
        Car car2 = new Car("Легковой автомобиль", "SUV", 5, 4, "White", 5);
        car2.setBrand("Audi Q7");
        car2.getAppointment();
        System.out.println(car2);
        car2.powerOn();
        car2.powerOn();
        car2.powerOff();
        car2.powerOff();
        System.out.println();
        System.out.printf("Создано транспорта = %s\n", Transport.value);

        Jeep jeep = new Jeep("4*4", 25, 368);
        jeep.setBrand("Jeep Wrangler");
        jeep.body = "Джип";
        jeep.capacity = 4;
        jeep.color = "yelow";
        jeep.doors = 3;
        jeep.type = "Легковой автомобиль";
        jeep.wheels = 4;
        System.out.println(jeep.getAppointment());
        System.out.println(jeep);
        jeep.getStatusEngine();
        System.out.println();
        System.out.printf("Создано транспорта = %s\n", Transport.value);

    }
}
