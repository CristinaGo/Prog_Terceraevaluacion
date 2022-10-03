package ficheros.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
    String ruta = "Ficheros\\src\\ficheros\\ejercicios\\Restaurantes.csv";
    File f = new File(ruta);
        try {
            Scanner lector = new Scanner(f);
            String linea;
            String[] campos = null;
            while (lector.hasNextLine()){
                linea = lector.nextLine();
                campos = linea.split(",");
                if (campos[4].startsWith("6")){
                    System.out.println(linea);
                }
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }
    }
}
