public class VipCustomer {
    private String name, emailAddress;
    private double creditLimit;

    public VipCustomer(String nameIn, double credIn, String emailIn) {
        this.name = nameIn;
        this.creditLimit = credIn;
        this.emailAddress = emailIn;
    }

    public VipCustomer(String nameIn, double credIn) {
        this(nameIn, credIn, "default@email.com");
    }

    public VipCustomer() {
        this("Default name", 9999, "default@email.com");
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
