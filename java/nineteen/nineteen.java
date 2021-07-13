//@naman_d0shi
/*
Write a program that illustrates interface inheritance.
Interface P12 inherits from both P1 and P2. Each
interface declares one constant and
one method. The class Q implements P12. Instantiate Q
and invoke each of its methods. Each method displays
one of the constants.
*/

/*

class B
   
extends

class a   

interface a

extends

interface b

interface

implements

class
*/

/*
interface D{
    void draw();
}

class R implements D{
    public void draw(){
        System.out.println("Drawing R");
    }
}

class C implements D{
    public void draw(){
        System.out.println("Drawing C");
    }
}


public class nineteen{
    public static void main(String[] args) {
        D d1;//creation
        d1=new C();//init
        d1.draw();

        R r1=new R();
        r1.draw();
    }
}*/


interface P{
    final int p=5;
    void dispP();
}
interface P1 extends P{
    final int p1=10;
    void dispP1();
}
interface P2 extends P{
    final int p2=20;
    void dispP2();
}
interface P12 extends P1,P2{
    final int p12=12;
    void dispP12();
}


class Q implements P12{
    public void dispP(){
        System.out.println("disP : "+p1);
    }
    public void dispP1(){
        System.out.println("disP1 : "+p2);
    }
    public void dispP2(){
        System.out.println("disP2 : "+p12);
    }
    public void dispP12(){
        System.out.println("disP12 : "+p);
    }
}




public class nineteen{
    public static void main(String[] args) {
        Q q=new Q();
        q.dispP();
        q.dispP1();
        q.dispP2();
        q.dispP12();
    }
}
