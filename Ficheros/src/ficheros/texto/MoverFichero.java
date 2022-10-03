package ficheros.texto;

import java.io.File;

public class MoverFichero {
    public static void main(String[] args) {
        String ruta = "Ficheros\\src\\ficheros\\texto\\";
        File f = new File(ruta + "movible.txt");

        boolean movido = f.renameTo(new File("Ficheros\\src\\excepciones\\" + "movible.txt"));

        if (movido){
            System.out.println("Se ha movido correctamente");
        }
    }
}
