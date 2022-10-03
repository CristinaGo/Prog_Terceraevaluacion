import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Cristina Gómez campos
 */

public class Main {
    public static void main(String[] args) {
        List<String> pruebas = new ArrayList<>();
        pruebas.add("Análisis de sangre");
        pruebas.add("Radiorafía");
        pruebas.add("Ecografía");
        pruebas.add("Ecocardiografía");
        List<Animal> cría = new ArrayList<>();
        cría.add(new Animal(null,"Coco",1,null,null));
        cría.add(new Animal(null,"Mus",1,null,null));
        cría.add(new Animal(null,"Sisi",1,null,null));

        Animal a = new Animal("Perro","Moon",6,pruebas, cría);

        String ruta = "CristinaGómezPV5\\src\\veterinaria.xml";
        File f = new File(ruta);

        try {
            JAXBContext contexto = JAXBContext.newInstance(Animal.class);
            Marshaller m = contexto.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
            m.marshal(a,f);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
