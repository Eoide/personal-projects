public class Car extends Vehicle {
    private int wheels;
    private int gear;
    private String transmission;

    public Car(String size, int speed, int doors, int wheels, int gear, String transmission) {
        super(size, speed, doors);
        this.wheels = wheels;
        this.gear = gear;
        this.transmission = transmission;
    }

    public Car(int wheels, int gear, String transmission) {
        super("Default size", 0, 0);
        this.wheels = wheels;
        this.gear = gear;
        this.transmission = transmission;
    }

    public Car() {
        this("Default size", 0, 0, 0, 0, "Manual");
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        System.out.println("setTransmission called from car class");
        if(!(transmission.equalsIgnoreCase("manual")||transmission.equalsIgnoreCase("automatic"))) {
            System.out.println("Incorrect value for transmission entered");
        }
        else {
            this.transmission = transmission;
        }
    }

    public void changeGearUp () {
        System.out.println("changeGearUp called from car class");
        if(this.gear+1>6) {
            System.out.println("Gear change out of bounds");
        }
        else {
            this.gear += 1;
        }
    }

    public void changeGearDown () {
        System.out.println("changeGearDown called from car class");
        if(this.gear-1>0) {
            System.out.println("Gear change out of bounds");
        }
        else {
            this.gear -= 1;
        }
    }

    @Override
    public void increaseSpeed(int speed) {
        System.out.println("increaseSpeed called from car class");
        super.increaseSpeed(speed);
    }

    @Override
    public void decreaseSpeed(int speed) {
        System.out.println("decreaseSpeed called from car class");
        super.decreaseSpeed(speed);
    }
}
