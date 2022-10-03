package ejercicio2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Cristina Gómez Campos
 */
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Llamadas al primer método");
        crearFicheroBinarioCadenas();
        System.out.println("Llamadas al segundo método");
        crearFicheroBinarioNumeros();
        leerFicheros();
    }

    public static void crearFicheroBinarioCadenas() {

        System.out.println("Números de cadenas a introducir");
        int n = sc.nextInt();
        sc.nextLine();
        List<String> cadenas = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Introducir cadena");
            String cadena = sc.nextLine();
            cadenas.add(cadena);
        }
        String ruta = "ExamenCristinaGomezCampos\\src\\main\\java\\ejercicio2\\cadenas.dat";

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta))) {
            out.writeObject(cadenas);
        } catch (FileNotFoundException e) {
            System.out.println("No existe el fichero o la ruta es incorrecta.");
            //e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public static void crearFicheroBinarioNumeros() {

        System.out.println("Cantidad de números a introducir");
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Número");
            int numero = sc.nextInt();
            sc.nextLine();
            numeros.add(numero);
        }
        String ruta = "ExamenCristinaGomezCampos\\src\\main\\java\\ejercicio2\\numeros.dat";

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta))) {
            out.writeObject(numeros);
        } catch (FileNotFoundException e) {
            System.out.println("No existe el fichero o la ruta es incorrecta.");
            //e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public static void leerFicheros(){
        System.out.println("Leyendo ficheros..");
        String ruta1 = "ExamenCristinaGomezCampos\\src\\main\\java\\ejercicio2\\cadenas.dat";
        String ruta2 = "ExamenCristinaGomezCampos\\src\\main\\java\\ejercicio2\\numeros.dat";
        try (ObjectInputStream in1 = new ObjectInputStream(new FileInputStream(ruta1));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream(ruta2))) {

            List<String> contenidoFicheroCadenas = (List<String>) in1.readObject();
            List<Integer> contenidoFicheroNumeros = (List<Integer>) in2.readObject();

            System.out.println("Contenido del fichero cadenas de texto:");
            contenidoFicheroCadenas.stream().forEach(c1-> System.out.print(c1 + " "));

            System.out.println("\nContenido del fichero de numeros:");
            contenidoFicheroNumeros.stream().forEach(c1-> System.out.print(c1 + " "));

        } catch (FileNotFoundException e) {
            System.out.println("No existe el fichero o la ruta es incorrecta.");
            //e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}


