package src;

public class Account {
    private String customer;
    private double balance;

    // Constructor
    public Account() {}

    public Account(String name, double balance) {
        this.customer = name;
        this.balance = balance;
    }

    // Getter and Setter methods
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Prints Account information
    public void printAccount() {
        System.out.println("Account Information:");
        System.out.println("Customer Name: " + customer);
        System.out.println("Balance: $" + balance);
    }

    // Main Method
    public static void main(String args[]) {
        Account account = new Account();
        Account account1 = new Account("Boo", 1000);

        account.setCustomer("John Doe");
        account.setBalance(500);

        account.printAccount();
        account1.printAccount();
    }
}
