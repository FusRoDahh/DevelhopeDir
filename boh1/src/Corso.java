import java.util.ArrayList;

public class Corso {
    private String nomeCorso;
    private int cfu;
    private int numeroStudentiIscritti;
    private ArrayList<Studente> studenti = new ArrayList<>();

    public Corso(String nomeCorso, int cfu) {
        this.nomeCorso = nomeCorso;
        this.cfu = cfu;
    }

    public String getNomeCorso() {
        return nomeCorso;
    }

    public void setNomeCorso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
    }

    public int getCfu() {
        return cfu;
    }

    public void setCfu(int cfu) {
        this.cfu = cfu;
    }

    public int getNumeroStudentiIscritti() {
        return numeroStudentiIscritti;
    }

    public void setStudentiIscritti(int numeroStudentiIscritti) {
        this.numeroStudentiIscritti = numeroStudentiIscritti;
    }

    public ArrayList<Studente> getStudenti() {
        return studenti;
    }

    public void setStudenti(ArrayList<Studente> studenti) {
        this.studenti = studenti;
    }

    public void studentiIscritti() {
        System.out.println("Gli studenti nel corso sono: " + getStudenti() + "\n");
    }

    public void aggiungiStudente(Studente studente) {
        studenti.add(studente);
    }

    public static int creditiCorsi(ArrayList<Corso> listaCorsi){
        int creditiTotali = 0;
        for (Corso corso : listaCorsi) {
            creditiTotali += corso.getCfu();
        }
        return creditiTotali;
    }

    public void studentePresente(Studente studente){
        for (int i = 0; i < getStudenti().size(); i++) {
            if(getStudenti().get(i) == studente) {
                System.out.println("Lo studente è presente!");
            } else {
                System.out.println("Lo studente non è presente!");
            }
        }
    }
}
