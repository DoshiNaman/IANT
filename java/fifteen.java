//@naman_d0shi

// Single Inheritance 
class ClassA 
{
    public void dispA()
    {
        System.out.println("disp() method of ClassA");
    }
}
class fifteen extends ClassA 
{
    public void dispB()
    {
        System.out.println("disp() method of SingleInheritance");
    }
    public static void main(String args[])
    {
        //Assigning SingleInheritance object to SingleInheritance reference
        fifteen b = new fifteen();
        //call dispA() method of ClassA
        b.dispA();
        //call dispB() method of SingleInheritance
        b.dispB();
    }
}

// Multilevel Inheritance
class ClassA 
{
    public void dispA()
    {
        System.out.println("disp() method of ClassA");
    }
}
class ClassB extends ClassA 
{
    public void dispB()
    {
        System.out.println("disp() method of ClassB");
    }
}
class fifteen extends ClassB
{
    public void dispC()
    {
        System.out.println("disp() method of MultilevelInheritance");
    }
    public static void main(String args[])
    {
        //Assigning MultilevelInheritance object to MultilevelInheritance reference
        fifteen c = new fifteen();
        //call dispA() method of ClassA
        c.dispA();
        //call dispB() method of ClassB
        c.dispB();
        //call dispC() method of MultilevelInheritance
        c.dispC();
    }
}

//Hierarchical Inheritance
class ClassA 
{
    public void dispA()
    {
        System.out.println("disp() method of ClassA");
    }
}
class ClassB extends ClassA 
{
    public void dispB()
    {
        System.out.println("disp() method of ClassB");
    }
}
class ClassC extends ClassA
{
    public void dispC()
    {
        System.out.println("disp() method of ClassC");
    }
}
class ClassD extends ClassA
{
    public void dispD()
    {
        System.out.println("disp() method of ClassD");
    }
}
public class fifteen 
{
    public static void main(String args[])
    {
        //Assigning ClassB object to ClassB reference
        ClassB b = new ClassB();
        //call dispB() method of ClassB
        b.dispB();
        //call dispA() method of ClassA
        b.dispA();
        
        
        //Assigning ClassC object to ClassC reference
        ClassC c = new ClassC();
        //call dispC() method of ClassC
        c.dispC();
        //call dispA() method of ClassA
        c.dispA();
        
        //Assigning ClassD object to ClassD reference
        ClassD d = new ClassD();
        //call dispD() method of ClassD
        d.dispD();
        //call dispA() method of ClassA
        d.dispA();
    }
}
