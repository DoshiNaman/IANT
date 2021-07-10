//@naman_d0shi
class A
{
    static int x;
}
class B extends A
{
    int x;
    void display()
    {
        System.out.println("Static variable x: "+super.x);
        System.out.println("Normal variable x: "+x);
    }
}
class seventeen{
    public static void main(String arg[])
    {
        A a=new A();
        a.x=56;
        
        B b=new B();
        b.x=44;
        
        b.display();
    }
}
