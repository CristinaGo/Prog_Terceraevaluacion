package ficheros.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //con Scanner podemos ir leyendo numero a numero
        String ruta = "Ficheros\\src\\ficheros\\ejercicios\\dataset_91007.txt";
        File f = new File(ruta);
        try (Scanner lector = new Scanner(f)) { // no hace falta cerrar
            int maximo = 0;
            while(lector.hasNextInt()){
                int n = lector.nextInt();
                if (n > maximo){
                    maximo = n;
                }
            }
            System.out.println("Máximo: " + maximo);

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado.");
        }
    }
}
