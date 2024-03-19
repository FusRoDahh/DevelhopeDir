import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Corso java = new Corso("Java", 12);
        Studente studente1 = new Studente("Simone", "Riso", "DeRoma");
        Studente studente2 = new Studente("Liborio", "Di Stefano", "RiPaliemmu");
        java.aggiungiStudente(studente1);
        java.aggiungiStudente(studente2);
        java.studentiIscritti();

        Corso fullstack = new Corso("fullstack", 6);

        ArrayList<Corso> corsi = new ArrayList<>();
        corsi.add(java);
        corsi.add(fullstack);

        System.out.println("I cfu dei corsi sono: " + Corso.creditiCorsi(corsi));

        java.studentePresente(studente1);
    }
}