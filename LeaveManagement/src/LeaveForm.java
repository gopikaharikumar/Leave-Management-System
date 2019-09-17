import javax.swing.*;

import java.awt.*;

public class LeaveForm extends JFrame {

	  @SuppressWarnings({ "unchecked", "rawtypes" })
	public LeaveForm() {

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
	    add(new JLabel("Grounds for leave:"));

	    add(new JTextField(30));
	    add(new JLabel("Whether leaving campus:"));

	    add(new JComboBox(new String[]{"YES","NO"}));
	    add(new JLabel("Departure date and time:"));

	    add(new JTextField(30));
	    add(new JLabel("Destination:"));

	    add(new JTextField(30));
	    add(new JLabel("Acceptance by counsellor:"));
	    add(new JLabel("Acceptance by warden:"));

	    
	    
	    
	    
	    
	    

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

