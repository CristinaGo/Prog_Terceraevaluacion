package ejercicios;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 6
 * @author Cristina Gómez Campos
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lista.add((int)(Math.random() * (1000 + 1)));
        }
        //Lista original
        System.out.println("Lista original");
        lista.stream().forEach(n -> System.out.print(n + " "));

        //Número mayor
        int mayor = lista.stream().max((n1,n2)-> n1 - n2).get();
        System.out.println("\nMayor número:" + mayor);

        //Número menor
        int menor = lista.stream().min((n1,n2)-> n1 - n2).get();
        System.out.println("Menor número:" + menor);

        //Suma
        int suma = lista.stream().reduce(0,(acumulator, elemento) -> acumulator + elemento);
        System.out.println("Suma los elementos: " + suma);


        //Promedio
        double numerador = lista.stream().reduce(0, (a, b) -> a + b);
        double denominador = lista.stream().count();
        System.out.println("Promedio: " + numerador/denominador);

    }
}
