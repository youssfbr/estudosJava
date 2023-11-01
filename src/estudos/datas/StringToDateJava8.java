package estudos.datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringToDateJava8 {
    public static void main(String[] args) {

        LocalDate dataAgora = LocalDate.now(); // yyyy-MM-dd
        LocalDateTime localDateTime = LocalDateTime.now(); // yyyy-MM-ddT10:56:48.706889600
        Instant instant = Instant.now(); // 2023-10-31T13:58:37.049341900Z Hora global GMT - Gera com fuso horario de Londres

        // Converter de texto ISO 8601 -> Data-hora
        LocalDate convertendoISO8601_Para_data = LocalDate.parse("2023-10-31");
        LocalDateTime convertendoISO8601_Para_dataHora = LocalDateTime.parse("2023-10-31T11:00");

        // Converter de texto ISO 8601 -> Data-hora
        Instant convertendoISO8601_Para_instant = Instant.parse("2023-10-31T11:00:26Z");
        Instant convertendoISO8601_Para_instant_3 = Instant.parse("2023-10-31T11:00:26-03:00");

        // Data Cusmotizada
        LocalDate dataCustomizada = LocalDate.parse("20/04/1977", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        // ou
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataCustomizada1 = LocalDate.parse("20/04/1977", dateTimeFormatter);

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String text = date.format(formatter);
        LocalDate parsedDate = LocalDate.parse(text, formatter);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime parsedDate1 = LocalDateTime.parse("20/04/1977 06:00", dateTimeFormatter1);

        // Data isolada
        LocalDate dataIsolada1 = LocalDate.of(1977, 4, 20);
        LocalDateTime dataIsolada2 = LocalDateTime.of(1977, 4, 20, 8, 30);

        System.out.println();
        System.out.println("Data de agora local:                     " + dataAgora);
        System.out.println("Data-hora de agora local:                " + localDateTime);
        System.out.println("Data-hora de agora global GMT de Londres:    " + instant);

        System.out.println();
        System.out.println("Convertendo ISO8601 para Data:           " + convertendoISO8601_Para_data);
        System.out.println("Convertendo ISO8601 para Data-hora:      " + convertendoISO8601_Para_dataHora);
        System.out.println("Convertendo ISO8601 para Instant:        " + convertendoISO8601_Para_instant);
        System.out.println("Convertendo ISO8601 para Instant -3:00:     " + convertendoISO8601_Para_instant_3);

        System.out.println();
        System.out.println("Data Custamizada 1:                      " + dataCustomizada);
        System.out.println("Data Custamizada 2:                      " + dataCustomizada1);

        System.out.println();
        System.out.println("text:                                    " + text);
        System.out.println("formater:                                " + formatter);
        System.out.println("Data Custamizada 3:                      " + parsedDate);
        System.out.println("Data Custamizada 4:                      " + parsedDate1);

        System.out.println();
        System.out.println("Data isolada 1:                          " + dataIsolada1);
        System.out.println("Data isolada 2:                          " + dataIsolada2);


    }




}
