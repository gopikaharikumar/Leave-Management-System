
import javax.swing.*;
import java.awt.*;



public class FrontPage {
	
	
	public static void main(String []args) 
	{
	    JFrame f=new JFrame("Leave Management");  
	    JButton b1=new JButton("Student");  
	    b1.setBounds(10,150,95,30);
	    JButton b2=new JButton("Faculty"); 
	    b2.setBounds(150,50,95,30);
	    f.add(b1);  
	    f.add(b2);
	    f.setSize(400,400);  
	     
	    f.setVisible(true); 
	    f.setLocationRelativeTo(null);
	    f.setLayout( new GridBagLayout() );
	    f.add(b1, new GridBagConstraints());
	    f.add(b2, new GridBagConstraints());
	  
	    
	 
	   
	    }
}