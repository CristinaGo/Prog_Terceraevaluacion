package ejercicios;

/**
 * @author Cristina Gomez Campos
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {

        List<Integer> coleccion = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int num = (int) (Math.random() * 10 + 1);
            coleccion.add(num);
        }
        for (Integer elemento: coleccion) {
            System.out.print(elemento + " ");
        }
        Iterator<Integer> it = coleccion.iterator();
        while(it.hasNext()){
            Integer c = it.next();
            if (c == 5) {
                it.remove();
            }
        }
        System.out.println("\nEliminamos los elementos que valen 5");
        it = coleccion.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
