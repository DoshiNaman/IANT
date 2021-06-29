//@naman_d0shi
import java.util.Scanner;
public class three {
    public static void main(String args[]){
        //int a=56,b=78,c=23;
        int a,b,c;
        System.out.println("ENter three numbers:");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        System.out.println("-----Greater--Value-----");
        if(a>b && a>c){ System.out.println("Greatest is : "+a);}
        else if(b>c && b>a){System.out.println("Greatest is : "+b);}
        else{System.out.println("Greatest is : "+c);}
    }
}
