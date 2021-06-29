//naman_doshi
import java.util.*;
public class five {
    public static void main(String arg[]) {
        int a=0,r=0;
        System.out.println("ENter a number :");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        //1234
        /*while(a!=0){
            int digit=a%10;
            r=r*10+digit;
            a/=10;
        }*/

        for(;a!=0;a/=10){
            int digit=a%10;
            r=r*10+digit;
        }

        System.out.println("Reversed number : "+r);
    }
}
