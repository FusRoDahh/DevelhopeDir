import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) {
        try{
            isNumber();
        } catch (InputMismatchException e) {
            System.out.println("Bro, ma non hai scritto un numero. Ma sei scemo? Fatti controllare");
        }
    }

    public static void isNumber() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.println("Dimmi un numero:");
            int num = scanner.nextInt();
            System.out.println("Hai per caso detto " + num + "? Che numero di merda");
        } catch (InputMismatchException e) {
            throw new InputMismatchException();
        }
    }
}
