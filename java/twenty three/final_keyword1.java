//@naman_d0shi
final class Base {
    public void displayMsg() {
        System.out.println("I'm displayMsg() in Base class.");
    }
}

class FinalClassExample extends Base {
    public void displayMsg1() {
        System.out.println("I'm displayMsg1() in Final class.");
    }
}
public class final_keyword1{
    public static void main(String[] args) {
        FinalClassExample FCE = new FinalClassExample();
        FCE.displayMsg();
        FCE.displayMsg1();       
    }
}

//show error
/*
/FinalClassExample.java:9: error: cannot inherit from final Base
public class FinalClassExample extends Base {
                                       ^
1 error
*/
