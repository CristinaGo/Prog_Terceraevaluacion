package AppUniversidad.interfaz;

import AppUniversidad.dao.DepartamentoDAO;
import AppUniversidad.modelo.Departamento;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainDepartamento {

    public static void main(String[] args) {

        Map<Integer, String> departamentos = new HashMap<>();
        departamentos.put(1,"Arquitectura y Tecnología de Sistemas Informáticos");
        departamentos.put(2,"Inteligencia Artificial");
        departamentos.put(3,"Lenguajes y Sistemas Informáticos e Ingeniería del Software");
        departamentos.put(4,"Matemática aplicada a las Tecnologías de la Información y de la Comunicación");

        List<Integer> ids = departamentos.keySet().stream().toList();
        List<String> nombres = departamentos.values().stream().toList();
       for (int i = 0; i < ids.size(); i++) {
            Departamento departamento = new Departamento(ids.get(i) ,nombres.get(i));
            DepartamentoDAO.create(departamento);

       }


    }
}
