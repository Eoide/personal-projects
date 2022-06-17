import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
    }

    public void addCustomer(String name, double amount) {
        customers.add(new Customer(name, amount));
    }

    //need to validate customer exists with name = customers.name
    public void addTransaction(String name, double amount) {

    }


}
