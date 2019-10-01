import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StaybackReq extends JFrame {

	  @SuppressWarnings({ "unchecked", "rawtypes" })
	public StaybackReq() {
     JFrame f=new JFrame();
	    // Set GridLayout, 3 rows, 2 columns, and gaps 5 between
	    // components horizontally and vertically
	    setLayout(null);



	    // Add labels and text fields to the frame
	    JLabel l1=new JLabel("Name:");
       
	    l1.setBounds(50,10,95,30);
       add(l1);
	    JLabel l2=new JLabel("Roll No:");
	    l2.setBounds(50,40,95,30);
	    add(l2);
	    JLabel l3=new JLabel("Class:");
	  l3.setBounds(50,80,95,30);
	   add(l3);
	    JLabel l4=new JLabel("StayBack Reason:");
	   l4.setBounds(50,120,150,30);
	   add(l4);
	    JLabel l5=new JLabel("Stayback date and time:");
        
	    l5.setBounds(50,160,350,30);
	  
        
	    JButton b1=new JButton("Acceptance by counsellor:");
	  
	   b1.setBounds(150,250,250,30);
	   add(b1);
	 
	    JButton b3=new JButton("Back");
          b3.setBounds(10,250,95,30);
	    
	    b3.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent ae) {
	              f.dispose();
	              FacultyProfile s=new FacultyProfile();
	              s.setSize(400, 300);
 
	              s.setVisible(true);
	              
	          }
	          });

	    
add(b3);
	  }
	 
	  public static void main(String[] args) {

		    StaybackReq frame = new StaybackReq();

		    frame.setTitle("Stayback Request");

		    frame.setSize(400, 400);

		   // frame.setLocationRelativeTo(null); 
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    frame.setVisible(true);

		  }
}

