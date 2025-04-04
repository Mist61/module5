package mist;

public class Bank {
    private double balance;

    public Bank(double initialBalance) {
        this.balance = initialBalance;
    }

    public double deposit(double amount) {
        if (amount <= 0) {
            return -1;
        }
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        if (amount <= 0) {
            return -1;
        }
        if (amount > balance) {
            return -1;
        }
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }
}
