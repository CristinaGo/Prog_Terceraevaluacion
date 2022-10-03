package ejercicios;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 5
 * @author Cristina Gómez Campos
 */

public class Ejercicio5 {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            lista.add((int)(Math.random() * (20 - (-20) +1) +(-20)));
        }

        //Lista original
        System.out.println("Lista original");
        lista.stream().forEach(n -> System.out.print(n + " "));

        //Lista positivos sin repetir
        System.out.println("\n\nLista de positivos sin repetir");
        lista.stream().distinct().filter(n -> n>=0).forEach(n -> System.out.print(n + " "));
        long numP = lista.stream().distinct().filter(n -> n>=0).count();

        //Nº de elementos positivos
        System.out.println("\nElementos del stream de positivos: " + numP);

        //Lista negativos sin repetir
        System.out.println("\nLista de negativos sin repetir");
        lista.stream().distinct().filter(n -> n<0).forEach(n -> System.out.print(n + " "));
        long numN = lista.stream().distinct().filter(n -> n<0).count();

        //Nº de elementos negativos
        System.out.println("\nElementos del stream de negativos: " + numN);

        //Lista entre -10 y 10
        System.out.println("\nLista con numeros entre -10 y 10 repetir");
        lista.stream().distinct().filter(n -> n>= -10 && n<= 10).forEach(n -> System.out.print(n + " "));

    }
}
