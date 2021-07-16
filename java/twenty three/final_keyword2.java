//@naman_d0shi
import java.util.*;

class Base {
    public void displayMsg() {
        System.out.println("I'm displayMsg() in Base class.");
    }
}

class FinalClassExample extends Base {
    public void displayMsg1() {
        System.out.println("I'm displayMsg1() in Final class.");
    }
}
public class final_keyword2 {
    public static void main(String[] args) {
        FinalClassExample FCE = new FinalClassExample();
        FCE.displayMsg();
        FCE.displayMsg1();
    }   
}
