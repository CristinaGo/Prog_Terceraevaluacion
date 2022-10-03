package ejercicios.ejercicio4;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Ejercicio 4
 * @author Cristina Gómez Campos
 */
public class Main {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[5];
        clientes[0]= new Cliente("11111111A","Asdrúbal", LocalDate.of(2004,12,15));
        clientes[1]= new Cliente("22222222B","Benito", LocalDate.of(2001,5,6));
        clientes[2]= new Cliente("33333333C","Carlota", LocalDate.of(1988,7,9));
        clientes[3]= new Cliente("44444444D","Demetria", LocalDate.of(2002,10,10));
        clientes[4]= new Cliente("55555555E","Esperanza", LocalDate.of(1972,2,2));

        //Ordenar por fecha
        Arrays.stream(clientes)
                .sorted((f1,f2) -> f1.getFechaNac().getYear() - f2.getFechaNac().getYear())
                .forEach(cliente -> System.out.println(cliente + " "));
    }


}
