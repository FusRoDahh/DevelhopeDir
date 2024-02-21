public class operatori_assegnazione {
    public static void main(String[] args) {
        double firstNum = 12.3;
        double secondNum = 24.6;

        System.out.println("Il valore della nostra operazione è: " + operation(firstNum, secondNum));
    }

    public static double operation(double x, double y) {
        x += 2;
        y += 4;
        return x * y;
    }
}
