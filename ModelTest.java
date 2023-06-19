import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;

public class ModelTest {
    public static void main(String[] args){
        randomRollShouldBeBetween1andSize();
    }
    
    public static void randomRollShouldBeBetween1andSize(){
        Model model = new Model();
        model.generateRandomRoll(3);
        int randroll = model.getRandRoll();
        Assertions.assertTrue(randroll>=1 && randroll<=3, "Random number should be between 1 and 3");
    }
}