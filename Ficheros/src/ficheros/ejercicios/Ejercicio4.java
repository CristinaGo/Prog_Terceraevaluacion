package ficheros.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // vamos a leer de
        String rutaOrigen = "Ficheros\\src\\ficheros\\ejercicios\\Restaurantes.csv";
        File origen = new File(rutaOrigen);

        // y vamos a escribir
        String rutaDestino = "Ficheros\\src\\ficheros\\ejercicios\\Restaurantes2.csv";
        File destino = new File(rutaDestino);

        //abrimos fichero origen y leer linea a linea
        try {
            //como hay que leer y escribir. creamos un scanner y un filewriter
            Scanner lector = new Scanner(origen);
            FileWriter fw = new FileWriter(destino,true);
            String linea;
            while (lector.hasNextLine()){
                linea = lector.nextLine();
                String[] campos = linea.split(",");
                //campos[4] es el codigo postal
                if (!campos[4].startsWith("6")){
                    //si no empieza por 6, escribimos la linea en el destino
                    fw.write(linea + "\n");

                }
            }
            fw.close();
            lector.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
