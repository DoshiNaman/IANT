//@naman_d0shi
//Write a program in Java to develop user defined
exception for 'Divide by Zero' error. 
import java.util.*;
class twenty_four {
   public static void main (String args[]) {
        Scanner s=new Scanner(System.in);
        int num1 = 0, num2 = 0, result = 0;
        System.out.println("ENter Two Numbers : ");
        num1=s.nextInt();
        num2=s.nextInt();
        try{
            result = num1/num2;
            System.out.println("The result is : " +result);
        } 
        catch (ArithmeticException e) {
            System.out.println ("Can't be divided by Zero " + e);
        }
   }
}
