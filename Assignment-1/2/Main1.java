public class Main1
{
    public static void main(String[] args)
    {
        BankAccount myAccount = new BankAccount("123456789", "Rahul", 3000.0);

        myAccount.displayAccountInfo();
        System.out.println("Initial Balance: " + myAccount.getBalance());

        myAccount.deposit(800.0);
        System.out.println("Current Balance: " + myAccount.getBalance());

        myAccount.withdraw(1000.0);
        System.out.println("Final Balance: " + myAccount.getBalance());
    }
}