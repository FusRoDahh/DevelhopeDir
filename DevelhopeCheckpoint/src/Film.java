public class Film {
    private String titolo, regista, genere;
    private int annoDiUscita;

    public Film(String titolo, String regista, String genere, int annoDiUscita) {
        this.titolo = titolo;
        this.regista = regista;
        this.genere = genere;
        this.annoDiUscita = annoDiUscita;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getRegista() {
        return regista;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getAnnoDiUscita() {
        return annoDiUscita;
    }

    public void setAnnoDiUscita(int annoDiUscita) {
        this.annoDiUscita = annoDiUscita;
    }

    @Override
    public String toString() {
        return "Film: " + "\n" +
                "titolo= " + titolo + "\n" +
                "regista= " + regista + "\n" +
                "genere= " + genere + "\n" +
                "annoDiUscita= " + annoDiUscita +
                "\n\n";
    }
}
