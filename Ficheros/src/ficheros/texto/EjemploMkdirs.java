package ficheros.texto;

import java.io.File;

public class EjemploMkdirs {
    public static void main(String[] args) {
        String ruta = "Ficheros\\src\\ficheros\\texto\\";
        String carpetasPrimero = "DAW\\Primero\\Programación";
        String carpetasSegundo = "DAW\\Segundo\\DWES";

        File primero = new File(ruta + carpetasPrimero);
        boolean primeroOK = primero.mkdirs();
        if (primeroOK){
            System.out.println("Se ha creado primero bien");
        }
        File segundo = new File(ruta + carpetasSegundo);
        boolean segundoOK = segundo.mkdirs();
        if (segundoOK){
            System.out.println("Se ha creado segundo bien");
        }
    }
}
