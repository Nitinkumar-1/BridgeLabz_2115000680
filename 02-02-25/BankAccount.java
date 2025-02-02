class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }
}
class SavingsAccount extends BankAccount {
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }
}
public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.accountNumber = "987654321";
        savingsAccount.accountHolder = "John Doe";
        savingsAccount.setBalance(1000.00);
        savingsAccount.deposit(500.00);
        savingsAccount.withdraw(200.00);
        savingsAccount.displayAccountDetails();
    }
}
