package ejercicios.ejercicio2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Ciudad m = new Ciudad("Europa","Madrid","España",null);
        Ciudad w = new Ciudad("América","Washington","EEUU", null);
        Ciudad s = new Ciudad("Oceanía","Australia","Sidney", null);

        ArrayList<Ciudad> ciudades = new ArrayList<>();
        ciudades.add(m);
        ciudades.add(w);
        ciudades.add(s);

        Ciudad ciudad = new Ciudad(null,null,null,ciudades);

        Conversor c = new Conversor(ciudad,"ciuadades2");
        c.generarXML();

        Conversor c2 = new Conversor(ciudad ,"convertirAObjeto");
        c2.crearCiudad();


    }
}
