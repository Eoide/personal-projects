import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double transactions) {
        this.name = name;
        this.transactions.add(Double.valueOf(transactions));
    }

    public String getName() {
        return name;
    }

    public void getTransactions() {
        int count = 1;
        for(Double d: transactions) {
            System.out.print(count + d + "");
            count++;
        }
 //       return transactions;
    }

    public void addTransaction(double amount) {
        this.transactions.add(Double.valueOf(amount));
    }
}
