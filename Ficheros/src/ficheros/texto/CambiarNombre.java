package ficheros.texto;

import java.io.File;

public class CambiarNombre {
    public static void main(String[] args) {
        String ruta = "Ficheros\\src\\ficheros\\texto\\";

        File f = new File(ruta + "renombrable.txt");
        boolean renombrado = f.renameTo(new File(ruta + "renombrado.txt"));

        if (renombrado){
            System.out.println("Se ha modificado el nombre correctamente");
        }
    }
}
