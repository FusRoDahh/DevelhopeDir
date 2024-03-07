public class Triangolo implements Forma {

    private final double lung;
    private final double alt;
    public Triangolo(double lung, double alt) {
        this.lung = lung;
        this.alt = alt;
    }


    @Override
    public double calcolaArea(){
        return (lung * alt) / 2;
    }
}
