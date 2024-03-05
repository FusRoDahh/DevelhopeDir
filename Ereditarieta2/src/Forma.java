public class Forma {
    private double numLat;
    private double lung;
    private double alt;

    public Forma(double numLat, double lung, double alt){
        this.numLat = numLat;
        this.lung = lung;
        this.alt = alt;
    }

    public double calcolaArea() {
        return (numLat * lung * alt) / 2;
    }

}
