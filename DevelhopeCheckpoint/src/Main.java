/*
* ### Esercizio 4:
**Traccia:**
Realizza un programma per gestire un inventario di film in un videonoleggio. Ogni film deve avere un titolo, un regista,
* un anno di uscita e un genere. Implementa un sistema per aggiungere nuovi film, visualizzare l'inventario completo dei film e cercare
* film per genere. Utilizza un array per memorizzare le informazioni sui film.
**Suggerimenti:**
1. Definisci una classe `Film` che rappresenti un film con attributi come titolo, regista, anno di uscita e genere.
2. Implementa una classe `Videonoleggio` che gestisca l'inventario dei film utilizzando un array per memorizzare le informazioni
* (Il videonoleggio può contenere al massimo 500 film).
3. Al videonoleggio è possibile aggiungere dei Film
4. Il videonoleggio deve essere in grado di mostrare l'inventario completo dei film.
### Bonus
5. Aggiungi la funzionalità di ricerca per genere di film nell'inventario.
* */

public class Main {
    public static void main(String[] args) {


        Videonoleggio videonoleggio = new Videonoleggio("Videonoleggio");

        Film film1 = new Film("Karate Kid", "NonloSo" , "Azione", 1984);
        Film film2 = new Film("Rambo", "NonloSo2", "Azione", 1982);
        Film film3 = new Film("La vita è bella", "Benigni", "Drammatico", 1997);

        videonoleggio.aggiungiFilm(film1);
        videonoleggio.aggiungiFilm(film2);
        videonoleggio.aggiungiFilm(film3);

        videonoleggio.listaFilm();

        videonoleggio.ricercaGenere("Azione");

    }
}