import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Question6 extends JFrame{

	private static void createAndShowGUI() {

		JFrame frame = new JFrame("Question 6");
		JLabel label = new JLabel("Center");
		
		JButton b_nord = new JButton("Norht");
		JButton b_sud = new JButton("South");
		JButton b_est = new JButton("East");
		JButton b_west = new JButton("West");



		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setPreferredSize(new Dimension(175, 100));
		frame.getContentPane().add(label, BorderLayout.CENTER);
		
		//add the buttons on the Frame in their positions
		frame.getContentPane().add(b_nord,BorderLayout.NORTH);
		frame.getContentPane().add(b_sud, BorderLayout.SOUTH);
		frame.getContentPane().add(b_west, BorderLayout.WEST);
		frame.getContentPane().add(b_est, BorderLayout.EAST);


		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	}

	public static void main(String[] args) {

	   javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

