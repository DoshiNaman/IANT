//@naman_d0shi
public class twe {
    int a,b;
    
    static int count;
    private twe(){
        count++;
        System.out.println("I am Defult constructor "+count);
    }
    private twe(int a,int b){
        this.a=a;
        this.b=b;
    }
    int getA(){return a;}
    int getB(){return b;}
    
    public static void main(String arg[]){
        twe t1=new twe();
        twe t2=new twe();
        twe t3=new twe();
        twe t4=new twe();
        System.out.println("Instances of Default constructor "+count);

        twe t5=new twe(count,5);
        int x=t5.getA();
        int y=t5.getB();

        int m=x<y?x:y;

        System.out.println("Minimum of "+x+" and "+y+" is "+m); 
    }
}
