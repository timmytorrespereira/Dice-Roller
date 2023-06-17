import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class View extends JFrame {
    //text_field
    private JTextField inputbox = new JTextField( 10);
    //button 
    private JButton button = new JButton("Roll !");

    private JTextArea text = new JTextArea("Hey!");

    public View() {
        //frame stuff
        setTitle("Dice Roller");
        setSize(1000, 600);
        getContentPane().setBackground(Color.MAGENTA);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //button
        button.setBounds(50, 50, 400, 100);

        //text
        //add components to frame
        add(button);
        add(inputbox);
        add(text);
    }
}