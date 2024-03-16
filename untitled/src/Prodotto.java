public class Prodotto {
    private int annoDiProduzione;
    private int id;
    private static int numeroProdotti;

    public Prodotto(int annoDiProduzione, int id) {
        this.annoDiProduzione = annoDiProduzione;
        numeroProdotti++;
        this.id = numeroProdotti;
    }
}
