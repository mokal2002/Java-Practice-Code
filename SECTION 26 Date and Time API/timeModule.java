import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.*;

public class timeModule {
    public static void main(String[] args) {
        // System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365);

        // Date date = new Date();
        // System.out.println(date);

        // GregorianCalendar cal = new GregorianCalendar();
        // TimeZone t = cal.getTimeZone();
        // System.out.println(t.getID());

        // LocalDate d = LocalDate.now(Clock.systemDefaultZone());
        // System.out.println(d);

        // LocalTime t = LocalTime.now();
        // System.out.println(t.getSecond());

        // ZonedDateTime dt = ZonedDateTime.now();
        // System.out.println(dt);

        // OffsetDateTime dt = OffsetDateTime.now();
        // System.out.println(dt);

        // Period p = Period.of(2, 2, 10);
        // System.out.println(p.addTo(LocalDate.now()));

        LocalDateTime dt = LocalDateTime.now();
        // ZonedDateTime dt = ZonedDateTime.now();
        // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss z
        // Z");
        System.out.println(dt.get(ChronoField.DAY_OF_MONTH));
    }
}
