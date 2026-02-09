import java.util.Random;

public class instances {
    Random random = new Random();

    public int randomNum() {
        return random.nextInt(10) + 1;
    }

}
