import java.awt.FlowLayout;
import javax.swing.JWindow;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.Box;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 



import javax.swing.BoxLayout;
public class Question10 extends JFrame{
        static JFrame f;  

	public static void main(String[] args) {

   
		JButton button;

	     	f=new JFrame("Question10_ALI_KHALAF");
		f.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
 

		button = new JButton("Button 1");
                c.weightx = 0.5;

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;

		f.add(button, c);
 
	 	button = new JButton("Button 2");

		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 1;
		c.gridy = 0;
		
		f.add(button, c);
 
		button = new JButton("Button 3");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;

		c.gridx = 2;
		c.gridy = 0;
		f.add(button, c);
 

		button = new JButton("Button 4");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 40;      //make this component tall
		c.weightx = 0.0;
		c.gridwidth = 3;
		c.gridx = 0;
		c.gridy = 1;

		f.add(button, c);
 
		button = new JButton("5");

		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;       //reset to default


		c.weighty = 1.0;   //request any extra vertical space

		c.anchor = GridBagConstraints.PAGE_END; //bottom of space

		c.insets = new Insets(10,0,0,0);  //top padding

		c.gridx = 1;       //aligned with button 2


		c.gridwidth = 2;   //2 columns wide

		c.gridy = 2;       //third row

		f.add(button, c);  
 
	    	f.setSize(400, 400);    

	    	f.setVisible(true);   

	}  
}  

    
