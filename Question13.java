import java.awt.FlowLayout;
import javax.swing.JWindow;
import javax.swing.*;
import java.awt.BorderLayout;
public class Question13 {
       // private static JDialog d;  

	public static void main(String[] args) {


	    	JFrame f = new JFrame("Question 13 Ali Khalaf");

	   	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton b7 = new JButton("Button 1");// the button will be labeled as NORTH   
	    	JButton b6 = new JButton("Button 2");// the button will be labeled as SOUTH  
		JButton b8 = new JButton("Button 3");
    
		// creating buttons  
	  
	    	JPanel b1 = new JPanel();// the button will be labeled as NORTH   
       
		b1.setLayout(new FlowLayout(FlowLayout.CENTER));
     
		b1.add(b7);  
		b1.add(b6); 
		b1.add(b8);

	    	JButton b2 = new JButton("SOUTH");// the button will be labeled as SOUTH  
	    	JButton b3 = new JButton("EAST");// the button will be labeled as EAST 
	       	JButton b4 = new JButton("WEST");// the button will be labeled as WEST  
	    	JButton b5 = new JButton("CENTER");// the button will be labeled as CENTER


	    	f.add(b1, BorderLayout.NORTH); // b1 will be placed in the North Direction    
	    	f.add(b2, BorderLayout.SOUTH);  // b2 will be placed in the South Direction    
	       	f.add(b3, BorderLayout.EAST);  // b2 will be placed in the East Direction    
	       	f.add(b4, BorderLayout.WEST);  // b2 will be placed in the West Direction    
	       	f.add(b5, BorderLayout.CENTER);  // b2 will be placed in the Center    
        
    
		f.setSize(300, 300);    
	    	f.setVisible(true);  
	}
}   
