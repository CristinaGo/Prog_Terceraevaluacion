package ficheros.ejercicios;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la ruta");
        //C:\Users\Cristina\IdeaProjects\TerceraEvaluacion\Ficheros\src\ficheros\ejercicios
        String ruta = sc.nextLine();
        File f = new File(ruta);
        if (f.exists()){
            System.out.print("Existe");
            if (f.isDirectory()){
                System.out.print(" y es un directorio");
            }else {
                System.out.println(" y es un fichero");
                System.out.println("Nombre: " + f.getName());
                System.out.println("Tamaño: " + f.length());
                System.out.print("Permisos: ");
                if (f.canRead()){
                    System.out.print("lectura");
                }
                if (f.canWrite()){
                    System.out.print(" escritura");
                }
            }
        }else {
            System.out.println("No existe");
        }


    }
}
