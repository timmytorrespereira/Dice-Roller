import java.util.Random;

public class Model {
    private int random_roll;

    public void generateRandomRoll(int size) {
        Random r = new Random();
        int low = 10;
        int high = 100;
        random_roll = r.nextInt(high-low) + low;
    }

    public int getRandRoll() {
        return random_roll;
    }
}