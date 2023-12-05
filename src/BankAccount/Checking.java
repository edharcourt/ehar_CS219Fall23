package BankAccount;

public class Checking extends Account {

    public Checking(String name, double balance) {
        // Call the constructor in the super class
        super(name, balance, 0);
    }

    // override the base class implementation
    public String kind() { return "checking"; }
}
