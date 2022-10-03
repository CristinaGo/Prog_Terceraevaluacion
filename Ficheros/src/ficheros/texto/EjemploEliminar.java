package ficheros.texto;

import java.io.File;
import java.util.Scanner;

public class EjemploEliminar {
    public static void main(String[] args) {
        String ruta = "Ficheros\\src\\ficheros\\texto\\";

        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del fichero o la carpeta a eliminar");
        String eliminar = sc.nextLine();

        File f = new File(ruta + eliminar);
        boolean eliminado = f.delete();
        if (eliminado){
            System.out.println("Se ha eliminado");
        } else {
            System.out.println("No se ha podido eliminar o no existe");
        }

        File carpetaNoVacia = new File(ruta + "DAW");
        deleteDirRecursively(carpetaNoVacia);
    }
    public static void deleteDirRecursively(File dir) {
        File[] children = dir.listFiles();
        for (File child: children) {
            if (child.isDirectory()) {
                deleteDirRecursively(child);
            } else {
                child.delete();
            } }
        dir.delete();
    }
}
