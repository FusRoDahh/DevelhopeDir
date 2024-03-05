public class Rettangolo extends Forma{

    private double lung;
    private double alt;
    public Rettangolo(double numLat, double lung, double alt) {
        super(numLat, lung, alt);
        this.lung = lung;
        this.alt = alt;
    }

    @Override
    public double calcolaArea(){
        return lung * alt;
    }
}
