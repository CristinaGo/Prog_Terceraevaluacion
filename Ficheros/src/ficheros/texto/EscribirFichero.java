package ficheros.texto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {
    public static void main(String[] args) {
        String ruta = "Ficheros\\src\\ficheros\\texto\\";
        String nombre = "Escribiendo.txt";
        File f = new File(ruta + nombre);
        try {
            FileWriter escritor = new FileWriter(f);
            escritor.write("Queda menos de una semana...");
            escritor.append("\nEtamos probando que este metodo lo ponga en otra linea");
            for (int i = 0; i < 10; i++) {
                escritor.append("\n" + i);
            }

            escritor.close();

        } catch (IOException e) {
            System.out.println("Problema: " +e.getMessage());
        }

    }
}
