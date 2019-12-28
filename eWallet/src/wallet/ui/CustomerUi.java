package wallet.ui;


import wallet.entity.CustomerDetails;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CustomerUi {
    public static void main(String[]args){
        CustomerUi u=new CustomerUi();
        u.execute();
    }
    Map<String,CustomerDetails> store=new HashMap<>();
      public void execute(){
  CustomerDetails c1=new CustomerDetails("222","Ram",300);
  store.put("222",c1);
  CustomerDetails c2=new CustomerDetails("992","Sri",400);
  store.put("992",c2);
          c1.transferAmount(c2, 100);
          print();
          CustomerDetails fetched=findByMobile("222");
          System.out.println(fetched.getName());

    }
    public CustomerDetails findByMobile(String mobile){
        CustomerDetails e=store.get(mobile);
        return e;

    }
    public void print() {
        Set<String> keys = store.keySet();
        for (String mobile : keys) {
            CustomerDetails e = store.get(mobile);
            System.out.println(e.getName() + e.getBalance());

        }

        }

    }