import java.util.Scanner;
public class CicloWhile1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digita un numero: ");
        int num = input.nextInt();

        System.out.println("La somma dei numeri precedenti del tuo numero è: " + sum(num));
    }

    public static int sum(int x) {
        int numFin = 0;
        int result = 0;
        while (x > numFin) {
            result += numFin;
            numFin ++;
        }
        return result;
    }
}
