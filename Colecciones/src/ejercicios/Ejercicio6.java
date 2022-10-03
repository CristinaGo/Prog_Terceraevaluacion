package ejercicios;

import java.util.*;

/**
 * @author Cristina Gómez Campos
 * No está bien hecho
 */

public class Ejercicio6 {
    public static void main(String[] args) {

        List<Integer> listaOriginal = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int num = (int) (Math.random() * 10 + 1);
            listaOriginal.add(num);
        }
        listaOriginal.sort((n1,n2) -> n1 - n2);

        System.out.println("Lista original");
        Iterator<Integer> it = listaOriginal.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }

        Set<Integer> listaSinRepeticiones = new HashSet<>();
        listaSinRepeticiones.addAll(listaOriginal);

        System.out.println("\nLista sin repeticiones");
        Iterator<Integer> it2 = listaSinRepeticiones.iterator();
        while (it2.hasNext()){
            System.out.print(it2.next() + " ");
        }

        Set<Integer> listaRepetidos = new HashSet<>();
        listaRepetidos.addAll(listaSinRepeticiones);
        for (int i = 0; i < listaOriginal.size(); i++) {
            if (listaOriginal.indexOf(i) == listaOriginal.lastIndexOf(i)){
                listaRepetidos.remove(i);
            }
        }
        System.out.println("\nLista repetidos");
        Iterator<Integer> it3 = listaRepetidos.iterator();
        while (it3.hasNext()){
            System.out.print(it3.next() + " ");
        }


        Set<Integer> listaNoRepetidos = new HashSet<>();
        listaNoRepetidos.addAll(listaSinRepeticiones);
        listaNoRepetidos.removeAll(listaRepetidos);
        for (int i = 0; i < listaSinRepeticiones.size(); i++) {
            if(listaOriginal.indexOf(i) != listaOriginal.lastIndexOf(i)){
                listaNoRepetidos.remove(i);
            }
        }

        System.out.println("\nLista no repetidos");
        Iterator<Integer> it4 = listaNoRepetidos.iterator();
        while (it4.hasNext()){
            System.out.print(it4.next() + " ");
        }
    }
}
