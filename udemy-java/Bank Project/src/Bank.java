import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branch;

    public Bank(String name) {
        this.name = name;
    }

    public void addBranch(String name) {
        branch.add(new Branch(name));
    }

    public void addCustomer(String branch, String name, double amount) {
        //find branch
            //if not found, print error
        //add customer to that branch with amount
    }

    public void addTransaction(String branch, String name, double amount) {
        //find branch
            //if not found, print error
        //find customer
            //if not found, print error
        //add transaction to arraylist
    }

    public void displayCustomers(String branch) {
        //find branch
        //cycle through each customer in arrayList, print each name
            //cycle through each transaction for each customer, print trans.
    }


}
