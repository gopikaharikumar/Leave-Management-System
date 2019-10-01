
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


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
	    b1.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent ae) {
		f.dispose();
		StudentLogin s1=new StudentLogin();
		s1.setSize(400, 300);
		s1.setDefaultCloseOperation(
JFrame.EXIT_ON_CLOSE);

		s1.setVisible(true);

}
});
	    b2.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent ae) {
		f.dispose();
		FacultyLogin f1=new FacultyLogin();
		f1.setSize(400, 300);
		f1.setDefaultCloseOperation(
JFrame.EXIT_ON_CLOSE);

		f1.setVisible(true);

}
});
	    f.setVisible(true); 
	    f.setLocationRelativeTo(null);
	    f.setLayout( new GridBagLayout() );
	    f.add(b1, new GridBagConstraints());
	    f.add(b2, new GridBagConstraints());
	  
	    
	 
	   
	    }
}