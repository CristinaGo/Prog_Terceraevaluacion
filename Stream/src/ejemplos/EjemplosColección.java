package ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class EjemplosColección {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random() * 21 - 10));
        }

       /* for (Integer e: lista) {
            System.out.print(e + " ");
        }
        System.out.println("\n");*/

        Stream<Integer> listaStream = lista.stream();
        listaStream.sorted().forEach(n -> System.out.print(n + " ")); //operacion terminal, no me deja seguir usandolo

        //para evitar el error por cerrar el stream, lo que vamos a hacer en general es no asignarlo a stream sino crearlo, usarlo y cerrarlo. EN GENERAL, NO SIEMPRE.

        listaStream = lista.stream();
        //listaStream.distinct().forEach(n -> System.out.print(n + " "));
        System.out.println("\nFiltrados");
        lista.stream().filter(n -> n >= 0).forEach(n -> System.out.print(n + " "));
        System.out.println("\nObtengo los elementos distintos que tiene la colección");
        lista.stream().distinct().forEach(n -> System.out.print(n + " "));
        System.out.println("\nOrdenados");
        lista.stream().sorted().distinct().forEach(n -> System.out.print(n + " "));

        // obtener valor absoluto
        System.out.println("\nValor absoluto");
        lista.stream()
                .map(n -> Math.abs(n))
                .sorted()
                .forEach(n -> System.out.print(n + " "));

        System.out.println("\nMostramos el primer elemento de la lista");
        Optional resultado = lista.stream().findFirst();
        System.out.println(resultado);
        System.out.println(resultado.get());

        System.out.println("\nNúmero más grande de la lista");
        Integer maximo = lista.stream()
                .max((n1,n2) -> n1 - n2)
                .get();
        System.out.println(maximo);
        System.out.println("\nContamos elementos de la lista");
        long numElemetos = lista.stream().count();
        System.out.println(numElemetos);

        System.out.println("\nSuma de todos los elementos de la lista");

        int suma = lista.stream().reduce(0,(acumulator, elemento) -> acumulator + elemento);
        System.out.println("Suma: " + suma);


    }
}
