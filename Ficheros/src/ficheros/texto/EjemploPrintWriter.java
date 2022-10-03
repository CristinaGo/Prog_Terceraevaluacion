package ficheros.texto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EjemploPrintWriter {
    public static void main(String[] args) {
        String ruta = "Ficheros\\src\\ficheros\\texto\\";
        String nombre = "Escribiendo2.txt";
        File f = new File(ruta + nombre);

        try (PrintWriter pw = new PrintWriter(f)) {
            pw.println(Math.PI);
            pw.printf("%.2f",Math.PI);

        } catch (FileNotFoundException e) {
            System.out.println("Problema: " +e.getMessage());
        }
    }
}
