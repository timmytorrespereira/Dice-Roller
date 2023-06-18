import java.awt.Color;
import java.util.concurrent.Flow;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.addButtonDetector(new ButtonDetector());
    }
    public static void main(String[] args) {
        
        Model model = new Model();
        View view = new View();
        
        //initializing view
        view.setVisible(true);

        // start game
        Controller game = new Controller(model, view);
    }
    /* 
    private class comboDetector implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.get_jcombo_choice();
        }
    }
    */
    
    private class ButtonDetector implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            model.generateRandomRoll(view.get_jcombo_choice());
            String roll = Integer.toString(model.getRandRoll());
            view.setResultAreaTo(roll);
        }
    }
}
