package ficheros.ejercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
        //esto hay que escribirlo en:
        String ruta = "Ficheros\\src\\ficheros\\ejercicios\\datos.txt";
        File f = new File(ruta);
        try {
            FileWriter fw = new FileWriter(f,true);
            do {
                texto = sc.nextLine();
                if (!texto.equalsIgnoreCase("FIN")) {
                    fw.write(texto + "\n");
                }
            }while (!texto.equalsIgnoreCase("FIN"));


            fw.close();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error " + e.getMessage());
            //e.printStackTrace();
        }
    }
}
