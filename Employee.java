public class Employee {

    public Employee() {}
        public Employee(int id, String name,double balance) {
            this.id = id;
            this.name = name;
            this.balance = balance;
        }

    private int id;
    public int getId(){
        return id;
    }
    public void setid(int id){
        this.id=id;
    }

    private String name;
    public String getName(){
       return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double balance;
    public double getbalance(){
        return balance;
    }
    public void addsalary(double salary){
        balance=balance+salary;
    }

}

