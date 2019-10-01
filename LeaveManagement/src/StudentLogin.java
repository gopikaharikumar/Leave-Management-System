 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  
public class StudentLogin extends JFrame implements ActionListener {
	  static JButton SUBMIT;static JFrame f=new JFrame();
	  JPanel panel;
	  JLabel label1,label2;
	  
	  JLabel l1, l2, l3,l4;
	  JTextField tf1;
	  JButton btn1,btn2;
	  JPasswordField p1;

	  StudentLogin()
	  {
	  setTitle("Login");
	  setVisible(true);
	  setSize(200,200);
	  setLayout(null);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	  l1 = new JLabel("Login");
	  l1.setForeground(Color.blue);
	  l1.setFont(new Font("Serif", Font.BOLD, 20));

	  l2 = new JLabel("Enter Email:");
	  l3 = new JLabel("Enter Password:");
	  tf1 = new JTextField();
	  p1 = new JPasswordField();
	  l4=new JLabel("Don't already have an account?");
	  btn2=new JButton("Signup");
	  btn1 = new JButton("Submit");

	  l1.setBounds(100, 30, 400, 30);
	  l2.setBounds(80, 70, 200, 30);
	  l3.setBounds(80, 110, 200, 30);
	  l4.setBounds(80,200,300,30);
	  tf1.setBounds(300, 70, 200, 30);
	  p1.setBounds(300, 110, 200, 30);
	  btn1.setBounds(300, 160, 100, 30);
	  btn2.setBounds(300,200,100,30);
	  
	  btn1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent ae) {
              f.dispose();
              StudentProfile s1=new StudentProfile();
              s1.setSize(400, 300);
              
              
              s1.setVisible(true);
              
          }
          });
	  
	  btn2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent ae) {
              f.dispose();
              StudentProfile s1=new StudentProfile();
              s1.setSize(400, 300);
              
              
              s1.setVisible(true);
              
          }
          });
	  

	  add(l1);
	  add(l2);
	  add(tf1);
	  add(l3);
	  add(p1);
	  add(l4);
	  add(btn2);
	  add(btn1);
	   }
	   public static void main(String arg[])
	   {
	  try
	   {
	   StudentLogin frame=new StudentLogin();
	   frame.setSize(300,100);
	   frame.setVisible(true);
	   }
	   catch(Exception e)
	   {JOptionPane.showMessageDialog(null, e.getMessage());}
	   
	   SUBMIT.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
f.dispose();
StudentProfile sp1=new StudentProfile();
sp1.setSize(400, 300);
sp1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
sp1.setVisible(true);

}
});
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	}
	