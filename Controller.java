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
        
        Model model = new Model();
        View view = new View();
        
        //initializing view
        view.setVisible(true);

        // start game
        Controller game = new Controller(model, view);
    }
    
}
