import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Date4 {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        OffsetDateTime secondDate = date.plusYears(1).minusMonths(1).plusDays(7);

        System.out.println(secondDate.format(DateTimeFormatter.ofPattern("dd/MMM/yy", Locale.ITALY)));
    }
}
