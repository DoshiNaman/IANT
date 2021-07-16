//@naman_d0shi
//Write a program in Java to demonstrate implementation of multiple inheritance using interfaces.

interface AnimalEat {
    void eat();
}
interface AnimalTravel {
    void travel();
}
class Animal implements AnimalEat, AnimalTravel {
    public void eat() {
    System.out.println("Animal is eating");
    }
    public void travel() {
    System.out.println("Animal is travelling");
    }
}
 public class twenty_two{
     public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.travel();     
     }
 }
