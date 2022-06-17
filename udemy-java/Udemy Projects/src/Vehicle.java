public class Vehicle {
    private static int numberOfCars = 0;
    private String size;
    private int speed;
    private int doors;

    public Vehicle(String size, int speed, int doors) {
        this.size = size;
        this.speed = speed;
        this.doors = doors;
        numberOfCars++;
    }

    public Vehicle() {
        this("Default size", 0, 0);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void increaseSpeed(int speed) {
        System.out.println("Increase speed called from Vehicle class");
        this.speed += speed;
    }

    public void decreaseSpeed(int speed) {
        System.out.println("Decrease speed called from Vehicle class");
        if(speed<this.speed) {
            this.speed =- speed;
        }
        else {
            this.speed=0;
        }
    }

    public void stop() {
        System.out.println("Stop called from Vehicle class");
        this.speed=0;
    }

    public static int getNumberOfCars () {
        System.out.println("getNumberOfCars called from Vehicle class");
        return numberOfCars;
    }
}
