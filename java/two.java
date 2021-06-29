//@naman_d0shi
import java.util.*;

class two{
    public static void main(String arg[]){
        int a=0,n=0,i=1,j=1,ct=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Number:");
        a=s.nextInt();
        System.out.println("-----Prime--Numbers-----");
        while(n<a){
            j=1;
            ct=0;
            while(j<=i){
                if(i%j==0){
                    ct++;
                }
                j++;
            }
            if(ct==2){
                System.out.println(i);
                n++;
            }
            i++;
        }
    }
}
