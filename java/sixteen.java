//@naman_d0shi
class findleapyear{
    public void find(String y){
        int year=Integer.parseInt(y);
        boolean flag = false;
        if(year % 400 == 0)
        {
            flag = true;
        }
        else if (year % 100 == 0)
        {
            flag = false;
        }
        else if(year % 4 == 0)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        if(flag)
        {
            System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+year+" is not a Leap Year");
        }
    }
}

class child extends findleapyear{

}

public class sixteen {
    public static void main(String args[]) {
        child c1=new child();
        c1.find(args[0]);
        
    }
}
