import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class View extends JFrame {
    //text_field
    private JTextField inputbox = new JTextField( 10);

    //button 
    private JButton button = new JButton("Roll !");

    //LABELS
    private JLabel select_number_text = new JLabel("Select number of sides of your dice: ");
    private JLabel you_rolled_a = new JLabel("You Rolled a: ");

    //JComboBox
    String[] roll_numbers = {"3", "4", "5", "6", "7","8"};
    private JComboBox combo = new JComboBox<>(roll_numbers);

    //ResultArea
    private JTextArea resultArea = new JTextArea();

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
        add(select_number_text);
        add(combo);
        add(button);
        add(you_rolled_a);
        add(resultArea);
    }

    public void addButtonDetector(ActionListener listener) {
        button.addActionListener(listener);
    }

    public void setResultAreaTo(String roll_number) {
        resultArea.setText(roll_number);
    }

    public void jcombo_choice_detector(ActionListener listener) {
        combo.addActionListener(listener);
    }

    public int get_jcombo_choice(){
        int choice = Integer.parseInt(combo.getSelectedItem().toString());
        return choice;
    }
}