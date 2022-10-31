package  Atm;


import java.util.HashMap;
import java.util.Map;
public class atmimplementation implements atmoperartion{
       atm at=new atm();
       Map<Double,String>ministate=new HashMap<>();

    
    @Override
    public void viewbalance() {
       at.getbalance() ;
        
    }

    @Override
    public void depositeamount(double depositeamount) {
       System.out.println(depositeamount+"amount deposited");
      
    ministate.put(depositeamount,"amount deposited" );
       at.setbalance(at.getbalance()+depositeamount);
       viewbalance();
        
    }

    @Override
    public void withdrawamount(double withdrawamount) {

        if(withdrawamount<=at.getbalance()){
            ministate.put(withdrawamount, "amount deposited");
            System.out.println(withdrawamount+"amount withdrawn");
            at.setbalance(at.getbalance()-withdrawamount);
            viewbalance();;
        }
        
    }

    
    @Override
    public void viewministatement() {
       for(java.util.Map.Entry<Double, String> m:ministate.entrySet()){
        System.out.println(m.getKey()+" "+m.getValue());
       }
        
    }
       

  
    
}