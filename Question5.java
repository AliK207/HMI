import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Question5 extends JFrame{

    private static void createAndShowGUI() {

            JFrame frame = new JFrame("Question5 Ali Khalaf");
	    JDialog jd = new JDialog();
	    JLabel label = new JLabel("Hello World !");
	

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	    label.setPreferredSize(new Dimension(175, 100));
            frame.getContentPane().add(label, BorderLayout.WEST);

	    //if true modal if false not modal
	    jd.setModal(true);

	    frame.pack();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
	
	    jd.setLayout(null);
     	    jd.setLocationRelativeTo(null);   
	    jd.setVisible(true);
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



		




