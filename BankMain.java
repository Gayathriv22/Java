package bank.ui;

import bank.entity.BankAccount;

public class BankMain {

    public static void main(String[] args) {
        BankAccount a[] = new BankAccount[2];
        a[0] = new BankAccount(1, "SRK", 2000);
        a[1] = new BankAccount(2, "BKS", 3000);
        a[0].addAmount(200);
        a[1].addAmount(100);
        a[0].transferAmount(a[1], 100);
        BankMain b = new BankMain();
        b.print(a);
    }

    public void print(BankAccount[] w) {
        for (int i = 0; i < 2; ++i) {
            System.out.println("account details  :" + w[i].getId() + "  " + w[i].getName() + " has a balance of: " + w[i].getbalance());
        }
    }
}