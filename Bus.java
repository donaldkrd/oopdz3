public class Bus extends Transport implements InterMetod {
    private String brand;
    public int capacity;
    public String country;
    private boolean engineStatus = false;

    public Bus(String type, String body, int doors, int wheels, int capacity, String country) {
        super.type = type;
        super.body = body;
        super.doors = doors;
        super.wheels = wheels;
        this.capacity = capacity;
        this.country = country;

    }

    public Bus(String type, int capacity) {
        super();
        this.capacity = capacity;
        super.type = type;
    }

    public Bus() {
        super();
        value++;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    @Override
    public String getAppointment() {
        return String.format("Класс %s предназначен для перевозки пассажиров", this.type);
    }

    @Override
    void powerOn() {
        if (engineStatus == false) {
            System.out.printf("Двигатель %sа %s заведен\n", this.type, this.getBrand());
            engineStatus = true;
        } else {
            System.out.printf("Двигатель %sа %s уже заведен\n", this.type, this.getBrand());
        }
    }

    @Override
    void powerOff() {
        if (engineStatus == true) {
            System.out.printf("Двигатель %sа %s остановлен\n", this.type, this.getBrand());
            engineStatus = false;
        } else {
            System.out.printf("Двигатель %sа %s не был заведен\n", this.type, this.getBrand());
        }
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", модель: %s, вместимость: %s, страна производитель: %s", this.brand,
                this.capacity, this.country);
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