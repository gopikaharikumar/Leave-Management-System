import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stayback extends JFrame {

	  @SuppressWarnings({ "unchecked", "rawtypes" })
	public Stayback() {
         JFrame f=new JFrame();
	    // Set GridLayout, 3 rows, 2 columns, and gaps 5 between
	    // components horizontally and vertically
	    setLayout(null);



	    // Add labels and text fields to the frame
	    JLabel l1=new JLabel("Name:");
	    l1.setBounds(50,10,95,30);
	    JTextField t1=new JTextField() ;
		   t1.setBounds(250,10,95,30);add(t1);add(l1);

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
			   JLabel l4=new JLabel("Reason For StayBack:");
			   l4.setBounds(50,120,150,30);
			   JTextField t4=new JTextField() ;
			   t4.setBounds(250,120,95,30);
			   add(l4);add(t4);
	   

	   
			   JLabel l5=new JLabel("StayBack date and time:");
       	    l5.setBounds(50,160,350,30);
       	    JTextField t5=new JTextField() ;
       		   t5.setBounds(250,160,95,30);
       		   add(l5);
       		   add(t5);
	   
       		JLabel b1=new JLabel("Acceptance by counsellor:");
      	  
     	   b1.setBounds(250,350,250,30);
     	   add(b1);
     	 
     	    JLabel j3=new JLabel("Acceptance by Warden:");
               j3.setBounds(10,350,250,30);
               add(j3);
               
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

		   Stayback frame = new Stayback();

		    frame.setTitle("StayBack");

		    frame.setSize(200, 125);

		    frame.setLocationRelativeTo(null); // Center the frame
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    frame.setVisible(true);

		  }
}
