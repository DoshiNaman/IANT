//package Twenty.method_over_same;

class A{
    void show(){
        System.out.println("Inside Class-A");
    }
}
public class B extends A{
    //overriding method of class A
    void show(){
        System.out.println("Inside Class-B");
    }
}
