package estudos.datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateToStringJava8 {
    public static void main(String[] args) {

        LocalDate stringToDate = LocalDate.parse("2023-10-31");
        LocalDateTime stringToDateTime = LocalDateTime.parse("2023-10-31T15:00");
        Instant stringToInstant = Instant.parse("1977-04-20T06:00:00Z");

        // local
        final DateTimeFormatter dataFormatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        final DateTimeFormatter dataHoraFormatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // global GMT - Z
        final DateTimeFormatter instantFormatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println();
        System.out.println("stringToDate:                     " + stringToDate);
        System.out.println("stringToDateTime:                 " + stringToDateTime);
        System.out.println("stringToInstant:                  " + stringToInstant);

        System.out.println();
        System.out.println("data no formato BR - dd/MM/yyyy - " + stringToDate.format(dataFormatterBR));
        // ou
        System.out.println("data no formato BR - dd/MM/yyyy - " + dataFormatterBR.format(stringToDate));

        // -------------------------------

        System.out.println("Data e Hora no formato BR         " + stringToDateTime.format(dataHoraFormatterBR));
        System.out.println("Instant no formato BR             " + instantFormatterBR.format(stringToInstant));


    }
}
