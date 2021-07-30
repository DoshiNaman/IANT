//@naman_d0shi
import java.awt.event.*;
import javax.swing.*;

public class P13 extends JFrame implements ActionListener{
    static JTextField t;
    static JFrame f;
    static JButton b;
    static JLabel l;
    P13(){}
    public static void main(String[] args) {
        f=new JFrame("TextFeild NAMAN");
        l=new JLabel("nothing entered");
        b=new JButton("Submit");
        t=new JTextField(16);
        JPanel p=new JPanel();
        P13 c=new P13();
        b.addActionListener(c);
        p.add(t);
        p.add(b);
        p.add(l);
        f.add(p);
        f.setSize(300,300);
        f.show();
    }
    public void actionPerformed(ActionEvent e){
        String s=e.getActionCommand();
        if(s.equals("Submit")){
            l.setText(t.getText());
            t.setText("");
        }
    }
}
