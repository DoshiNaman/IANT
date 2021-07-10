//@naman_d0shi
class SuperClass
{
    int x;
    SuperClass(int a)
    {
        x=a;
        System.out.println("Super Class : " +x);
    }
}
class SubClass extends SuperClass
{
    int y;
    SubClass(int l,int m)
    {
        super(l);
        y=m;
        System.out.println("Sub class : "+y);
    }
}
class eighteen
{
    public static void main(String arg[])
    {
        SubClass s=new SubClass(5,4);
    }
}
