public class Funzioni_2 {
    public static void main(String[] args) {
        String text = "Hello World!";

        System.out.println("La lunghezza della stringa è di: "
                + stringLength(text));
    }

    //questa funzione restituisce la lunghezza di una stringa
    public static int stringLength(String x) {
        return x.length();
    }
}
