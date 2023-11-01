package estudos.datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculos {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.parse("1977-04-20");
        LocalDateTime localDateTime = LocalDateTime.parse("1977-04-20T06:00:00");
        Instant instant = Instant.parse("1977-04-20T06:00:00Z");

        LocalDate pastWeekLocalDate = localDate.minusDays(7);
        LocalDate nextWeekLocalDate = localDate.plusDays(7);
        LocalDateTime pastWeekLocalDateTime = localDateTime.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = localDateTime.plusDays(7);
        Instant pastWeekLocalInstant = instant.minus(7, ChronoUnit.DAYS);
        Instant nextWeekLocalInstant = instant.plus(7, ChronoUnit.DAYS);

        System.out.println();
        System.out.println("localDate:                 " + localDate);
        System.out.println("pastWeekLocalDate:         " + pastWeekLocalDate);
        System.out.println("plusWeekLocalDate:         " + nextWeekLocalDate);
        System.out.println("pastWeekLocalDateTime:     " + pastWeekLocalDateTime);
        System.out.println("plusWeekLocalDateTime:     " + nextWeekLocalDateTime);
        System.out.println("pastWeekLocalInstant:      " + pastWeekLocalInstant);
        System.out.println("plusWeekLocalInstant:      " + nextWeekLocalInstant);

        //// -----------------------------------

        Duration durationLocalTime = Duration.between(pastWeekLocalDate.atTime(0, 0), localDate.atTime(0, 0));
        // Ou
        Duration durationLocalTimeAtStartOfDay = Duration.between(pastWeekLocalDate.atStartOfDay(), localDate.atStartOfDay());

        Duration durationInstant = Duration.between(pastWeekLocalInstant, instant);


        System.out.println();
        System.out.println("Dias LocalTime             " + durationLocalTime.toDays());
        // OU
        System.out.println("Dias LocalTime StartOfDay  " + durationLocalTimeAtStartOfDay.toDays());

        System.out.println("Dias instant               " + durationInstant.toDays());
    }
}
