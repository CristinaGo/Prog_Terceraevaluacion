package ejercicios2;

import java.io.*;
import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        //array tamaño 10
        Integer[] a1 = crearArrayEnteros(10);

        //array tamaño 7
        Integer[] a2 = crearArrayEnteros(7);

        //fichero binario de array 1
        String r1 = crearFicheroBinario("f1",a1);

        //fichero binario de array 2
        String r2 =crearFicheroBinario("f2",a2);

        //llamada metodo fusionar
        Integer[] arrayFusionado = fusionar(r1,r2);

        //imprimir el array fusionado
        imprimirArray(arrayFusionado);

    }

    public static Integer[] fusionar(String fichero1, String fichero2){
        Integer[] contenido1 = null;
        Integer[] contenido2 = null;
        Integer[] fusionado = null;
        try (ObjectInputStream in1 = new ObjectInputStream(new FileInputStream(fichero1));
             ObjectInputStream in2 = new ObjectInputStream(new FileInputStream(fichero2))) {
            contenido1 = (Integer[]) in1.readObject();
            //imprimirArray(contenido1);
            contenido2 = (Integer[]) in2.readObject();
            //imprimirArray(contenido2);
            fusionado = new Integer[contenido1.length + contenido2.length];
            for (int i = 0; i < contenido1.length; i++) {
                fusionado[i] = contenido1[i];
            }
            for (int i = 0; i < contenido2.length; i++) {
                fusionado[contenido1.length + i] = contenido2[i];
            }


        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            //e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Arrays.sort(fusionado);
        return fusionado;
    }

    public static Integer[] crearArrayEnteros (int tamaño){
        Integer [] enteros = new Integer[tamaño];
        for (int j = 0; j < enteros.length; j++) {
            enteros[j] = (int) (Math.random() * 100);
        }


        return enteros;
    }

    public static String crearFicheroBinario(String nombre,Integer[] array){

        String ruta = "Binarios\\src\\ejercicios2\\" + nombre + ".dat";

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta))) {

            out.writeObject(array);


        } catch (FileNotFoundException e) {
            System.out.println("No existe el fichero o la ruta es la incorrecta");
            //e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return ruta;

    }

    public static void imprimirArray(Integer[] array){
        System.out.println(Arrays.toString(array));
    }
}
