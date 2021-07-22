//@naman_d0shi
class ThreadExample extends Thread
{
    ThreadExample(String s)
    {
        super(s);
        start();
    }
    public void run()
    {
        for(int i=1;i<=50;i++)
        {
            //System.out.println(Thread.currentThread().getName());
            try
            {
                if(Thread.currentThread().getName()=="Thread2" && i%2!=0)
                {
                   System.out.println("Odd Numbers : "+i);
                    Thread.sleep(1000);
                }
                else if(Thread.currentThread().getName()=="Thread1" && i%2==0)
                {
                    System.out.println("Even Numbers : "+i);
                    Thread.sleep(1000);
                }
                
            }
            catch(Exception e){}
        }
    }
}
public class twenty_eight
{
    public static void main(String arg[])
    {
        System.out.println("Thread name : "+Thread.currentThread().getName());
        ThreadExample e1=new ThreadExample("Thread1");
        ThreadExample e2=new ThreadExample("Thread2");
    }
}
