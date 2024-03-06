import java.util.Scanner;

public class CostruttoSwitch2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

                String op = "*";

        System.out.println("L'operatore matematico indicato è: " + findOperator(op));
        //stampiamo il risultato
    }

    public static String findOperator(String x) {
        String result;
        switch (x) {
            case "+" -> result = "Addizione";
            case "-" -> result = "Sottrazione";
            case "/" -> result = "Divisione";
            case "*" -> result = "Moltiplicazione";
            default -> result = "Errore";
        }
        //verifichiamo l'operatore

        return result;
        //ritorniamo la stringa corrispondente all'operatore
    }
}
