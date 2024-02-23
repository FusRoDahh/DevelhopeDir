import java.util.Scanner;

public class CicloFor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digita un numero: ");
        int num = input.nextInt();

        multiTable(num);
        System.out.println("\nDone!");
    }

    public static void multiTable(int x) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + "x" + i + " = " + x * i);
        }
    }
}
