package ficheros.ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Ejercicio7 {
    public static void main(String[] args) {
        String ruta = "Ficheros\\src\\ficheros\\ejercicios\\cadenas.txt";
        String[] resultado = devolverCadenas(ruta);
        Arrays.stream(resultado).forEach(cadena -> System.out.println(cadena));
    }

    public static String[] devolverCadenas(String ruta){
        //tenemos que leer el fichero
        // coger todo en un string y luego trocearlo
        String[] cadenas = null;
        try {
            String contenido = new String(Files.readAllBytes(Paths.get(ruta)));
            cadenas = contenido.split("\\*"); //tenemos que escapar caracteres


        } catch (IOException e) {
            e.printStackTrace();
        }
        return cadenas;
    }
}
