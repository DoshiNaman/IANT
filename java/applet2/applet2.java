//@naman_d0shi
import java.awt.*;
import java.applet.*;

public class applet2 extends Applet{
    public void paint(Graphics g){
        String str=getParameter("a");
        String str2=getParameter("b");
        int aa=Integer.parseInt(str);
        int bb=Integer.parseInt(str2);
        int cc=aa+bb;
        String str3="Sum of "+aa+" and "+bb +"is : "+cc;  
        //String str3=str+str2;
        g.drawString(str3,50, 50);  
    }
}
