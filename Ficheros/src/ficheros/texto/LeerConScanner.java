package ficheros.texto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerConScanner {
    public static void main(String[] args) {
        String ruta = "Ficheros\\src\\ficheros\\texto\\";

        File f = new File(ruta + "fichero1.txt");
        try {
            System.out.println("Línea a línea");
            Scanner lector = new Scanner(f);
            while(lector.hasNextLine()){
                System.out.println(lector.nextLine());
            }
            System.out.println("Número a número");
            lector = new Scanner(f);
            while(lector.hasNextInt()){
                System.out.println(lector.nextInt());
            }
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("No se encuentra el fichero" +  e.getMessage());
        }
    }
}
