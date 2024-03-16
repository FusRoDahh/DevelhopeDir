import java.util.HashSet;
import java.util.Iterator;

public class Hashset3 {
    public static void main(String[] args) {
        HashSet<String> colori = new HashSet<>();
        colori.add("Azzurro");
        colori.add("Viola");
        colori.add("Bianco");
        colori.add("Nero");

        //aggiungo un nuovo colore
        colori.add("Rosso");


    Iterator<String> iterator = colori.iterator();
    while (iterator.hasNext()){
        String element = iterator.next();
        if (colori.contains(element)) {
            iterator.remove();
            System.out.println("Colore tolto!");
        }

        if (colori.isEmpty()) {
            System.out.println("Non ci sono più colori!");
        }
    }
    }
}

