import java.awt.FlowLayout;
import javax.swing.JWindow;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;


public class Question12 extends JFrame{
        static JFrame f;  

	public static void main(String[] args) {

    		Box b = Box.createVerticalBox(); 
       
    		f = new JFrame();
    		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



	       // creating buttons  

		JButton b1 = new JButton("1");// the button will be labeled as NORTH   
    		JButton b2 = new JButton("2");// the button will be labeled as SOUTH  
    		JButton b3 = new JButton("3");// the button will be labeled as EAST  
    		JButton b4 = new JButton("4");// the button will be labeled as WEST  
    		JButton b5 = new JButton("5");// the button will be labeled as CENTER
 
 		f.setLayout(null);
	       	b1.setBounds(50,30,120,40);
		b2.setBounds(65,70,120,40);	
		b3.setBounds(80,110,120,40);
		b4.setBounds(95,150,120,40);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
                f.add(b4);


		f.setSize(400, 400);    
		f.setVisible(true);  

    
    
     

     
      
}  
}  

    
