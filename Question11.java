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

import java.awt.*;    
import javax.swing.*;   
import java.awt.event.*;

import javax.swing.BoxLayout;
public class Question11 extends JFrame{
        static JFrame f;  

public static void main(String[] args) {
	
	JFrame f= new JFrame("Label Example"); 
	f.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE  );	
	CardLayout crd;    
	JButton btn1, btn2, btn3;    
	 int currCard = 1;  
  
	// Declaring of objects  
	// of the CardLayout class.  
	 CardLayout cObjl;  
  
	// constructor of the class  
	f.setTitle("Card Layout Methods");  
  
	// Method to set the visibility of the JFrame  
	f.setSize(310, 160);  
  
	// Creating an Object of the "Jpanel" class  
	JPanel cPanel = new JPanel();  
  
	// Initializing of the object "cObjl"  
	// of the CardLayout class.  
	cObjl = new CardLayout();  
  
	// setting the layout  
	cPanel.setLayout(cObjl);  
  
	// Initializing the object  
	// "jPanel1" of the JPanel class.  
	JPanel jPanel1 = new JPanel();  
  
	// Initializing the object  
	// "jPanel2" of the CardLayout class.  
	JPanel jPanel2 = new JPanel();  
  
	// Initializing the object  
	// "jPanel3" of the CardLayout class.  
	JPanel jPanel3 = new JPanel();  
  
	// Initializing the object  
	// "jPanel4" of the CardLayout class.  
	JPanel jPanel4 = new JPanel();  
  
	// Initializing the object  
	// "jl1" of the JLabel class.  
	JLabel jLabel1 = new JLabel("C1");  
  
	// Initializing the object  
	// "jLabel2" of the JLabel class.  
	JLabel jLabel2 = new JLabel("C2");  
  
	// Initializing the object  
	// "jLabel3" of the JLabel class.  
	JLabel jLabel3 = new JLabel("C3");  
  
	// Initializing the object  
	// "jLabel4" of the JLabel class.  
	JLabel jLabel4 = new JLabel("C4");  
  
	// Adding JLabel "jLabel1" to the JPanel "jPanel1".  
	jPanel1.add(jLabel1);  
  
	// Adding JLabel "jLabel2" to the JPanel "jPanel2".  
	jPanel2.add(jLabel2);  
  
	// Adding JLabel "jLabel3" to the JPanel "jPanel3".  
	jPanel3.add(jLabel3);  
  
	// Adding JLabel "jLabel4" to the JPanel "jPanel4".  
	jPanel4.add(jLabel4);  
  
	// Add the "jPanel1" on cPanel  
	cPanel.add(jPanel1, "1");  
  
	// Add the "jPanel2" on cPanel  
	cPanel.add(jPanel2, "2");  
  
	// Add the "jPanel3" on cPanel  
	cPanel.add(jPanel3, "3");  
  
	// Add the "jPanel4" on cPanel  
	cPanel.add(jPanel4, "4");  
  
	// Creating an Object of the "JPanel" class  
	JPanel btnPanel = new JPanel();  
  
	// Initializing the object  
	// "firstButton" of the JButton class.  
	JButton firstButton = new JButton("First");  
  
	// Initializing the object  
	// "nextButton" of the JButton class.  
	JButton nextButton = new JButton("->");  
  
	// Initializing the object  
	// "previousbtn" of JButton class.  
	JButton previousButton = new JButton("<-");  
  
	// Initializing the object  
	// "lastButton" of the JButton class.  
	JButton lastButton = new JButton("Last");  
  
	// Adding the JButton "firstbutton" on the JPanel.  
	btnPanel.add(firstButton);  
  
	// Adding the JButton "nextButton" on the JPanel.  
	btnPanel.add(nextButton);  
  
	// Adding the JButton "previousButton" on the JPanel.  
	btnPanel.add(previousButton);  
  
	// Adding the JButton "lastButton" on the JPanel.  
	btnPanel.add(lastButton);  
   
 
   
  
	// using to get the content pane  
	f.getContentPane().add(cPanel, BorderLayout.NORTH);  
  
	// using to get the content pane  
	f.getContentPane().add(btnPanel, BorderLayout.SOUTH);  
	f.setVisible(true);




	 
	
}  
}  

