import java.util.Scanner;

public class CicloFor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digita un numero: ");
        int num = input.nextInt();
        System.out.println("Scegli un numero di iterazioni: ");
        int ind = input.nextInt();

        revCount(num, ind);
        System.out.println("\nDone!");
    }

    public static void revCount(int x, int y) {

        System.out.println("\nConto alla rovescia:\n");

        for (int i = 0; i < y ; i++) {
            System.out.println(x);
            x--;
        }
    }
}
