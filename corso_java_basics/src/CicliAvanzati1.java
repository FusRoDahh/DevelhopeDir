import java.util.Scanner;

public class CicliAvanzati1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Digita un numero: ");
        int num1 = num.nextInt();
        //faccio digitare un numero dall'utente

        count(num1);
    }

    //conto da 0 a n, interrompendosi al 5
    public static void count(int n) {
        for (int i = 0; i <= n; i++) {

            if (i == 5) {
                break;
            }

            System.out.println(i);
        }
    }
}
