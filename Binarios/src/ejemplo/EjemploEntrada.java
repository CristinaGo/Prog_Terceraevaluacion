package ejemplo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/**
 * Leer el fichero enteros.dat
 */

public class EjemploEntrada {
    public static void main(String[] args) {
        String ruta = "Binarios\\enteros.dat";
        // 1) creamos un FileInputStream para el archivo

        try {
            FileInputStream ficheroEntrada = new FileInputStream(ruta);
            //2) Necesitamos deserializar el fichero, que viene en bytes
            ObjectInputStream flujoEntrada = new ObjectInputStream(ficheroEntrada);
            //3) Ya solo nos queda leer los datos; para cada método write existe el metodo read correspondiente
            // como el fichero enteros.dat utlizamos writeInt usaremos readINt
            //necesitamos un array donde van a entrar los datos
            int[] leidos = new int[10];
            for (int i = 0; i < leidos.length; i++) {
                leidos[i] = flujoEntrada.readInt();
            }
            //ver si se ha leido
            System.out.println(Arrays.toString(leidos));


            flujoEntrada.close();
            ficheroEntrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
