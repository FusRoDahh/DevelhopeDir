import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Digita un numero compreso tra 5 e 15:");
        int num = scanner.nextInt();
        boolean numInRange = true;
        if (num > 5 && num < 15) {
            System.out.println(numInRange);
        } else {
            throw new ArithmeticException("Il numero non era nel range richiesto!;");
        }
    }
}