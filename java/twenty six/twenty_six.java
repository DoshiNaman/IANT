//@naman_d0shi
import java.util.*;
/*

Write a small application in Java to develop Banking
Application in which user deposits the amount Rs
1000.00 and then start withdrawing of Rs 400.00, Rs
300.00 and it throws exception "Not Sufficient Fund"
when user withdraws Rs. 500 thereafter. 

*/

public class twenty_six{
    public static void main(String[] args) {
        int i=1,choice,balance=1000;
        Scanner s=new Scanner(System.in);
        while(i==1){
            System.out.println("!--Choices--!");
            System.out.println("1.Withdraw\n2.Deposit\n3.Balance\n4.Exit");
            System.out.println("Enter Choice : ");
            choice=s.nextInt();
            if(choice==4){
                i++;
            }
            else if(choice==3){
                System.out.println("Balance is : "+balance+"\n");
            }
            else if(choice==2){
                System.out.println("ENter Deposit Amount : ");
                int dep=s.nextInt();
                balance=balance+dep;
                System.out.println("Deposit successfully\n");
            }
            else if(choice==1){
                System.out.println("ENter Withdraw Amount : ");
                int wi=s.nextInt();
                int temp=balance;
                try{
                    temp=temp-wi;
                    if(temp < 0){
                        throw new Exception("Not Sufficient Fund");
                    }
                    else{
                        balance=balance-wi;
                        temp=0;
                        System.out.println("Withdraw successfully\n");
                    }
                }
                catch(Exception e){
                    System.out.println("My Exception "+e);
                    System.out.println("Withdraw not successfully\n");
                }
                
            }
            else{
                System.out.println("ENter Right Choice\n");
            }
        }
    }   
}
