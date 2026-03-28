//static vs final 
class Bank {
    public final double INTEREST_RATE = 4.5;
    public static double totalBankCash = 0;
    String accountHolder;
    double balance;

    public Bank(String name, double openingAmount) {
        this.accountHolder = name;
        this.balance = openingAmount;
        totalBankCash += openingAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.println("Customer: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Bank user1 = new Bank("Aryan", 1000);
        user1.display();

        System.out.println(user1.getBalance());
    }
}
