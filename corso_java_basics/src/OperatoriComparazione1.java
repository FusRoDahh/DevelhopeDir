public class OperatoriComparazione1 {
    public static void main(String[] args) {
        int firstNum = 47;
        int secondNum = 23;

        System.out.println("Dati i numeri " + firstNum + " e " + secondNum);
        System.out.println("I due numeri sono diversi? " + equal(firstNum, secondNum));
    }

    public static boolean equal(int a, int b) {
        return a != b;
    }
}
