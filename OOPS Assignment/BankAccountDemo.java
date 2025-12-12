// BankAccountDemo.java
public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", "Ravi", 1000.0);
        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(1500); // should show insufficient
        System.out.println("Final Balance: " + acc.getBalance());
    }
}

class BankAccount {
    private String accountNumber;
    private String name;
    private double balance;

    public BankAccount(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited " + amount + ". Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance to withdraw " + amount);
            return;
        }
        balance -= amount;
        System.out.println("Withdrew " + amount + ". Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}