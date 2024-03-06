public class Triangolo extends Forma {

    public Triangolo(double base, double alt) {
        super(base, alt);
    }

    @Override
    public double calcolaArea(){
        return (getBase() * getAlt()) / 2;
    }
}
