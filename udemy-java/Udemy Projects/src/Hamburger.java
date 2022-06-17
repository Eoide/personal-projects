public class Hamburger {
    private String breadRollType;
    private String meat, name;
    private double price;
    private boolean cheese, lettuce, tomato, onion;

    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        this.cheese = false;
        this.lettuce = false;
        this.tomato = false;
        this.onion = false;
    }

    public void addCheese() {
        this.cheese = true;
    }

    public void addLettuce() {
        this.lettuce = true;
    }

    public void addTomato() {
        this.tomato = true;
    }

    public void addOnion() {
        this.onion = true;
    }

    public double getPrice() {
        return calcPrice();
    }

    public int countExtras() {
        int extras=0;
        if(this.cheese) extras++;
        if(this.lettuce) extras++;
        if(this.tomato) extras++;
        if(this.onion) extras++;

        return extras;
    }

    public double calcPrice() {
        System.out.println("Calculating price of base hamburger...");
        double additional = 0.50;
        this.price += additional*countExtras();
        return price;
    }
}

class HealthyBurger extends Hamburger {
    private boolean pickles;
    private boolean salad;
    //private double price;

    public HealthyBurger(double price) {
        super("Healthy Burger", "Brown Rye", "1/4 lb", price);
    }

    public void addPickles() {
        System.out.println("Pickles added from HealthyBurger");
        this.pickles = true;
    }

    public void setSalad() {
        System.out.println("Salad added from HealthyBurger");
        this.salad = true;
    }

    @Override
    public void addCheese() {
        System.out.println("Cheese added from HealthyBurger");
        super.addCheese();
    }

    @Override
    public void addLettuce() {
        System.out.println("Lettuce added from HealthyBurger");
        super.addLettuce();
    }

    @Override
    public void addTomato() {
        System.out.println("Tomato added from HealthyBurger");
        super.addTomato();
    }

    @Override
    public void addOnion() {
        System.out.println("Onion added from HealthyBurger");
        super.addOnion();
    }

    @Override
    public double getPrice() {
        System.out.println("Price of Healthy Burger...:");
        System.out.println("Extras...: €0.50");
        System.out.println("Additions added...: " + countHealthyExtras() + "");
        System.out.println("Final price of healthy burger: ");
        return super.calcPrice();
    }

    public int countHealthyExtras() {
        System.out.println("Counting extras on healthy burger");
        int extras = super.countExtras();
        if(this.pickles) extras++;
        if(this.salad) extras++;

        return extras;

    }

    @Override
    public double calcPrice() {
        System.out.println("Calculating price of healthy burger...");
        double additional = 0.50;
        double basePrice = getPrice();
        return basePrice += (additional*countHealthyExtras());

    }
}

class DeluxeBurger extends Hamburger {
    final private boolean chips = true;
    final private boolean drink = true;

    public DeluxeBurger(double price) {
        super("Deluxe Burger", "Brioche", "1/2 lb", price);
    }

    @Override
    public double getPrice() {
        System.out.println("Price of Deluxe Burger...");
        return super.calcPrice();
    }
}