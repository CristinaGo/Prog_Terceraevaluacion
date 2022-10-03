package AppUniversidad.interfaz;

import AppUniversidad.dao.AsignaturaDAO;
import AppUniversidad.modelo.Asignatura;

import java.util.ArrayList;
import java.util.List;

public class MainAsignatura {
    public static void main(String[] args) {
        Asignatura a1 = new Asignatura(1,"Redes",7,130,1);
        //AsignaturaDAO.create(a1);

        List<Asignatura> asignaturas = new ArrayList<>();
       asignaturas.add(new Asignatura(2,"Programación",8,140 ,4));
        asignaturas.add(new Asignatura(3,"Bases de datos",6,120 ,4));
        asignaturas.add(new Asignatura(4,"Lenguaje de Marcas",4,100 ,4));

        //AsignaturaDAO.cargarLista(asignaturas);
        Asignatura resultado = AsignaturaDAO.read(3);
        //System.out.println(resultado);

        a1.setPrecio(75);
        //AsignaturaDAO.update(a1);

       // AsignaturaDAO.delete(1);

        AsignaturaDAO.listarAsignaturas();
    }
}
