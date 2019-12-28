package wallet.entity;

public class CustomerDetails {
    public CustomerDetails(String mobile, String name, double balance) {
        this.mobile = mobile;
        this.name = name;
        this.balance = balance;
    }

    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile=mobile;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void addsalary(double salary) {
        balance = balance + salary;
    }

    public void transferAmount(CustomerDetails p, double amount) {
        if (amount < balance) {
            p.balance = p.balance + amount;
            this.balance = this.balance - amount;
        }
    }
}