import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class ModelTest {
    private Model model;

    @BeforeEach
    public void setup(){
        model = new Model();
    }

    @Test
    public void randomRollShouldBeBetween1andSize(){
        model.generateRandomRoll(3);
        int randroll = model.getRandRoll();
        Assertions.assertTrue(randroll>=1 && randroll<=3, "Random number should be between 1 and 3");
    }

}