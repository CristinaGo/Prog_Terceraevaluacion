package ficheros.ejercicios;

import java.io.File;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ruta");
        String ruta = sc.nextLine();
        //"Ficheros\src\ficheros\ejercicios\Restaurantes2.csv";
        File f = new File(ruta);
        boolean resultado = f.delete();
        if (resultado){
            System.out.println("El fichero se ha borrado");
        }
    }
}
