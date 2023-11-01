package estudos.datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertGlobalToLocal {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.parse("1977-04-20");
        LocalDateTime localDateTime = LocalDateTime.parse("1977-04-20T06:00:00");
        Instant instant = Instant.parse("1977-04-20T06:00:00Z");

        System.out.println("localDate:             " + localDate);
        System.out.println("localDateTime:         " + localDateTime);
        System.out.println("instant:               " + instant);

        // Converter Data-Hora global para local
        LocalDateTime dateLocal = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        LocalDateTime portugal = LocalDateTime.ofInstant(instant, ZoneId.of("Portugal"));

        System.out.println();
        System.out.println("dateLocal:             " + dateLocal);
        System.out.println("Horário de Portugal:   " + portugal);

        // Pegando dia, mes hora....
        System.out.println();
        System.out.println("dia :                  " + dateLocal.getDayOfMonth());
        System.out.println("mês :                  " + dateLocal.getMonth());
        System.out.println("ano :                  " + dateLocal.getYear());
        System.out.println("hora :                  " + dateLocal.getHour());
        System.out.println("minuto :                  " + dateLocal.getMinute());
    }
}
