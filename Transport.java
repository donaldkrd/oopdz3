public abstract class Transport {

    public int wheels;
    public int doors;
    public String body;
    public String type;
    protected static int value = 0;

    public Transport(String type, String body, int doors, int wheels) {
        this.type = type;
        this.body = body;
        this.doors = doors;
        this.wheels = wheels;
    }

    public Transport() {
        super();
        value++;
    }

    abstract void powerOn();

    abstract void powerOff();

    @Override
    public String toString() {
        return String.format("Класс: %s, кузов: %s", this.type, this.body);
    }
}
