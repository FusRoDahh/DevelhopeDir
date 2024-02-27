import java.util.Arrays;
import java.util.Scanner;

/*Scrivere un metodo che verifica se la stringa data in input è palindroma*/
public class Esercizio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Inserisci una stringa, per verificare se è palindroma: ");
        String stringa = scanner.next();

        System.out.println("Inserisci un carattere separatore: ");
        String sep = scanner.next();

        boolean palindroma = isPalindroma(stringa);
        if (palindroma) {
            System.out.println("La tua stringa è palindroma!");
        } else {
            System.out.println("La tua stringa non è palindroma!");
        }

        String[] arrStr = split(stringa, sep);
        System.out.println(Arrays.toString(arrStr));
    }

    public static boolean isPalindroma(String text) {
        boolean palindroma = true;
        text = text.replace(" ", "");
        text = text.toLowerCase();
        text = text.trim();
        for (int i = 0; i < (text.length()/2); i++){
            /*System.out.println("Lunghezza stringa: " + text.length()/2);
            System.out.println("indice: " + i);
            System.out.println("carattere posizione i: " + text.charAt(i));
            System.out.println("indice opposto: " + (text.length()-i-1));
            System.out.println("carattere in posizione opposta: " + text.charAt(text.length()-i-1));*/
            if (text.charAt(i) != text.charAt(text.length()-i-1)){
                palindroma = false;
                break;
            }
        }

       return palindroma;
    }

    public static String[] split(String txt, String separatore) {
        return txt.split(separatore);
    }
}
