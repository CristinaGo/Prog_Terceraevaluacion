package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Cristina Gómez Campos
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        List<Integer> numeros = new ArrayList<>();

        do {
            System.out.println("Introduce un número");
            numero = sc.nextInt();
            if(numero > 0) {
                numeros.add(numero);
            }
        }while(numero >= 0);

        System.out.println("Mostramos la lista");

        System.out.println(numeros);

        Iterator<Integer> it = numeros.iterator();
        List<Integer> parPorCien = new ArrayList<>();
        System.out.println("Mostramos los indices de los pares");

        while(it.hasNext()){
            Integer n = it.next();
            if (n % 2 == 0){
                System.out.print(numeros.indexOf(n)+ " ");
                Integer nN = n*100;
                parPorCien.add(nN);
            }
        }
        System.out.println("\nMostramos los pares multiplicados por cien");

        Iterator<Integer> it2 = parPorCien.iterator();

        while(it2.hasNext()){
            Integer n2 = it2.next();
            System.out.print(n2 + " ");
        }

    }
}
