/*
Ognuno ha una mano di: D4-D6-D8-D10-D12
Ognuno tira un dado a sua scelta in segreto
(fino a quando non atterrano nessuno sa che dado stai tirando)
e per vedere chi vince il round si conta chi ha ottenuto il risultato maggiore,
ma i risultati pari si scartano. Chi perde o vede il suo dado rubato da chi vince
o in caso di pareggio i dadi vengono messi fuori dal gioco
La Peculiarità è che si può solo salire di taglia (se ho usato un d6 al turno dopo userò il d8)
se arriviamo alla fine, per ricominciare scartiamo un dado che sarà fuori dalla partita
*/

import java.util.Arrays;
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

        System.out.println(Arrays.toString(players[1].getDices()));

        System.out.println("""
                \n
                Arriviamo quindi ora alle regole del nostro gioco:
                Ognuno di voi ha 5 dadi. Un d4, un d6, un d8, un d10 e d12.
                All'inizio di ogni turno ognuno di voi sceglie un dado, senza dire quale, e lo lancia.
                Se alcuni dadi danno lo stesso risultato vengono scartati a prescindere.
                Chi ha fatto il tiro più alto ruba un altro dei dadi lanciati, a sua scelta.
                
                Dopodiché si rilancia, tirando il dado di una taglia più grande.
                Dopo aver tirato il D12 si ricomincia dal primo, ma prima di tirare bisogna scartare il dado più piccolo.
                Perde chi resta senza dadi, vince chi alla fine è l'unico con almeno un dado.
                
                """);
        //presentazione regole del gioco


    }
}