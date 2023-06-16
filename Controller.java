import java.awt.Color;
import java.util.concurrent.Flow;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
   
    }
    public static void main(String[] args) {
        //frame stuff
        JFrame frame = new JFrame("Dice Roller");
        frame.setSize(1000, 600);
        frame.getContentPane().setBackground(Color.CYAN);

        //button stuff
        JButton button = new JButton("Roll !");
        button.setBounds(50, 50, 400, 100);
        frame.add(button);
    
        //text field
        JTextField inputbox = new JTextField( 10);
        frame.add(inputbox);

        frame.setLayout(new FlowLayout());

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    

    }
    
}
