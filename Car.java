public class Car extends Transport implements InterMetod {
    private String brand;
    public String color;
    public int capacity;
    private boolean engineStatus = false;

    public Car(String type, String body, int doors, int wheels, String color, int capacity) {
        super.type = type;
        super.body = body;
        super.doors = doors;
        super.wheels = wheels;
        this.color = color;
        this.capacity = capacity;

    }

    public Car(String type, String body) {
        super.type = type;
        super.body = body;
    }

    public Car() {
        super();
        value++;
    }

    public void setBrand(String name) {
        this.brand = name;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", марка: %s, цвет: %s", this.getBrand(), this.color);
        // return String.format("Класс: %s, кузов: %s, марка: %s", this.type, this.body,
        // this.brand);
    }

    @Override
    public String getAppointment() {
        return String.format("Класс %s предназначен для личного использования", this.body);
    }

    @Override
    void powerOn() {
        if (engineStatus == false) {
            System.out.printf("Двигатель автомобиля %s заведен\n", this.getBrand());
            engineStatus = true;
        } else {
            System.out.printf("Двигатель автомобиля %s уже заведен\n", this.getBrand());
        }
    }

    @Override
    void powerOff() {
        if (engineStatus == true) {
            System.out.printf("Двигатель автомобиля %s заглушен\n", this.getBrand());
            engineStatus = false;
        } else {
            System.out.printf("Двигатель автомобиля %s не был заведен\n", this.getBrand());
        }
    }

    @Override
    public void getStatusEngine() {
        if (engineStatus == false) {
            System.out.println("Двигатель выключен");
        } else {
            System.out.println("Двигатель заведен");
        }
    }
}
