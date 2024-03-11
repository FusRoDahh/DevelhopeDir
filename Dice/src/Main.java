import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        Scanner txtScan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("""
                Benvenuti, viaggiatori. Accomodatevi pure!
                Avete mai sentito parlare dei Dadi di Giorlando Furioso?
                Si tratta di un gioco di dadi molto popolare da queste parti.
                Tranquilli, tranquilli, ve lo spiego pian piano mentre giochiamo.
                
                Ditemi, viaggiatori. Quanti di voi vogliono giocare?""");
        int playNum = numScan.nextInt();
        //selezione numero dei giocatori

        Players[] players = new Players[playNum];
        for(int i = 0; i < playNum; i++) {
            System.out.println("Inserisci il nickname del giocatore numero " + (i+1) + " e premi invio:");
            String nickname = txtScan.next();
            players[i] = new Players(nickname);
        }
        //creazione array dei giocatori con i loro nickname

        System.out.println("Abbiamo quindi i nostri giocatori.");
        for(int i = 0; i < playNum; i++) {
            System.out.println("Giocatore numero " + (i+1) + ": " + players[i].getNickname());
        }
        //dichiarazione giocatori

        System.out.println("""
                \n
                Arriviamo quindi ora alle regole del nostro gioco:
                Ognuno di voi ha 5 dadi. Un d4, un d6, un d8, un d10 e d12.
                All'inizio di ogni turno ognuno di voi sceglie un dado e lo lancia.
                Se alcuni dadi danno lo stesso risultato vengono scartati a prescindere.
                Chi ha fatto il tiro più alto ruba un altro dei dadi lanciati, a sua scelta.
                
                Dopodiché si rilancia, tirando il dado di una taglia più grande.
                Dopo aver tirato il D12 si ricomincia dal primo, ma prima di tirare bisogna scartare il dado più piccolo.
                Perde chi resta senza dadi, vince chi alla fine è l'unico con almeno un dado.
                
                """);
        //presentazione regole del gioco

        System.out.println("\nIniziamo. Ognuno di voi scelga un dado da cui partire!");
        System.out.println("\nDigita 1 per lanciare il d4, 2 per il d6, 3 per il d8, 4 per il d10, 5 per il d12.");
        for (int i = 0; i < playNum; i++) {
            System.out.println(players[i].getNickname() + " con quale dado vuoi iniziare?");
            int start = numScan.nextInt();
            players[i].setStartDice(start-1);
        }
        //scelta del dado iniziale

        System.out.println("\n\nVia con la prima mano. Lanciamo:");
        int[] results = new int[playNum];
        for (int i = 0; i < playNum; i++) {
            System.out.println(players[i].getNickname() + " - Punteggio: " + players[i].lanciaDado(players[i].getStartDice()));
            results[i] = players[i].lanciaDado(players[i].getStartDice());
        }
        //primo lancio

        for(int i = 0; i < playNum; i++) {
            for(int j = 0; j < playNum; j++){
                if(results[i] == results[j]){
                    System.out.println(players[i] + " perde il dado");

                }
            }
        }

    }
}