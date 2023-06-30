package Data_Hora;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        ex2();

    }

    public static void ex2(){
        LocalTime hora = LocalTime.now();
        System.out.println();
        LocalDate data = LocalDate.now();
        System.out.println(data.getDayOfMonth());
        System.out.println(hora.format(DateTimeFormatter.ofPattern("HH:mm")));

        System.out.println(new Date());
    }

    public static void ex1(){
        LocalDate data1 = LocalDate.now();
        LocalTime time1 = LocalTime.now();
        LocalDateTime data2 = LocalDateTime.now();

        Instant data3 = Instant.now();

        System.out.println(data1);
        System.out.println(time1);
        System.out.println(data2);
        System.out.println(data3);

        LocalDate data5 = LocalDate.parse("15/11/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println(data5);
        System.out.println(data5.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println(Instant.now());

        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()).format(Instant.now()));

        System.out.println(LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault()));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(LocalDateTime.ofInstant(Instant.now(), ZoneId.of("Japan"))));

        LocalDate data9 = LocalDate.parse("15/11/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println(data9.getDayOfMonth());

        System.out.println("Hoje é: " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(LocalDate.now()));
        System.out.println("Agora são: " + DateTimeFormatter.ofPattern("HH:mm").format(LocalDateTime.now()));
    }
}
