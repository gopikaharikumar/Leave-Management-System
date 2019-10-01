import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FacultyProfile extends JFrame {
	
	FacultyProfile()
	{
	    JFrame f=new JFrame("Faculty Profile");  
	    f.setSize(400,400);
	    f.setLayout(null);
	    JLabel l1= new JLabel("Dept:  ");
	    
	    JLabel l2= new JLabel("Name:  ");
	    
	    JButton b1=new JButton("Leave Requests:");  
	   
	    JButton b2=new JButton("Stayback Requests:");
	    
	    l1.setBounds(50,10,95,30);
	    l2.setBounds(50,40,95,30);
	    b1.setBounds(50,90,180,30);
	    b2.setBounds(50,140,180,30);
	
	    f.add(l1);  
	    f.add(l2);
	    f.add(b1);
	    f.add(b2);
	    
	    b1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
f.dispose();
LeaveRequest l1=new LeaveRequest();
l1.setSize(400, 300);
l1.setVisible(true);
l1.setDefaultCloseOperation(
JFrame.EXIT_ON_CLOSE);


}
});
	    b2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
f.dispose();
StaybackReq sb1=new StaybackReq();
sb1.setSize(400, 300);

sb1.setDefaultCloseOperation(
JFrame.EXIT_ON_CLOSE);
sb1.setVisible(true);

}
});
	    f.setVisible(true); 
	    f.setLocationRelativeTo(null);
	    
	  
	    
	 
	   
	    }
	public static void main(String[] args)
	{
		new FacultyProfile();
	}
}