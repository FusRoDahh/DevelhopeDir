public class Studente {
    private int numMatricola;
    private String nome, cognome, residenza;

    public Studente(String nome, String cognome, String residenza) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public Studente(int numMatricola, String nome, String cognome, String residenza) {
        this.numMatricola = numMatricola;
        this.nome = nome;
        this.cognome = cognome;
        this.residenza = residenza;
    }

    public int getNumMatricola() {
        return numMatricola;
    }

    public void setNumMatricola(int numMatricola) {
        this.numMatricola = numMatricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getResidenza() {
        return residenza;
    }

    public void setResidenza(String residenza) {
        this.residenza = residenza;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "numMatricola=" + numMatricola +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", residenza='" + residenza + '\'' +
                '}';
    }
}

