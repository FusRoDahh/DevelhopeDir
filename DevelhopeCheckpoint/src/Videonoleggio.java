import java.util.Objects;

public class Videonoleggio {

    private String nome;
    private Film[] films = new Film[500];

    public Videonoleggio(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void aggiungiFilm(Film film) {
        for(int i = 0; i < 500; i++) {
            if (films[i] == null) {
                films[i] = film;
                break;
            }
        }
    }

    public void listaFilm() {
        for (int i = 0; i < 500; i++) {
            if (films[i] != null) {
                System.out.println(films[i]);
            }
        }
    }

    public void ricercaGenere(String genere) {
        for (int i = 0; i < 500; i++) {
            if (films[i] != null && films[i].getGenere().equalsIgnoreCase(genere)) {
                System.out.println(films[i]);
            } else if (films[i] != null && films[i].getGenere() == null && films[i].getGenere() != genere) {
                System.out.println("Non abbiamo nessun film del genere selezionato!");
                break;
            }
        }
    }
}
