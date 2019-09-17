
import javax.swing.*;
import java.awt.*;



public class FacultyProfile {
	
	
	public static void main(String []args) 
	{
	    JFrame f=new JFrame("Student Profile");  
	    JLabel l1= new JLabel("Name:  ");
	    l1.setBounds(0,10,95,30);
	    JLabel l2= new JLabel("Department:  ");
	    
	    JButton b1=new JButton("Leave Requests");  
	    b1.setBounds(200,250,150,30);
	    JButton b2=new JButton("Stayback Requests"); 
	    b2.setBounds(200,300,170,30);
	    f.add(b1);  
	    f.add(b2);
	    f.add(l1);
	    f.add(l2);
	    f.setSize(400,400);  
	     
	    f.setVisible(true); 
	    f.setLocationRelativeTo(null);
	    
	  
	    
	 
	   
	    }
}