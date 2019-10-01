
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

  
public class FacultyLogin extends JFrame {
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton SUBMIT;
	  JPanel panel;
	  JLabel label1,label2;
	  final JTextField  text1,text2;
	   FacultyLogin()
	   { JFrame f=new JFrame();
		   setSize(200,200);
		   setVisible(true);
		   setLayout(null);
	   label1 = new JLabel();
	   label1.setText("Username:");
	   text1 = new JTextField(15);
	 
	   label2 = new JLabel();
	   label2.setText("Password:");
	   text2 = new JPasswordField(15);
	  
	   SUBMIT=new JButton("SUBMIT");
	   label1.setBounds(50,10,95,30);
	    text1.setBounds(150,10,150,30);
	    label2.setBounds(50,40,150,30);
	    text2.setBounds(150,40,150,30);
	    SUBMIT.setBounds(150,70,150,30);
	   
	    SUBMIT.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent ae) {
	             f. dispose();
	              FacultyProfile s=new FacultyProfile();
	              s.setSize(400, 300);
 
	              s.setVisible(true);
	              
	          }
	          });
	    
	   add(label1);
	   add(text1);
	   add(label2);
	   add(text2);
	   add(SUBMIT);
	
	   setTitle("Faculty Login");
	   }
	   public static void main(String arg[])
	   {
		   new FacultyLogin();
	  
	   }
	 }
	

