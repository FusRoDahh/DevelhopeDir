import java.time.OffsetDateTime;
public class Date3 {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println("Anno: " + date.getYear());
        System.out.println("Mese: " + date.getMonth());
        System.out.println("Giorno: " + date.getDayOfMonth());
        System.out.println("Giorno della settimana: " + date.getDayOfWeek());


    }
}
