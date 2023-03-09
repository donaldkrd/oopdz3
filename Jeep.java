public class Jeep extends Car {
    public String driveUnit;
    public int clearance;
    public int power;

    public Jeep(String driveUnit, int clearance, int power) {
        super();
        this.driveUnit = driveUnit;
        this.clearance = clearance;
        this.power = power;
        value--;
    }

    public Jeep() {
        super();
    }

}
