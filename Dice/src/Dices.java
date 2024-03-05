import java.util.Random;

public class Dices {
    private Random random;

    private String diceName;

    private int faceNum;

    public Dices(int faceNum, String diceName) {
        this.random = new Random();
        this.faceNum = faceNum;
        this.diceName = diceName;
    }

    public int lancia() {
        return random.nextInt(faceNum)+1;
    }

    @Override
    public String toString() {
        return "Dado: " + diceName + "\n";
    }
}
