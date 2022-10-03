package ejercicios.ejercicio2;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Conversor {
    private Ciudad ciudad;
    private String nombreFichero;

    public Conversor(Ciudad ciudad, String nombreFichero) {
        this.ciudad = ciudad;
        this.nombreFichero = nombreFichero;
    }

    public void generarXML(){
        File f = new File("EjemplosJAXB\\src\\main\\java\\ejercicios\\ejercicio2\\" + nombreFichero + ".xml");

        try {
            JAXBContext contexto = JAXBContext.newInstance(Ciudad.class);
            Marshaller mr = contexto.createMarshaller();
            mr.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
            mr.marshal(ciudad,f);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void crearCiudad(){

        File f = new File("EjemplosJAXB\\src\\main\\java\\ejercicios\\ejercicio2\\" + nombreFichero + ".xml");
        try {
            JAXBContext contexto = JAXBContext.newInstance(Ciudad.class);
            Unmarshaller um = contexto.createUnmarshaller();

            Ciudad c2 = (Ciudad) um.unmarshal(f);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}


