public class Dices {
    private final String diceName;

    private final int faceNum;

    public Dices(int faceNum, String diceName) {
        this.faceNum = faceNum;
        this.diceName = diceName;
    }

    public int getFaceNum() {
        return faceNum;
    }

    @Override
    public String toString() {
        return "Dado: " + diceName + "\n";
    }
}
