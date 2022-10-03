package ejercicios;

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
          int num = (int) (Math.random() * 10 + 1);
            lista.add(num);
        }
        for (Integer elemento: lista) {
            System.out.print(elemento + " ");
        }
        Set<Integer> conjunto = new HashSet<>();
        conjunto.addAll(lista);
        System.out.println("Conjunto");
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }

    }
}
