import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeaveForm extends JFrame {

	  @SuppressWarnings({ "unchecked", "rawtypes" })
	public LeaveForm() {
        JFrame f=new JFrame();
	    // Set GridLayout, 3 rows, 2 columns, and gaps 5 between
	    // components horizontally and vertically
	    setLayout(null);



	    JLabel l1=new JLabel("Name:");
	    l1.setBounds(50,10,95,30);
	    JTextField t1=new JTextField() ;
	   t1.setBounds(250,10,95,30);
    add(l1);add(t1);
    
	    JLabel l2=new JLabel("Roll No:");
	    l2.setBounds(50,40,95,30);
	    JTextField t2=new JTextField() ;
		   t2.setBounds(250,40,95,30);
		    
	    add(l2);add(t2);
	    JLabel l3=new JLabel("Class:");
	  l3.setBounds(50,80,95,30);
	  JTextField t3=new JTextField() ;
	   t3.setBounds(250,80,95,30);
	    
	   add(l3);add(t3);
	    JLabel l4=new JLabel("Ground for leave:");
	   l4.setBounds(50,120,150,30);
	   JTextField t4=new JTextField(20) ;
	   t4.setBounds(250,120,95,30);
	   add(l4);add(t4);
	    JLabel l5=new JLabel("Whether leaving campus:");
        	    l5.setBounds(50,160,350,30);
        	    JTextField t5=new JTextField(20) ;
        		   t5.setBounds(250,160,95,30);
        		   add(l5);
        		   add(t5);
	    JLabel l6=new JLabel("Leaving Date and time:");
	    JTextField t6=new JTextField(20) ;
		   t6.setBounds(250,190,95,30);
	    l6.setBounds(50,190,355,30);
	    add(l6);add(t6);
	    
	    JLabel l7=new JLabel("Destination:");
        l7.setBounds(50,250,1505,30);
        JTextField t7=new JTextField(15) ;
		   t7.setBounds(250,250,95,30);
        add(l7);
        add(t7);
        
	    JLabel b1=new JLabel("Acceptance by counsellor:");
	  
	   b1.setBounds(150,350,250,30);
	   add(b1);
	   
	   JButton b4=new JButton("Apply");
       b4.setBounds(250,450,95,30);
       add(b4);

	 
	    JButton b3=new JButton("Back");
          b3.setBounds(10,450,95,30);
	    
	    b3.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent ae) {
	              f.dispose();
	              StudentProfile s=new StudentProfile();
	              s.setSize(400, 300);
 
	              s.setVisible(true);
	              
	          }
	          });

	    
add(b3);
	  
	 

	  }
	 
	  public static void main(String[] args) {

		    LeaveForm frame = new LeaveForm();

		    frame.setTitle("LeaveForm");

		    frame.setSize(200, 125);

		    frame.setLocationRelativeTo(null); // Center the frame
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    frame.setVisible(true);

		  }
}
