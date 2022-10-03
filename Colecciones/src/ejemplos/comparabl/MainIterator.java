package ejemplos.comparabl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class MainIterator {
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

        Iterator<Socio> it = socios.iterator();
        while(it.hasNext()){
            Socio s = it.next();
            System.out.println(s);
        }
        //it = socios.iterator(); hacemos esto para ponerlo al principio(antes de la primera posición)


    }
}
