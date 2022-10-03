package ficheros.texto;

import java.io.File;
import java.util.Scanner;

public class EjemploCrearDirectorio {
    public static void main(String[] args) {
        String ruta = "Ficheros\\src\\ficheros\\texto\\";
        // preguntamos el nombre que queremos darle
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del directorio:");
        String nombre = sc.nextLine();

        File nuevoDirectorio = new File(ruta + nombre);
        boolean creado = nuevoDirectorio.mkdir();

        if (creado){
            System.out.println("El directorio ha sido creado");
        } else {
            System.out.println("El directorio ya existe o no existe la ruta especificada");
            if (nuevoDirectorio.exists()){
                System.out.println("La carpeta ya existe");
            }else{
                File comprobarRuta = new File(ruta);
                if (!comprobarRuta.exists()){
                    System.out.println("La ruta no existe");
                }else {
                    System.out.println("Causa desconocida");
                }
            }
        }
    }
}
