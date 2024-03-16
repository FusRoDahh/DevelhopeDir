import java.util.Arrays;
import java.util.HashSet;

public class Hashset1 {
    public static void main(String[] args) {
        System.out.println("Lista colori di " + listaColori().size() + " elementi: "  + listaColori());
    }

    public static HashSet<String> listaColori() {
        return new HashSet<String>(Arrays.asList("azzurro", "rosso", "nero", "viola"));
    }
}
