package col;
import emp.Employee;

import java.util.*;

public class SetEx {
public static void main (String[]args){
    Employee e1 =new Employee(1,"Sai",300);
    Employee e2=new Employee(2,"Dev",300);
    Employee e3=new Employee(3,"Avantika",400);
    Employee e4=new Employee(1,"Sai",300);
    Set set=new LinkedHashSet();
    set.add(e1);
    set.add(e2);
    set.add(e3);
    set.add(e4);
    int size=set.size();
    System.out.println("size= "+size);
    boolean contains=set.contains(e2);
    System.out.println("set contains e2 = "+contains);
    SetEx ex=new SetEx();
    ex.print(set);


    boolean same=e1==e2;
    System.out.println("e1 and e2 same="+same);
    boolean equals =e1.equals(e4);
    System.out.println("e1 equals e2 = "+equals);

}
public void print(Set set){
    for(Object o:set){
        Employee e=(Employee)o;
        System.out.println(e.getId()+""+e.getName());
    }
}
}
