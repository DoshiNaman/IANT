//@naman_d0shi
//constructor
//overload
//copy

class a{
    int n;
    a(){
        System.out.println("Defualt Constructor");
    }
    a(int x,int y){
        System.out.println("Add is : "+(x+y));
    }
    a(int n){
        this.n=n;
        System.out.println("Number is : "+this.n);
        int i,j,flag;
        
        for(i=1;i<=this.n;i++)
        {
            flag=0;
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag++;
                    break;
                }
            }
            
            if(flag==0)
            {
                System.out.println("Prime is "+i);
            }
        }
    }
    //copy cons
    a(a a1,int aa){
        n=a1.n;
        int max;
        max=aa>n?aa:n;
        System.out.println("The max number is "+max);
    }
}

public class eleven {
    public static void main(String arg[]){
        a cp1 = new a(5,6);
        a cp2 = new a(5);
        a cp3 = new a(cp2,3);
    }
}
