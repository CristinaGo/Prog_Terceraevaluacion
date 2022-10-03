package ficheros.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        String ruta = "Ficheros\\src\\ficheros\\ejercicios\\Restaurantes.csv";
        File f = new File(ruta);
        int numlinea = 0;
        String linea = "";
        boolean encontrado = false;
        try(Scanner lector = new Scanner(f)) {
            while (lector.hasNextLine()){
                linea = lector.nextLine();
                numlinea++;
                if (linea.toLowerCase().contains(texto.toLowerCase())){
                    System.out.println("Línea " + numlinea + ": " + linea);
                    encontrado = true;
                }
            }
            if (!encontrado){
                System.out.println("El fichero no contiene el texto buscado.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado " + e.getMessage());
            //e.printStackTrace();
        }
    }
}
