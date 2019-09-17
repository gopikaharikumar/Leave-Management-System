
import javax.swing.*;
import java.awt.*;



public class StudentProfile {
	
	
	public static void main(String []args) 
	{
	    JFrame f=new JFrame("Student Profile");  
	    JLabel l1= new JLabel("Roll No:  ");
	    l1.setBounds(0,10,95,30);
	    JLabel l2= new JLabel("Name:  ");
	    
	    JButton b1=new JButton("Apply for Leave");  
	    b1.setBounds(200,250,150,30);
	    JButton b2=new JButton("Stayback Form"); 
	    b2.setBounds(200,300,150,30);
	    f.add(b1);  
	    f.add(b2);
	    f.add(l1);
	    f.add(l2);
	    f.setSize(400,400);  
	    b1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
f.dispose();
Leaveform l1=new Leaveform();
l1.setSize(400, 300);

l1.setDefaultCloseOperation(
JFrame.EXIT_ON_CLOSE);
l1.setVisible(true);

}
});
	    b2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
f.dispose();
Stayback sb1=new Stayback();
sb1.setSize(400, 300);

sb1.setDefaultCloseOperation(
JFrame.EXIT_ON_CLOSE);
sb1.setVisible(true);

}
});
	    f.setVisible(true); 
	    f.setLocationRelativeTo(null);
	    
	  
	    
	 
	   
	    }
}
