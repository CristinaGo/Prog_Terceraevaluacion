package ficheros.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicios9 {
    public static void main(String[] args) {
        //tenemos que leer linea a linea
        String ruta = "Ficheros\\src\\ficheros\\ejercicios\\Restaurantes.csv";
        File f = new File(ruta);
        try (Scanner lector = new Scanner(f)) {
            int tamañoMayor = 0, tamañoMenor = 1000;
            String lineaMasLarga = null, lineaMasCorta = null;

            while (lector.hasNextLine()){
                String linea = lector.nextLine();
                if (linea.length() > tamañoMayor){
                    tamañoMayor = linea.length();
                    lineaMasLarga = linea;
                }else if (linea.length() < tamañoMenor){
                    tamañoMenor = linea.length();
                    lineaMasCorta = linea;
                }
            }
            System.out.println("Línea más larga: " + lineaMasLarga + " (" + tamañoMayor + " caracteres)");
            System.out.println("Línea más corta: " + lineaMasCorta + " (" + tamañoMenor + " caracteres)");


        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }

    }
}
