import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class FormatoFechas {
    public static void main(String[] args) {
        //Formatos de fecha
        // a) Para poner LocalDate en formato ES
        LocalDate hoy = LocalDate.of(2022,5,4);
        //Para dar formato necesitamos un DateFormatter
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Formato 1 " + hoy.format(formato1));

        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("d-MMM-yy");
        System.out.println("Formato 2 " + hoy.format(formato2));

        DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        System.out.println("Formato 3 " + hoy.format(formato3));

        //Formatos fecha y hora

        LocalDateTime ahora = LocalDateTime.of(2022,5,4,18,30,00);
        DateTimeFormatter formatoFechaYHora = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Formato fecha y hora " +ahora.format(formatoFechaYHora));
        DateTimeFormatter formatoFechaYHora2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        System.out.println("Formato fecha y hora (sin segundos) " +ahora.format(formatoFechaYHora2));

        //b) Ahora tenemos la fecha como un string y queremos guardarla como un LocalDate
        //Esto es lo que tendremos en las bases de datos
        //De string a java-->para pasar de string a objetos con bases de datos
        String fecha = "2022-07-01";
        DateTimeFormatter deStringAFechaJava = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaenJava = LocalDate.parse(fecha,deStringAFechaJava);
        System.out.println("Fecha en java " + fechaenJava);

    }
}
