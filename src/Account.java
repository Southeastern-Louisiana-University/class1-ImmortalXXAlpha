//Homework:
//provide appropriate get and set methods
//modify printAccount as appropriate

package src;

public class Account {
    private String customer;
    private double balance;

    //Constructor
    public Account(){};

    public Account(String name, double balance){
        this.customer = name;
        this.balance = balance;
    }

    //Prints Account information
    public void printAccount(){
        System.out.println("Account Information");
    }


    //Main Method
    public static void main(String args[]){
        Account account = new Account();
        Account account1 = new Account("Boo",  1000);
        account.printAccount();
        account1.printAccount();
    }
}
