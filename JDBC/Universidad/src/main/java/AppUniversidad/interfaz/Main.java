package AppUniversidad.interfaz;

import AppUniversidad.dao.AlumnoDAO;
import AppUniversidad.modelo.Alumno;

public class Main {
    public static void main(String[] args) {

       Alumno a1 = new Alumno(1,"Alba Alonso","Av. Andalucia, 3","11111111");
        //System.out.println(a1);
        //AlumnoDAO.create(a1);

        //Alumno a2 = new Alumno(2,"Benito Blanco","Calle Brtuo","222222222");

        //AlumnoDAO.create(a2);

        /*for (int i = 1; i < 3; i++) {
            Alumno a = AlumnoDAO.read(i);
            System.out.println(a.toString());
        }*/

        //a1.setDireccion("Mudanza 3");
       // AlumnoDAO.update(a1);

        //AlumnoDAO.delete(1);






    }
}
