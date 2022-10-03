package ejemplos.comparabl;


import java.time.LocalDate;
import java.util.Arrays;

public class MainComparable {
    public static void main(String[] args) {
        Socio socio1 = new Socio(15,"Bettina", LocalDate.of(2000,12,1));
        Socio socio2 = new Socio(9,"Aladina", LocalDate.of(1968,10,10));
        Socio socio3 = new Socio(23,"Caleb", LocalDate.of(2012,12,13));
        Socio socio4 = new Socio(666,"Lucifer", LocalDate.of(1666,12,25));
        Socio socio5 = new Socio(0,"Adán", LocalDate.of(1000,5,10));

        Socio[] socios = {socio1, socio2, socio3, socio4, socio5};
        System.out.println("Imprimimos según han entrado los elementos");
        for (Socio elemento:socios) {
            System.out.println(elemento);
        }
        System.out.println("\nImprimimos en orden de id");
        Arrays.sort(socios);
        for (Socio elemento: socios) {
            System.out.println(elemento);
        }

    }
}
