public abstract class Forma {
    private double base;
    private double alt;

    public Forma(double base, double alt){
        this.base = base;
        this.alt = alt;
    }

    public double getBase() {
        return base;
    }

    public double getAlt() {
        return alt;
    }

    public abstract double calcolaArea();

}
