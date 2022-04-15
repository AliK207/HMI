import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Question3 extends JFrame {

	private static void createAndShowGUI() {

	
		JFrame frame = new JFrame("My Frame");
		JLabel label = new JLabel("Hello World !");

		//cette method permet a l'appuie sur X de fermer la frame et stop prog
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		label.setPreferredSize(new Dimension(175, 100));
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

