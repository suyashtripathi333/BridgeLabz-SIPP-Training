package Day1_OOPS.Level2;

import java.util.Scanner;

public class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    void setAccount(String holder, String number, double balance) {
        this.accountHolder = holder;
        this.accountNumber = number;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();
        b.setAccount(sc.next(), sc.next(), sc.nextDouble());
        int q = sc.nextInt();
        while (q-- > 0) {
            int op = sc.nextInt();
            if (op == 1) b.deposit(sc.nextDouble());
            else if (op == 2) System.out.println(b.withdraw(sc.nextDouble()) ? "Withdrawn" : "Insufficient Balance");
            else if (op == 3) b.displayBalance();
        }
    }
}

