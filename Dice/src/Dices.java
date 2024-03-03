import java.util.Random;

public class Dices {
    private Random random;

    private int faceNum;

    public Dices(int faceNum) {
        this.random = new Random();
        this.faceNum = faceNum;
    }

    public int lancia() {
        return random.nextInt(faceNum)+1;
    }
}
