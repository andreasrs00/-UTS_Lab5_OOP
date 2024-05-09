package No3;

public class Account {
    private String id;
    private String name;
    private double balance;

    // Constructor with balance parameter
    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Constructor without balance parameter (default balance = 0)
    public Account(String id, String name) {
        this(id, name, 0);
    }

    // Getter for ID
    public String getID() {
        return id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Getter for Balance
    public double getBalance() {
        return balance;
    }

    // Method to credit
    public void credit(double amount) {
        balance += amount;
    }


    // Method to debit
    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Amount exceeded balance");
        } else {
            balance -= amount;
        }
    }

    // Method to transfer funds from this account to another account
    public void transferTo(Account anotherAccount, double amount) {
        if (amount > balance) {
            System.out.println("Amount exceeded balance");
        } else {
            this.debit(amount); // Withdraw from this account
            anotherAccount.credit(amount); // Deposit to another account
        }
    }


    // Override toString() method to print account details
    @Override
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
