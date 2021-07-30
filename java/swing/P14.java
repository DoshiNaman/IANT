//@naman_d0shi
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class P14 extends JFrame implements ItemListener{
    static JFrame f;
    static JLabel l,l1;
    static JComboBox c1;
    P14(){}
    public static void main(String[] args) {
        f=new JFrame();
        P14 s=new P14();
        f.setLayout(new FlowLayout());
        String s1[]={"C","C++","JAVA","PHP","Python"};
        c1=new JComboBox(s1);
        c1.addItemListener(s);
        l=new JLabel("Select Your Language ");
        l1=new JLabel("C Selected");
        JPanel p=new JPanel();
        p.add(l);
        p.add(c1);
        p.add(l1);
        f.add(p);
        f.setSize(400,180);
        f.show();
    }
    public void itemStateChanged(ItemEvent e){
        if(e.getSource()==c1){
            l1.setText(c1.getSelectedItem()+" selected");
        }
    }
}
