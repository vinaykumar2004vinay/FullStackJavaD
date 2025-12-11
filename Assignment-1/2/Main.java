class BankAccount
{
    private String accountNumber;
    private String name;
    private double balance;

    public BankAccount(String accountNumber, String name, double initialBalance)
    {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = initialBalance;
    }

    public void deposit(double amount)
    {
        if (amount > 0)
            {
            balance = balance + amount;
            System.out.println("Successfully deposited: " + amount);
            }
        else
            {
                System.out.println("Deposit amount");
            }
    }

    public void withdraw(double amount)
    {
        if (amount > balance)
            {
                System.out.println("Insufficient balance to withdraw " + amount);
            }
        else
            {
                balance = balance - amount;
                System.out.println("Successfully withdrawn: " + amount);
            }
    }

    public double getBalance()
    {
        return balance;
    }
    
    public void displayAccountInfo()
    {
        System.out.println("Account: " + accountNumber);
        System.out.println("Owner: " + name);
    }
}
