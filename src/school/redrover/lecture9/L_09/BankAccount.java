package school.redrover.lecture9.L_09;

public class BankAccount {
    private String accountNumber;
    private double balance = 0;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public void debit(double amount) {
        double newBalance = balance - amount;
        if(newBalance < 0) {
            System.out.println("Cannot debit more the account balance");
        } else {
            this.balance = newBalance;
        }
        }


}
