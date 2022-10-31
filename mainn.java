package Atm;

import java.util.Scanner;

public class mainn {
    /**
     * @param args
     */
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        atmimplementation atm=new atmimplementation();
        int atmnumber=12345;
        int atmpin=123;
        System.out.println("welcome!!");
        System.out.println("enter your   atm number");
        int atmnum=sc.nextInt();
        System.out.println("enter your atm pincode");
        int pincode=sc.nextInt();
        if(atmnumber==atmnum && atmpin==pincode){
            while(true){
                System.out.println("enter choice"); 
            System.out.print("1.view balance \n 2.withdrawamount\n3.depositeamount \n4. view mini statement\n 5.exit");
        int choice=sc.nextInt();
       
        if(choice==1){
           atm.viewbalance();
        }else if(choice==2){
            System.out.println("enter amount to withdraw");
            double withdrawamount=sc.nextDouble();
            atm.withdrawamount(withdrawamount);

        }else if(choice==3){
        System.out.println("enter amount to deposite");
        double depositeamount=sc.nextDouble();
        atm.depositeamount(depositeamount);

        }else if(choice==4){
            atm.viewministatement();

        }else if(choice==5){
            System.out.println("collect your atm card");

        }else{
            System.out.println("enter correct option");
        }
        }
        
    }else{
        System.out.println("invalid atmnumber or pincode");
        System.exit(0);
    }
    
    }
        }
    
    

