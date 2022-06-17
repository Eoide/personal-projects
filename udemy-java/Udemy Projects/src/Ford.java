public class Ford extends Car {
    private String model;
    private int warranty;

    public Ford(String size, int speed, int doors, int wheels, int gear, String transmission, String model, int warranty) {
        super(size, speed, doors, wheels, gear, transmission);
        this.model = model;
        this.warranty = warranty;
    }

    public Ford() {
        this("Default size", 0, 0, 0, 0, "Manual", "Focus", 4);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public void changeWarranty(int change) {
        if(change>0) this.warranty = change;
    }
}
