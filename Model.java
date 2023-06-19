import java.util.Random;
import java.awt.Color;

public class Model {
    private int random_roll;

    public void generateRandomRoll(int size) {
        //Generates random number between 1 and the int size provided
        Random r = new Random();
        int low = 1;
        int high = size;
        random_roll = r.nextInt((high+1)-low) + low;
    }

    public int getRandRoll() {
        return random_roll;
    }

    public Color randomizeBackgroundColor() {
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        Color randomColor = new Color(red, green, blue);
        return randomColor;
    }

    public void pause() {
        try {
            java.util.concurrent.TimeUnit.SECONDS.sleep(2);
          } catch (InterruptedException e1) {
            Thread.currentThread().interrupt();
          }
    }
}