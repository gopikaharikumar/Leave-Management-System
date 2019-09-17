import javax.swing.*;

import java.awt.*;

public class StayBack extends JFrame {

	  @SuppressWarnings({ "unchecked", "rawtypes" })
	public StayBack() {

	    // Set GridLayout, 3 rows, 2 columns, and gaps 5 between
	    // components horizontally and vertically
	    setLayout(new GridLayout(9, 2, 5, 5));



	    // Add labels and text fields to the frame
	    add(new JLabel("Name:"));
       
	    add(new JTextField(25));

	    add(new JLabel("Roll No:"));

	    add(new JTextField(20));

	    add(new JLabel("Class"));

	    add(new JTextField(5));
	    add(new JLabel("Stay Back Reason:"));
	    add(new JTextField(30));

	   
	    add(new JLabel("Stay back date and time:"));
	   
	 

	    add(new JTextField(30));
	    add(new JLabel("Acceptance by counsellor:"));
	    add(new JLabel("Acceptance by warden:"));

	    
	    
	    
	    
	    
	    

	  }
	 
	  public static void main(String[] args) {

		   StayBack frame = new StayBack();

		    frame.setTitle("StayBack");

		    frame.setSize(200, 125);

		    frame.setLocationRelativeTo(null); // Center the frame
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    frame.setVisible(true);

		  }
}

