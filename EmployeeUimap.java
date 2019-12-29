import Employee.Employee;
import Employee.Manager;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class EmployeeUIMap {
    public static void main(String[] args) {
        
       EmployeeUIMap emp = new EmployeeUIMap();
       emp.execute();
    }
    Map<Integer, Employee>  store = new Hashmap<>();
    
    public void execute(){       
        
        Employee e1 = new Employee(1, "Rohan", 500);
        store.put(1, e1);        
    
        Manager m1 = new Manager(2, "ITManager", 1000);
        store.put(2, m1);      

        e1.addSalary(500);
        m1.addSalary(900);       

        m1.addManagedEmployee(e1);   

        print();

        Employee fetched = fetchById(1);
        System.out.println("Id is : " +fetched.getId + " Name is " 
        + fetched.getName + " Balance is: " + fetched.getBalance);  
    }


    public Employee fetchByID(Integer id){
        Employee e= store.get(id);
        return e;

    }

    public void print() {
         Set<Integer> keys = store.keySet();
            for (Integer i : keys) {

                Employee eu = store.get(i);
                System.out.println("Emp id: " + eu.getId() + ", Emp name: " 
                + eu.getName() + ", Emp balance: " + eu.getBalance());

                boolean isManager = eu instanceof Manager;
                if(isManager){
                    Manager m = (Manager) eu;
                    Employee[] managedEmployees = m.getManagedEmployees();
                    System.out.println(" Managed Employees: ");
                    for(Employee managed : managedEmployees){
                        if(managed != null){                            
                            System.out.println(managed.getName());                           
                    }
                }

            }
    }
}
}