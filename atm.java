package Atm;

public class atm {
    private double balance;
    private double withdrawamount;
    private double depositeamount;
    public String getdepositeamount;
    public atm(){

    }
    public double getbalance(){
        return balance;
    }
    public  void setbalance(Double balancee){
        this.balance=balancee;

        
    }
    public double withdrawamount(){
        return withdrawamount;
    }
    public void setwithdrawamount(Double withdrawamountt){
        this.withdrawamount=withdrawamountt;
       
        
    }
    public double depositeamount(){
        return depositeamount;

    }
    public void setdepositeamount(Double depositeamountt){
        this.depositeamount=depositeamountt;
        
        
    }
}
