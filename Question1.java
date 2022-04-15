import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Question1 extends JFrame{

    private static void createAndShowGUI(){

	    JWindow wind = new JWindow();
	    JLabel label = new JLabel("Hello World !");

	    label.setPreferredSize(new Dimension(175,100));
	    wind.getContentPane().add(label,BorderLayout.CENTER);
	
	    wind.setSize(300,300);
	//    wind.setLocation(700,500);
            wind.pack();
	    wind.setVisible(true);


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

