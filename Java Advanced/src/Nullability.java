public class Nullability {
    public static void main(String[] args) {
        Double num1 = 3.2;
        Double num2 = null;
        try {
            fraction(num1, num2);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Double fraction(Double num1, Double num2) {
        try {
            return num1 / num2;
        } catch (NullPointerException e) {
            throw new NullPointerException("Uno o più dei valori sono mancanti");
        }
    }
}
