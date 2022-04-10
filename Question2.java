import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Question2 extends JFrame{

    private static void createAndShowGUI() {
	
	    JFrame frame = new JFrame("JFrame");
 	    JLabel label = new JLabel("Hello World!");

 
    	    label.setPreferredSize(new Dimension(175, 100));
	    //ajout du mots dans label dans la frame
            frame.getContentPane().add(label, BorderLayout.CENTER);	
	
	    frame.pack();
            frame.setVisible(true);
     	    frame.setLocationRelativeTo(null);

 
    }


    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

