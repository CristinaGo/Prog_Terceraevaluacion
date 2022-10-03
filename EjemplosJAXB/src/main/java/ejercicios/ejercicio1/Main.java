package ejercicios.ejercicio1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //1)Objeto
        ArrayList<String> modulos = new ArrayList<>();
        modulos.add("Programación");
        modulos.add("Bases de datos");
        modulos.add("Lenguaje de Marcas");
        Estudiante estudiante = new Estudiante("45544521S", "Cristina","Gómez",1, "DAW", modulos);

        //2)Ruta y fichero

        String ruta = "EjemplosJAXB\\src\\main\\java\\ejercicios\\ejercicio1\\" + estudiante.getNombre() + ".xml";
        File f = new File(ruta);

        //3) Contexto, marahaller y método marchal
        try {
            JAXBContext contexto = JAXBContext.newInstance(Estudiante.class);
            Marshaller m = contexto.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(estudiante,f);


        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
