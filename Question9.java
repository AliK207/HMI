import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
 
import java.awt.Insets;
import java.awt.Dimension;
public class Question9 {
    private static void createAndShowGUI() {

    

	    //Create and set up the window.
        JFrame frame = new JFrame("JFrame");

	//frame.getContentPane().setLayout(new BoxLayout( BoxLayout.Y_AXIS));

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
	JLabel emptyLabel = new JLabel("Center");


	JPanel panel = new JPanel();	
	BoxLayout box = new BoxLayout(panel,BoxLayout.Y_AXIS);	
	

	panel.setLayout(box);
	
	panel.setBorder(new EmptyBorder(new Insets(50, 200, 150, 200)));
	
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
	JButton btn12 = new JButton("Button 12");
	JButton btn13 = new JButton("Button 13");
	JButton btn14 = new JButton("Button 14");
	JButton btn15 = new JButton("Button 15");
	JButton btn16= new JButton("Button 16");





	frame.getContentPane().add(btn1);
	frame.getContentPane().add(btn2);
	frame.getContentPane().add(btn3);

	frame.getContentPane().add(Box.createVerticalGlue());
	frame.getContentPane().add(btn4);
	frame.getContentPane().add(btn5);
	frame.getContentPane().add(btn6);
	frame.getContentPane().add(btn7);
        frame.getContentPane().add(btn8);
	frame.getContentPane().add(btn9);
	frame.getContentPane().add(btn10);
	frame.getContentPane().add(btn11);
	frame.getContentPane().add(btn12);
	frame.getContentPane().add(btn13);
	frame.getContentPane().add(btn14);
	frame.getContentPane().add(btn15);
	frame.getContentPane().add(btn16);
	

	//Display the window.

//	frame.add(panel);	
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
