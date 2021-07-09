//@naman_d0shi

//passbyvalue
class fourteen
{
    String name="java";
    void display(String name)
    {
        name="Java Programming";
    }
    public static void main(String arg[])
    {
        fourteen p=new fourteen();
        System.out.println("Before changes : "+p.name);
        p.display("C++");
        System.out.println("After changes : "+p.name);
    }
}
//passbyrefereance
class fourteen
{
    String name="Java";
    void display(fourteen p)
    {
        name="Java Programming";
    }
    public static void main(String arg[])
    {
        fourteen p=new fourteen();
        System.out.println("Before changes : "+p.name);
        p.display(p);
        System.out.println("After changes : "+p.name);
    }
}
//return value
class fourteen
{
    int n1,n2;
    void getValue(int a,int b)
    {
        n1=a;
        n2=b;
    }
    int returnMax()
    {
        return n1>n2?n1:n2;
    }
    public static void main(String arg[])
    {
        fourteen R=new fourteen();
        R.getValue(12,44);
        System.out.println("Maximum is : "+R.returnMax());
    }
}
//return object
class fourteen
{
    int n1,n2;
    fourteen(int a,int b)
    {
        n1=a;
        n2=b;
    }
    fourteen minNumber()
    {
        fourteen min=new fourteen(55,35);
        return min;
    }
    public static void main(String arg[])
    {
        fourteen R1=new fourteen(66,234);
        fourteen R2=R1.minNumber();
        int minR1=R1.n1<R1.n2?R1.n1:R1.n2;
        System.out.println("Minimum of (R1) "+R1.n1+" & "+R1.n2+" is "+minR1);
        int minR2=R2    .n1<R2.n2?R2.n1:R2.n2;
        System.out.println("Minimum of (R2) "+R2.n1+" & "+R2.n2+" is "+minR2);
    }
}
