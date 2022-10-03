import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creamos un objeto que va a ser exportado a un fichero XML
        //creamos primero las listas y luego el objeto
        List<String> h = new ArrayList<>();
        h.add("Leer");
        h.add("Calistenia");
        h.add("Hacer el vago");

        List<Persona> hi = new ArrayList<>();
        hi.add(new Persona(3,"Jaimito",null, null));
        hi.add(new Persona(3,"Jorgito",null, null));
        hi.add(new Persona(3,"Juanito",null, null));

        Persona p = new Persona(30,"Pato Donald",h,hi);

        //Necesitamos, ademas del objeto, ubcarle el fichero, donde se va a crear y como se va a llamar

        String ruta = "EjemplosJAXB\\src\\Donald.xml";
        File f = new File(ruta);

        //Ahora añadimos las lineas necesarias para JAXB --> siempre igual solo cambiamos el nombre de la clase
        try {
            JAXBContext contexto = JAXBContext.newInstance(Persona.class);
            Marshaller m = contexto.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            //llamamos al método marshal con el bojeto y el fichero que tenemos ya preparados
            m.marshal(p,f);//crea el fichero

            //ahora al revés tenemos un archivo xml y lo vamos a parsear a un objeto java

            Unmarshaller um = contexto.createUnmarshaller();

            Persona p2 = (Persona) um.unmarshal(new File("EjemplosJAXB\\src\\Pasameajava.xml"));

            System.out.println(p2.toString());

        } catch (JAXBException e) {

            e.printStackTrace();
        }
    }
}
