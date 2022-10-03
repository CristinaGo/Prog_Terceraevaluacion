package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add((int)(Math.random() * 15 +1));
        }
        System.out.println("Lista sin ordenar");
        lista.stream().forEach(n -> System.out.print(n + " "));

        System.out.println("\nLista ordenada");
        lista.stream().sorted().forEach(n -> System.out.print(n + " "));

        System.out.println("\nLista ordenada sin repetir");
        lista.stream().distinct().sorted().forEach(n -> System.out.print(n + " "));

        System.out.println("\nSolo mayor o igual a 5 sin ordenar");
        lista.stream().filter(n -> n>=5).forEach(n -> System.out.print(n + " "));

        System.out.println("\nSolo mayor o igual a 5 ordenaros");
        lista.stream().filter(n -> n>=5).sorted().forEach(n -> System.out.print(n + " "));

        System.out.println("\nSolo mayor o igual a 5 ordenaros inversamente");
        lista.stream().filter(n -> n>=5).sorted((n1,n2) -> n2-n1).forEach(n -> System.out.print(n + " "));

        System.out.println("\nSuma los elementos");
        int suma = lista.stream().reduce(0,(acumulator, elemento) -> acumulator + elemento);
        System.out.println( suma);

        System.out.println("Suma los elementos mayor o igual a 5");
        int suma2 = lista.stream().filter(n -> n>=5).reduce(0,(acumulator, elemento) -> acumulator + elemento);
        System.out.println(suma2);

        System.out.println("Promedio");
        double numerador = lista.stream().reduce(0, (a, b) -> a + b);
        double denominador = lista.stream().count();
        System.out.println(numerador/denominador);


    }
}
