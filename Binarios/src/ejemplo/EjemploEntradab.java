package ejemplo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/**
 * Leer el fichero enteros.dat
 */

public class EjemploEntradab {
    public static void main(String[] args) {
        String ruta = "Binarios\\enteros2.dat";
        try {
            FileInputStream ficheroEntrada = new FileInputStream(ruta);
            ObjectInputStream flujoEntrada = new ObjectInputStream(ficheroEntrada);
            int[] leidos = (int[]) flujoEntrada.readObject();

            System.out.println(Arrays.toString(leidos));

            flujoEntrada.close();
            ficheroEntrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
