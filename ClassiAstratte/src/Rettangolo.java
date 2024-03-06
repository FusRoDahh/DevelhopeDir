public class Rettangolo extends Forma{
    public Rettangolo(double base, double alt) {
        super(base, alt);
    }

    @Override
    public double calcolaArea(){
        return getBase() * getAlt();
    }
}
