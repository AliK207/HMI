import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;

import java.awt.FlowLayout;
import javax.swing.JWindow;
import javax.swing.*;
import java.awt.GridLayout;

public class Question9 extends JFrame{
        static JFrame f;  

public static void main(String[] args) {

	 Box b = Box.createVerticalBox(); 
       
     f = new JFrame("Question9 Ali Khalaf");
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // creating buttons  
    JButton b1 = new JButton("1");// the button will be labeled as NORTH   
    JButton b2 = new JButton("2");// the button will be labeled as SOUTH  
    JButton b3 = new JButton("3");// the button will be labeled as EAST  
    JButton b4 = new JButton("4");// the button will be labeled as WEST  
    JButton b5 = new JButton("5");// the button will be labeled as CENTER

  
	b.add(b1);
	
	Dimension minSize = new Dimension(100, 200);
	Dimension prefSize = new Dimension(200, 300);
	Dimension maxSize = new Dimension(500, 100);
	
	b.add(new Box.Filler(minSize, prefSize, maxSize));
	
	b.add(b2);
	b.add(b3);
	f.add(b);


    f.setSize(400, 400);    
    f.setVisible(true);  
     
      
}  
}  

