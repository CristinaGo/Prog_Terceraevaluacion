package ejercicios.ejercicio6;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Registro implements Serializable{
    int temperatura;
    LocalDateTime fechaYHora;

    public Registro(int temperatura) {
        this.temperatura = temperatura;
        this.fechaYHora = LocalDateTime.now();
    }

    @Override
    public String toString() {
        // ***** New ****** ¡Formateamos la fecha y la hora!
        //1) Crear formato con la clase DateTimeFormatter
        DateTimeFormatter formato = DateTimeFormatter
                .ofPattern("dd-MM-yyyy HH:mm");


        return "Registro{" +
                "temperatura=" + temperatura +
                ", fechaYHora=" + fechaYHora.format(formato) +
                '}';
    }
}
