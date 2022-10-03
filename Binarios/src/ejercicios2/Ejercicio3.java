package ejercicios2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {

        // crear lis con 10
        List<Integer> list1 = crearListaEnteros(250);

        //crear lista con 5
        List<Integer> list2 = crearListaEnteros(150);

        //crear fichero con lista1
        String f1 = crearFicheroBinario("ficheroBase",list1);
        //crear fichero con lista2
        String f2 = crearFicheroBinario("ficheroNuevo",list2);

        //fusionar
        fusionar(f1,f2);
    }

    public static void fusionar(String ficheroBase, String ficheroNuevo){
        List<Integer> contenidoFicheroBase = null;
        List<Integer> contenidoFicheroNuevo = null;

        try (ObjectInputStream in1 = new ObjectInputStream(new FileInputStream(ficheroBase));
             ObjectInputStream in2 = new ObjectInputStream(new FileInputStream(ficheroNuevo));
            ) {

            contenidoFicheroBase = (List<Integer>) in1.readObject();
            contenidoFicheroNuevo = (List<Integer>) in2.readObject();

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        contenidoFicheroBase.addAll(contenidoFicheroNuevo);
        contenidoFicheroBase.sort((n1,n2)-> n1 - n2);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ficheroBase))) {

            out.writeObject(contenidoFicheroBase);
            leerFichero(ficheroBase);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Integer> crearListaEnteros(int tamaño){

        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < tamaño; i++) {
            lista.add((int) (Math.random() * 100));
        }
        return lista;

    }

    public static String crearFicheroBinario(String nombre, List<Integer> lista){

        String ruta = "Binarios\\src\\ejercicios2\\" + nombre + ".dat";
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta))) {

            out.writeObject(lista);
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            //e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ruta;
    }


    public static void imprimirLista(List<Integer> lista){
        lista.stream().forEach(c1 -> System.out.print(c1 + " "));


    }

    public static void leerFichero(String fichero){
        List<Integer> lista = null;
        try (ObjectInputStream in1 = new ObjectInputStream(new FileInputStream(fichero))) {
            lista = (List<Integer>) in1.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        lista.stream().forEach(l-> System.out.print(l + " "));

    }
}
