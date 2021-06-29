//@naman_doshi
import java.util.Scanner;
public class four {
    public static void main(String args[]){
        //int a=56,b=78,c=23;
        int max=0,second_max=0,temp,numbers;
        System.out.println("How many numbers do you want to enter ?");
        Scanner s=new Scanner(System.in);
        numbers=s.nextInt();
        System.out.println("Enter Numbers:");
        for(int i=0;i<numbers;i++){
            if(i==0){
                max=s.nextInt();
            }
            else{
                temp=s.nextInt();
                if(temp>max){
                    second_max=max;
                    max=temp;
                }
                else if(temp>second_max){
                    second_max=temp;
                }
            }
        }
        System.out.println("-----Second--Highest-----");
        System.out.println("Second maximum number is : "+second_max);
    }
}
