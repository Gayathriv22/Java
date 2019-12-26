public class EmployeeMain {


    public static void main(String[] args) {
        Employee []e= new Employee[4];
        e[0]=new Employee(1,"Sai", 3000);
        e[1]=new Employee(2,"Sree",2000);
        e[2]=new Employee(3,"Ans",4000);
        e[3]=new Employee(4,"Shy",2000);
        Manager m1=new Manager(1,"riya",20000);
        Manager m2=new Manager(2,"Yash",30000);

        e[0].addsalary(10000);
        e[1].addsalary(20000);
        e[2].addsalary(30000);
        e[3].addsalary(40000);
        m1.addManagedemployees(e[0]);
        m2.addManagedemployees(e[1]);
        m1.addManagedemployees(e[2]);
        m2.addManagedemployees(e[3]);
        Employee[] managedHR=new Employee[2];
        Employee[] managedIT=new Employee[2];
        managedHR=m1.getManagedEmployees();
        managedIT=m2.getManagedEmployees();
        EmployeeMain emp=new EmployeeMain();
       // emp.print(e);
        System.out.println("Manager is :");
        m1.getName();
        emp.print(managedHR);
        emp.print(managedIT);
        }
        public void print(Employee[] ne){
        for(int i=0;i<2;++i){
            System.out.println("Id is: " +ne[i].getId());
            System.out.println("Name is: " +ne[i].getName());
            System.out.println("balance is: " +ne[i].getbalance());
        }
        }
    }

