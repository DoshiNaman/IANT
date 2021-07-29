//@naman_d0shi
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class P12 extends JFrame implements ActionListener{
    CardLayout card;
    Container c; 
    TextField name,pass,cpass,email;
    CheckboxGroup ccc;
    Checkbox c1,c2;
    Button b1,b2,b3,b4;
    Label n,p,p1,e,g,Name,Pass,Cpass,Email,Gender,wel;
    
    P12(){
        c=getContentPane();
        Panel cp=new Panel();
        Panel cp1=new Panel();
        Panel cp2=new Panel();

        card=new CardLayout(40,30);
        
        n=new Label("Name : ",Label.CENTER);
        p=new Label("Password : ",Label.CENTER);
        p1=new Label("Re-Password : ",Label.CENTER);
        e=new Label("Email : ",Label.CENTER);
        g=new Label("Gender : ",Label.CENTER);
        Name=new Label("Name : ",Label.CENTER);
        Pass=new Label("Password : ",Label.CENTER);
        Cpass=new Label("Re-Password : ",Label.CENTER);
        Email=new Label("Email : ",Label.CENTER);
        Gender=new Label("Gender : ",Label.CENTER);
        wel=new Label("Welcome ",Label.CENTER);
        name=new TextField(45);
        pass=new TextField(40);
        pass.setEchoChar('#');
        cpass=new TextField(40);
        cpass.setEchoChar('#');
        email=new TextField(45);
        ccc=new CheckboxGroup();
        c1=new Checkbox("Male",ccc,false);
        c2=new Checkbox("Female",ccc,false);
        b1=new Button("Submit");
        b2=new Button("Cancel");
        b3=new Button("Conform");
        b4=new Button("Registartion");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        c.setLayout(card);
        cp.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        cp.setBackground(Color.cyan);
        cp1.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        cp1.setBackground(Color.green);
        cp2.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        cp2.setBackground(Color.gray);

        cp.add("a",n);
        cp.add("a1",name);
        cp.add("a2",p);
        cp.add("a3",pass);
        cp.add("a4",p1);
        cp.add("a5",cpass);
        cp.add("a6",e);
        cp.add("a7",email);
        cp.add("a8",g);
        cp.add("a9",c1);
        cp.add("a10",c2);
        cp.add("a11",b1);

        c.add("a",cp);

        cp1.add("b",Name);
        cp1.add("b1",Pass);
        cp1.add("b2",Email);
        cp1.add("b3",Gender);
        cp1.add("b4",b3);
        cp1.add("b5",b2);

        c.add("b",cp1);

        cp2.add("c",wel);
        cp2.add("c1",b4);

        c.add("c",cp2);

        c1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                Gender.setText(Gender.getText()+"Male");
            }
        });
        c2.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                Gender.setText(Gender.getText()+"Female");
            }
        });
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                    Name.setText(Name.getText()+name.getText());
                    Pass.setText(Pass.getText()+pass.getText());
                    Email.setText(Email.getText()+email.getText());
                    card.next(c);
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                card.previous(c);
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                wel.setText(wel.getText()+name.getText());
                card.next(c);
            }
        });
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                name.setText("");
                pass.setText("");
                cpass.setText("");
                email.setText("");
                Name.setText("Name : ");
                Pass.setText("Password : ");
                Email.setText("Email : ");
                Gender.setText("Gender : ");
                card.next(c);
            }
        });
        
    }

    public void actionPerformed(ActionEvent a){}

    public static void main(String[] args) {
        P12 p1=new P12();
        p1.setSize(600,600);
        p1.setVisible(true);
        p1.setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }
}
