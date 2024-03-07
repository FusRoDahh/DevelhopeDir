public class Rettangolo implements Forma {

    private final double lung;
    private final double alt;
    public Rettangolo(double lung, double alt) {
        this.lung = lung;
        this.alt = alt;
    }

    @Override
    public double calcolaArea(){
        return lung * alt;
    }
}
