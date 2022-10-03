package ejercicios.ejercicio7;

import java.util.Comparator;

/**
 * @author Cristina Gómez Campos
 */

public class CompararNombres implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Académico a1 = (Académico) o1;
        Académico a2 = (Académico) o2;
        if (a1.nombre.compareToIgnoreCase(a2.nombre) < 0){
            return -1;
        } else if (a1.nombre.compareToIgnoreCase(a2.nombre) > 0){
            return 1;
        } else{
            return 0;
        }

    }
}
