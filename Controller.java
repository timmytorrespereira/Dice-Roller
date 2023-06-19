
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

        //start game
        Controller game = new Controller(model, view);
    }
    
    class ButtonDetector implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
                //Generate random role for a dice of length chosen by user
                model.generateRandomRoll(view.dropdown_choice());

                //Get random roll from model
                String roll = Integer.toString(model.getRandRoll());

                //Set rolling dice gif going
                view.setDiceRolling();
                System.out.println("Flag");

                //Pause for 2 seconds (doesn't work so it's commented out)
                /* 
                try {
                    java.util.concurrent.TimeUnit.SECONDS.sleep(2);
                  } catch (InterruptedException e1) {
                    Thread.currentThread().interrupt();
                  }
                */

                //Three potential ways to stop dice rolling ; None work
                //view.gif.setVisible(false);
                //view.stopDiceRolling();
                //view.gif.setIcon(null);

                //show the int result of the roll
                view.setResultAreaTo(roll);
        }
    }
}
