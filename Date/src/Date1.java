import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Date1 {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String dateFull = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String dateMedium = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String dateShort = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        System.out.println("Date Full: " + dateFull);
        System.out.println("Date Medium: " + dateMedium);
        System.out.println("Date Short: " + dateShort);
    }
}