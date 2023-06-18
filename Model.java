import java.util.Random;

public class Model {
    private int random_roll;

    public void generateRandomRoll(int size) {
        Random r = new Random();
        int low = 1;
        int high = size;
        random_roll = r.nextInt((high+1)-low) + low;
    }

    public int getRandRoll() {
        return random_roll;
    }
}