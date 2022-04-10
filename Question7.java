import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Question7 {

	private static void createAndShowGUI() {
 
		JFrame frame = new JFrame("Question7");


		JLabel label = new JLabel("Center");

		JButton btn1 = new JButton("Button 1");
	        JButton btn2 = new JButton("Button 2");
        	JButton btn3 = new JButton("Button 3");
        	JButton btn4 = new JButton("Button 4");
        	JButton btn5 = new JButton("Button 5");
        	JButton btn6 = new JButton("Button 6");
        	JButton btn7 = new JButton("Button 7");
        	JButton btn8 = new JButton("Button 8");
        	JButton btn9 = new JButton("Button 9");
        	JButton btn10 = new JButton("Button 10");
        	JButton btn11 = new JButton("Button 11");


		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		//ajout des bouttons dans la fenetre
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn2);
		frame.getContentPane().add(btn3);
		frame.getContentPane().add(btn4);
		frame.getContentPane().add(btn5);
		frame.getContentPane().add(btn6);
		frame.getContentPane().add(btn7);
        	frame.getContentPane().add(btn8);
		frame.getContentPane().add(btn9);
		frame.getContentPane().add(btn10);
		frame.getContentPane().add(btn11);

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


