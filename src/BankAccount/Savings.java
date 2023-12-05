package BankAccount;

public class Savings extends Account {
    public Savings(String name, double balance) {
        super(name, balance, .03);
    }

    public String kind() { return "savings"; }
}
