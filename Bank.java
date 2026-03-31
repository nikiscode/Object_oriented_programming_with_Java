// Parent Class:
class Account {
    protected String accountType = "General";   // Protected variable
    private double balance;                     // Private variable

    // Constructor
    public Account(double balance) {
        setBalance(balance);
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter with validation
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }
}

// Child Class
class SavingsAccount extends Account {

    // Constructor
    public SavingsAccount(double balance) {
        super(balance);
        accountType = "Savings"; // Change account type
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
        }
    }

    // Withdraw method with minimum balance rule
    public void withdraw(double amount) {
        if (getBalance() - amount >= 400) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful! New balance: $" + getBalance());
        } else {
            System.out.println("Error: Transaction denied. Minimum balance of $500 required for Savings.");
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        SavingsAccount acc = new SavingsAccount(1000);

        // First withdrawal
        acc.withdraw(600);

        // Second withdrawal
        acc.withdraw(100);

        // Display final details
        System.out.println("Account Type: " + acc.accountType);
        System.out.println("Final Balance: $" + acc.getBalance());
    }
}
