import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;


public class test {

    public static Color getBackgroundColor(String theme) {
        return theme == "dark" ? Color.BLACK : Color.WHITE ;
    }
    
    public static Color getFontColor(String theme) {
        return theme == "dark" ? Color.WHITE : Color.BLACK ;
    }

    public static void main(String args[]) {

        final String[] theme = {"dark"};

        JFrame win = new JFrame("Text Editor Ali Khalaf");
        win.getContentPane().setLayout(new BorderLayout());
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        
	
	JTextPane textArea = new JTextPane();
        JScrollPane body = new JScrollPane(textArea);
        body.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        textArea.setBackground(getBackgroundColor(theme[0]));
        textArea.setForeground(getFontColor(theme[0]));

        


        JMenuBar taskBar = new JMenuBar();
        taskBar.setLayout(new BoxLayout(taskBar, BoxLayout.X_AXIS));
        taskBar.setBackground(Color.LIGHT_GRAY);

        JMenu tasks = new JMenu("Files");
        JMenuItem nouveau = new JMenuItem("New"); nouveau.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK)); 
        nouveau.addActionListener((e) -> {System.out.println("New");});

        JMenuItem ouvrir = new JMenuItem("Open"); ouvrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK)); 
        ouvrir.addActionListener((e) -> {System.out.println("Open");});

        JMenuItem enregistrer = new JMenuItem("Save"); enregistrer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK)); 
        enregistrer.addActionListener((e) -> {System.out.println("Save");});

        JMenuItem enregistrersous = new JMenuItem("Save As"); enregistrersous.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.ALT_DOWN_MASK)); 
        enregistrersous.addActionListener((e) -> {System.out.println("Save As");});

        JMenuItem miseEnPage = new JMenuItem("Page Layout");
        JMenuItem imprimer = new JMenuItem("Print");
        JMenuItem quitter = new JMenuItem("Exit");

        tasks.add(nouveau);
        tasks.add(ouvrir);
        tasks.add(enregistrer);
        tasks.add(enregistrersous);
        tasks.addSeparator();
        tasks.add(miseEnPage);
        tasks.add(imprimer);
        tasks.addSeparator();
        tasks.add(quitter);

        JMenu edition = new JMenu("Edit");


        JMenu format = new JMenu("Format");
        JMenuItem darkTheme = new JMenuItem("Dark Theme"); darkTheme.addActionListener((e) -> {theme[0] = theme[0] == "dark" ? "light" : "dark"; textArea.setBackground(getBackgroundColor(theme[0]));
        textArea.setForeground(getFontColor(theme[0]));});

        format.add(darkTheme);

        taskBar.add(tasks);
        taskBar.add(edition);
        taskBar.add(format);


        JPanel footer = new JPanel();
        footer.setLayout(new FlowLayout(FlowLayout.LEFT));
        footer.setBackground(Color.LIGHT_GRAY);

        JLabel recherche = new JLabel("Search : ");
        JTextField searchBar = new JTextField(); searchBar.setColumns(10);
        JButton left = new JButton("<=");
        JButton right = new JButton("=>");
        JButton highlight = new JButton("Underline All");


        footer.add(recherche);
        footer.add(searchBar);
        footer.add(left);
        footer.add(right);
        footer.add(highlight);




        win.getContentPane().add(taskBar, BorderLayout.NORTH);
        win.getContentPane().add(body, BorderLayout.CENTER);
        win.getContentPane().add(footer, BorderLayout.SOUTH);


        win.setPreferredSize(new Dimension(400, 300));
        win.setVisible(true);        
        win.pack();

        win.setLocationRelativeTo(null);


    }
}
