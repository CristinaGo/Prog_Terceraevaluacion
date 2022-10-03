package ejemplos.comparabl;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainComparator {
    public static void main(String[] args) {
        Socio socio1 = new Socio(15,"Bettina", LocalDate.of(2000,12,1));
        Socio socio2 = new Socio(9,"Aladina", LocalDate.of(1968,10,10));
        Socio socio3 = new Socio(23,"Caleb", LocalDate.of(2012,12,13));
        Socio socio4 = new Socio(666,"Lucifer", LocalDate.of(1666,12,25));
        Socio socio5 = new Socio(0,"Adán", LocalDate.of(1000,5,10));

        ArrayList<Socio> socios = new ArrayList<>();
        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);
        socios.add(socio5);

        System.out.println("Mostramos los elementos según entraron\n");
        imprimirArrayList(socios);

        System.out.println("\nImprimimos en orden por nombre\n");
        ComparaNombres cn = new ComparaNombres();
        socios.sort(cn);
        imprimirArrayList(socios);

        System.out.println("\nImprimimos en orden por fecha\n");
        ComparaFechaNacimiento cf = new ComparaFechaNacimiento();
        socios.sort(cf);
        imprimirArrayList(socios);

        System.out.println("\nImprimimos en orden por ID\n");
        ComparaId ci = new ComparaId();
        socios.sort(ci);
        imprimirArrayList(socios);
    }

    private static void imprimirArrayList(ArrayList<Socio> socios) {
        for (Socio elemento: socios) {
            System.out.println(elemento);

        }
    }
}
