package ejercicios.ejercicio7;

import ejemplos.comparabl.ComparaNombres;

import java.util.*;

/**
 * @author Cristina Gómez Campos
 */

public class Main {
    public static void main(String[] args) {
        Académico álvaro = new Académico("Álvaro Pombo",2004); //J
        Académico javier = new Académico("Javier Marias",2008); //R
        Académico juan = new Académico("Juan GIL",2011); //e
        Académico joseluis = new Académico("Jose Luis Gomez",2014); //Z
        Académico paz = new Académico("Paz Battaner",2017); //s

        Map<Character, Académico> academia = new HashMap<>();
        academia.put('j',álvaro);
        academia.put('r', javier);
        academia.put('e', juan);
        academia.put('z', joseluis);
        academia.put('s', paz);

        System.out.println("Mostrar academia");
        for(Character clave: academia.keySet()){
            Académico valor = academia.get(clave);
            System.out.println("Sillón: " + clave + ", nombre: " + valor.nombre + " (" + valor.añoIngreso + ")");
        }


        System.out.println("\nMostrar sin letra");
        Collection<Académico> académicos = academia.values();
        imprimirColección(académicos);


        System.out.println("\nOrdenar por nombre");




    }

   /* static void imprimirMapa(Map<Character, Académico> academia) {
        for (Map.Entry<Character, Académico> elemento: academia.entrySet()) {
            System.out.println(elemento.getKey() + " " + elemento.getValue());
        }
    }*/

    static void imprimirColección(Collection<Académico> lista) {
        for (Académico elemento : lista) {
            System.out.println(elemento);
        }
    }
}
