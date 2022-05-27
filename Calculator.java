import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame implements ActionListener
{
TextField t1,t2;
Label l1,l2,l3,l4;
Button b1,b2,b3,b4;
public Calculator()
{
super();
Font g=new Font("Arial",Font.BOLD,20);
Font h=new Font("Cooper",Font.BOLD,15);
t1= new TextField(10);
t2= new TextField(10);

b1=new Button("+");
b2=new Button("-");
b3=new Button("*");
b4=new Button("/");
l1=new Label("Result : ");
l2=new Label("First Number ");
l3=new Label("Second Number");
l4=new Label(" ");
add(t1);
add(t2);
add(b1);
add(b2);
add(b3);
add(b4);
add(l1);
add(l2);
add(l3);
add(l4);
setLayout(null);
setBackground(Color.gray);
l2.setBounds(40,100,160,30);
l3.setBounds(40,130,160,30);
t1.setBounds(180,100,100,20);
t2.setBounds(180,130,100,20);
b1.setBounds(70,180,30,30);
b2.setBounds(130,180,30,30);
b3.setBounds(190,180,30,30);
b4.setBounds(250,180,30,30);
l1.setBounds(40,220,80,20);
l4.setBounds(130,220,200,20);
l1.setForeground(Color.red);
l1.setFont(g);
l2.setForeground(Color.yellow);
l2.setFont(h);  
l3.setForeground(Color.blue);
l3.setFont(h);
l4.setForeground(Color.red);
l4.setFont(h);
b1.setForeground(Color.red);
b1.setFont(g);
b2.setForeground(Color.red);
b2.setFont(g);
b3.setForeground(Color.red);
b3.setFont(g);
b4.setForeground(Color.blue);
b4.setFont(g);
setVisible(true);
setSize(300,300);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
int  a=Integer.parseInt(t1.getText());
int  d=Integer.parseInt(t2.getText());
int  c=a+d;
l4.setText(String.valueOf(c));
}
if(ae.getSource()==b2)
{
int  a=Integer.parseInt(t1.getText());
int  d=Integer.parseInt(t2.getText());
int  c=a-d;
l4.setText(String.valueOf(c));
}
if(ae.getSource()==b3)
{
int  a=Integer.parseInt(t1.getText());
int  d=Integer.parseInt(t2.getText());
int  c=a*d;
l4.setText(String.valueOf(c));
}
if(ae.getSource()==b4)
{
float  a=Float.parseFloat(t1.getText());
float  d=Float.parseFloat(t2.getText());
float  c=a/d;
l4.setText(String.valueOf(c));
}

}

public static void main (String args[])
{
new Calculator();
}
}