 
import javax.swing.*;
import java.awt.*;

  
public class StudentLogin extends JFrame {
	  JButton SUBMIT;
	  JPanel panel;
	  JLabel label1,label2;
	  final JTextField  text1,text2;
	   StudentLogin()
	   {
	   label1 = new JLabel();
	   label1.setText("Username:");
	   text1 = new JTextField(15);
	 
	   label2 = new JLabel();
	   label2.setText("Password:");
	   text2 = new JPasswordField(15);
	  
	   SUBMIT=new JButton("SUBMIT");
	   
	   panel=new JPanel(new GridLayout(3,1));
	   panel.add(label1);
	   panel.add(text1);
	   panel.add(label2);
	   panel.add(text2);
	   panel.add(SUBMIT);
	   add(panel,BorderLayout.CENTER);
	   setTitle("Student Login");
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
	   }
	 }
	


