package BankAccount;

public abstract class Account {

    private String name;
    private double balance;

    // protected instance data is available
    // in derived classes
    protected double rate;

    public Account(String name, double balance, double rate) {
        this.name = name;
        this.balance = balance;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double getRate() {
        return rate;
    }

    // An abstract method must be defined in a derived class
    // If a class has at least one abstract method, then the
    // class must also be declared as abstract
    public abstract String kind();

    public String toString() {
        return  kind() + "{" + "Name = " + getName() + ","
                + "balance = " + getBalance() + ","
                + "rate = " + rate + "}";
    }
}
