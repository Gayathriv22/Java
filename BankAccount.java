package bank.entity;

public class BankAccount {

    public BankAccount() {
    }

    public BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    private int id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double balance;

    public double getbalance() {
        return balance;
    }

    public void addAmount(double Amount) {
        balance = balance + Amount;
    }

    public void transferAmount(BankAccount p, double amount) {
        if (amount < balance) {
            p.balance = p.balance + amount;
            this.balance = this.balance - amount;
        }
    }
}