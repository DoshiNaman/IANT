//@naman_d0shi
class cw{
    private int i;
    cw(){

    }

    cw(int i){
        this.i=i;
    }

    public int getValue(){
        return i;
    }

    public void setValue(int i){
        this.i=i;
    }

    public String toString(){
        return Integer.toString(i);
    }
}



class seven{
    public static void main(String arg[]){
        //byte=Byte
        //short=Short
        //int=Integer
        //long=Long
        //float=FloaT
        //double=Double
        //boolean=Boolean
        //char=Character
        
        /*
        Integer a=5;
        Double b=5.99;
        Character c='D';

        System.out.println(a.intValue());
        System.out.println(b.doubleValue());
        System.out.println(c.charValue());

        Integer myInt=100;
        String myStr;
        myStr=myInt.toString();
        System.out.println(myStr);
        System.out.println(myStr.length());


        //normal datatype to wrapper class
        int n=67;
        Integer i=Integer.valueOf(n);//explicitly
        
        Integer j=n;//autoboxing complier automatically write implictily
        System.out.println(n+" "+i+" "+j);
        //wrapper to normal
        Integer k=3;
        int l=k.intValue();//explictily
        int m=k;//unboxing complier automatically write implictily
        System.out.println(k+" "+l+" "+m);

*/

// custom wrapper class

        cw cw1=new cw(10);
        System.out.println(cw1);

    }
}
