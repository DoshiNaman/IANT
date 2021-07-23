//@naman_d0shi

/*
Write a program in Java to demonstrate use of
synchronization of threads when multiple threads are
trying to update common variable.
*/

class Printing
{
    synchronized void printnumber(int n)
    {
        System.out.println("Start");
        for(int j=n;j>0;j--)
        {
            try
            {
                if(j==n/2)
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            { ; }
            System.out.print(" "+j);
        }
        System.out.println();
        System.out.println("End");
    }
}
class Threadserve implements Runnable
{
        int n;
        Printing pt;
        Thread th;
        Threadserve(Printing p,int x)
        {
            n=x;
            pt=p;
            th=new Thread(this);
            th.start();
        }
        public void run()
        {       
            pt.printnumber(n);
        }
}


public class twenty_nine{
    public static void main(String[] args) {
        Printing p=new Printing();
        Threadserve ts1=new Threadserve(p,12);
        Threadserve ts2=new Threadserve(p,8);
        Threadserve ts3=new Threadserve(p,6);
    }
}
