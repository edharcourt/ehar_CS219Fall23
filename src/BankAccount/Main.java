package BankAccount;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Checking c1 = new Checking("Harry", 100);
        System.out.println(c1);
        Savings s1 = new Savings("Harry", 1000);

        // Abstract classes cannot be instantiated because
        // they are incomplete.
        // Account a1 = new Account("Harry", 200, .9);

        Account a1 = new Checking("Hermione", 2000);

        // An ArrayList of accounts
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(c1);
        accounts.add(s1);

    }
}
