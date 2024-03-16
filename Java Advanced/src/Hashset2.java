import java.util.HashSet;

public class Hashset2 {
    public static void main(String[] args) {
        String cercaColore = "Rosso";

        if (listaColori().contains(cercaColore)) {
            System.out.println(cercaColore + " è nel set!");
        } else {
            System.out.println(cercaColore + " non è nel set!");
        }

    }

    public static HashSet<String> listaColori() {
        HashSet<String> colori = new HashSet<>();
        colori.add("Azzurro");
        colori.add("Nero");
        colori.add("Viola");

        //aggiungo un nuovo colore
        colori.add("Rosso");

        return colori;
    }
}
