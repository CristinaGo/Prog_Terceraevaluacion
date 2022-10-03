package ficheros.ejercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Primer apellido: ");
        String apellido1 = sc.nextLine();
        System.out.println("Segundo apellido: ");
        String apellido2 = sc.nextLine();

        String linea = "\n" + nombre + "|" + apellido1 + "|" + apellido2;
        File f = new File("Ficheros\\src\\ficheros\\ejercicios\\nombres.csv");
        try {
            FileWriter fn = new FileWriter(f,true);
            fn.write(linea);
            fn.close();
        } catch (IOException e) {
            //e.printStackTrace();
        }

    }
}
