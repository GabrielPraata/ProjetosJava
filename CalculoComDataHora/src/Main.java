import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2025-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2025-07-20T01:30:26");
        Instant d06 = Instant.parse("2025-07-20T01:30:26z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        Duration t1 = Duration.between(pastWeekLocalDate, d04);
        Duration t2 = Duration.between(pastWeekLocalDate, d05);

        System.out.println("t1 dias = " + t2.toDays());
        System.out.println("t2 dias = " + t2.toDays());


    }
}