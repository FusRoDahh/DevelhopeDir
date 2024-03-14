import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {
        try{
            divideZero();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void divideZero(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.println("Dimmi un numero che sarà diviso per zero:");
            int num = scanner.nextInt();
            int result = num / 0;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Bro, e che ti aspettavi la soluzione? " +
                    "Dividendo per zero sempre male può andare...");
        }
    }
}
