package ejercicios;

import ejemplos.comparabl.Socio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        List<Integer> numeros = new ArrayList<>();
       do {
           System.out.println("Introduce un número no negativo");
           num = sc.nextInt();
           if (num >= 0) {
               numeros.add(num);
           }
       }while(num != -1);
        System.out.println("Mostramos la lista");
       System.out.println(numeros);

       Iterator<Integer> it = numeros.iterator();
        System.out.println("Mostramos los pares");
        while(it.hasNext()){
            Integer n = it.next();
            if (n % 2 == 0){
                System.out.print(n + " ");
            }
        }
        it = numeros.iterator();

        System.out.println("\nEliminamos los multiplos de tres");
        while(it.hasNext()){
            Integer n = it.next();
            if (n % 3 == 0){
                it.remove();
            }
        }
        System.out.println(numeros);
    }
}
