public class EnhancedCar {
    private int cylinders, wheels;
    private String name;
    private boolean engine;

    public EnhancedCar(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public void startEngine() {
        System.out.println("Enhanced car -> Engine starting...");
    }

    public void accelerate() {
        System.out.println("Enhanced car -> Accelerating...");
    }

    public void brake() {
        System.out.println("Enhanced car -> Braking...");
    }
}

class Tesla extends EnhancedCar {

    public Tesla(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Tesla -> Electric motor starting...");
    }

    @Override
    public void accelerate() {
        System.out.println("Tesla -> Accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Tesla -> Braking...");
    }
}

class Volkswagen extends EnhancedCar {

    public Volkswagen(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Volkswagen -> Electric motor starting...");
    }

    @Override
    public void accelerate() {
        System.out.println("Volkswagen -> Accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Volkswagen -> Braking...");
    }
}

class BMW extends EnhancedCar {

    public BMW(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("BMW -> Electric motor starting...");
    }

    @Override
    public void accelerate() {
        System.out.println("BMW -> Accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("BMW -> Braking...");
    }
}
