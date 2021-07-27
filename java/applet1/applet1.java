//@naman_d0shi
import java.awt.*;
import java.applet.*;
/*
<applet code="applet1" height="300" width="500"></applet>
*/
public class applet1 extends Applet{
    String str;
    public void paint(Graphics g){
        Dimension d=getSize();
        int x=d.width/2;
        int y=d.height/2;
        int r=100;
        g.drawOval(x-r, y-r, 2*r,2*r);
        g.drawString("Naman", x, y);
    }
}
