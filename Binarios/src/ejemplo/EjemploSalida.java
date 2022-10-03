package ejemplo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class EjemploSalida {
    public static void main(String[] args) {
        int[] enteros = new int[10];
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = (int) (Math.random() * 1000);
        }
        System.out.println(Arrays.toString(enteros));

        String ruta = "Binarios\\enteros.dat";
        //lo que hay que hacer es
        // 1) creamos el fichero de salida
        try {
            FileOutputStream ficheroSalida = new FileOutputStream(ruta);
            // 2) tenemos que pasarle  este fichero a un flujo de salida que analiza los datos del fichero
            ObjectOutputStream flujoSalida = new ObjectOutputStream(ficheroSalida);
            //Esto tambíen se podría poner así
            //ObjectOutputStream flujoSa = new ObjectOutputStream(new FileOutputStream("Binarios\\enteros.dat"));//con esto solo cerramos el flujo de salida
            //flujoSa.close();

            //una vez creado el flujo de salida, utlizar los metodos write necesarios
            for (int i = 0; i < enteros.length; i++) {
                flujoSalida.writeInt(enteros[i]);
            }


            flujoSalida.close();
            ficheroSalida.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ruta no encontrada " + e.getMessage());
            //e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Problema de E/S" + e.getMessage());
            //e.printStackTrace();
        }
    }
}
