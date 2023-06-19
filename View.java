import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.net.URL;


public class View extends JFrame {
    //Roll Button
    JButton button = new JButton("Roll !");

    //Labels
    private JLabel label1 = new JLabel("Select number of sides of your dice: ");
    private JLabel label2 = new JLabel("You Rolled a: ");

    //JComboBox for user to pick dice side #
    String[] roll_numbers = {"3", "4", "5", "6", "7","8"};
    private JComboBox combo = new JComboBox<>(roll_numbers);

    //ResultArea for when we get roll
    private JTextArea resultArea = new JTextArea("...");

    //Rolling dice
    JLabel gif = new JLabel();


    public View() {
        //frame stuff
        setTitle("Dice Roller");
        setSize(1000, 600);
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.BLUE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Preferences
        button.setPreferredSize(new Dimension(100, 50));
        label2.setPreferredSize(new Dimension(200, 100));
        label2.setFont(new Font("Serif", Font.PLAIN, 30));
        resultArea.setFont(new Font("Serif", Font.BOLD, 60));
        resultArea.setBackground(Color.red);
        //gif.setPreferredSize(new Dimension(50, 50));
        //label3.setText("<html>"+"hey guys"+"<html>");

        //North Panel with the "Choose sides of dice" plus the drop down choice
        JPanel northpanel = new JPanel(new FlowLayout());
        northpanel.add(label1);
        northpanel.add(combo);
        northpanel.setBackground(Color.orange);

        //Center panel with rolling dice and button to Roll
        JPanel centerpanel = new JPanel(new FlowLayout());
        centerpanel.add(button);
        centerpanel.add(gif);
        centerpanel.setBackground(Color.orange);
        
        //East panel with message
        JPanel eastpanel = new JPanel(new FlowLayout());

        JPanel southpanel = new JPanel(new FlowLayout());
        southpanel.add(label2);
        southpanel.add(resultArea);
        southpanel.setBackground(Color.red);

        //Add panels to frame
        add(centerpanel, BorderLayout.CENTER);
        add(northpanel, BorderLayout.NORTH);
        add(southpanel, BorderLayout.SOUTH);
        add(eastpanel, BorderLayout.EAST);
        getContentPane().setBackground(Color.BLUE);
    }

    public void addButtonDetector(ActionListener listener) {
        button.addActionListener(listener);
    }

    public void setResultAreaTo(String roll_number) {
        resultArea.setText(roll_number);
    }

    public int dropdown_choice(){
        int choice = Integer.parseInt(combo.getSelectedItem().toString());
        return choice;
    }

    public void setDiceRolling(){
        URL imageUrl = this.getClass().getResource("dice_gif.gif");
        ImageIcon imageIcon = new ImageIcon(imageUrl);
        gif.setIcon(imageIcon);
    }

    public void stopDiceRolling() {
        gif.setIcon(null);
    }
}