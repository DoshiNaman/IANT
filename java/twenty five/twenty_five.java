//@naman_d0shi
//Write a program in Java to demonstrate multiple try block and multiple catch exception 
public class twenty_five{
    public static void main(String[] args) {
        try{    
            int a[]=new int[5];    
            a[5]=30/0;
            String s=null;  
            System.out.println(s.length()); 
            //a[7]=30;    
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
              }             
           System.out.println("rest of the code");      
    }
}
