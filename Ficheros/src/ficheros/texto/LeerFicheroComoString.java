package ficheros.texto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LeerFicheroComoString {
    public static void main(String[] args) {
        String ruta = "Ficheros\\src\\excepciones\\";
        String nombre = "OtroEjemploExcepciones.java";

        try {
            String contenido = new String(Files.readAllBytes(Paths.get(ruta + nombre)));
            System.out.println(contenido);
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());

        }
    }
}
