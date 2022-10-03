package ficheros.texto;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class EjemploCrearFichero {
    public static void main(String[] args) {
        //quiero crear el fichero en esta ruta
        String ruta = "Ficheros\\src\\ficheros\\texto\\";
        // preguntamos el nombre que queremos darle
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del fichero:");
        String nombre = sc.nextLine();

        //creamos el objeto file
        File nuevoFichero = new File(ruta + nombre);
        try {
            //creamos el fichero
            boolean creado = nuevoFichero.createNewFile();
            if (creado){
                System.out.println("El fichero ha sido creado");
            } else {
                System.out.println("No se ha podido crear el fichero");
            }
        } catch (IOException e) {
            System.out.println("Ha sucedido un error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
