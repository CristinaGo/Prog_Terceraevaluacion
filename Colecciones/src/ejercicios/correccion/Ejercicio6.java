package ejercicios.correccion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio6 {
    public static void main(String[] args) {
        List<Integer> listaOriginal = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            listaOriginal.add((int) (Math.random() * 10 + 1));
        }

        listaOriginal.sort((n1,n2) -> n1 - n2);
        System.out.println("Lista original: " + listaOriginal);

        Set<Integer> sinRepeticiones = new HashSet<>();
        sinRepeticiones.addAll(listaOriginal);

        System.out.println("Lista original pero sin repeticiones: " + sinRepeticiones);

        for (Integer elemento: sinRepeticiones) {
            listaOriginal.remove(elemento);
        }
        Set<Integer> repetidos = new HashSet<>();
        repetidos.addAll(listaOriginal);
        System.out.println("Lista de repetidos: " + repetidos);

        Set<Integer> unicos = new HashSet<>();
        unicos.addAll(sinRepeticiones);
        unicos.removeAll(repetidos);
        System.out.println("Lista de unicos: " + unicos);


    }

}
