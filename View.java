import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.net.URL;


public class View extends JFrame {
    //Roll Button
    private JButton button = new JButton("Roll !");

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

        //button
        button.setPreferredSize(new Dimension(100, 50));
        //add components to frame
        JPanel northpanel = new JPanel(new FlowLayout());
        northpanel.add(label1);
        northpanel.add(combo);

        //button.setPreferredSize(new Dimension(100, 50));
        JPanel centerpanel = new JPanel(new FlowLayout());
        centerpanel.add(button);
        centerpanel.add(gif);
        

        JPanel southpanel = new JPanel(new FlowLayout());
        southpanel.add(label2);
        southpanel.add(resultArea);
        add(centerpanel, BorderLayout.CENTER);
        add(northpanel, BorderLayout.NORTH);
        add(southpanel, BorderLayout.SOUTH);
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