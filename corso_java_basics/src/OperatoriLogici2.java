public class OperatoriLogici2 {
    public static void main(String[] args) {
        int num = 7;

        if(isOdd(num) == 0) {
            System.out.println("Il numero " + num + " è pari");
        } else {
            System.out.println("Il numero " + num + " è dispari");
        }
        //stampiamo se il numero è pari o dispari;
    }

    public static int isOdd(int a) {
        return a & 1;
    }
    /*
    valutiamo se il numero è pari attravero la logica bitwise; se il
    numero è pari il risultato dell'operatore logico sarà 0 altrimenti
    risulterà 1 in quanto "1 & 1" è l'unica opzione che risulta 1.
    */
}
