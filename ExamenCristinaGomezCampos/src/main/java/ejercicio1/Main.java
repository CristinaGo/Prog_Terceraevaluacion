package ejercicio1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Cristina Gómez Campos
 */

public class Main {
    public static void main(String[] args) {
        String[] tipos = {"planta","veneno"};
        String nombreFichero = null;
        Pokemon p1 = new Pokemon("001","Primera","Bulbasur",tipos);
        Pokemon p2 = new Pokemon("002","Primera","Ivysaur",tipos);
        Pokemon p3 = new Pokemon("003","Primera","Venusaur",tipos);

        String r1 = hacerXMLPokemon(p1,"f1");
        String r2 = hacerXMLPokemon(p2,"f2");
        String r3 = hacerXMLPokemon(p3,"f3");

        ArrayList<String> rutas = new ArrayList<>();
        rutas.add(r1);
        rutas.add(r2);
        rutas.add(r3);


       hacerXMLPokedex(rutas);



    }

    private static String hacerXMLPokemon(Pokemon p, String nombreFichero) {

        String ruta = "ExamenCristinaGomezCampos\\src\\main\\java\\ejercicio1\\" + nombreFichero + ".xml";
        try {
            JAXBContext contexto = JAXBContext.newInstance(Pokemon.class);
            Marshaller ma = contexto.createMarshaller();
            ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            File f = new File(ruta);
            ma.marshal(p,f);
        } catch (JAXBException e) {
            System.out.println("Ha ocurrido un error inesperado");
            //e.printStackTrace();
        }
        return ruta;

    }

    private static void hacerXMLPokedex(ArrayList<String> rutas){
        List<Pokemon> pokemons = new ArrayList<>();


        try {
            JAXBContext contexto = JAXBContext.newInstance(Pokemon.class);

            Unmarshaller um = contexto.createUnmarshaller();
            for (int i = 0; i < rutas.size(); i++) {
                Pokemon p = (Pokemon) um.unmarshal(new File(rutas.get(i)));
                pokemons.add(p);

            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        JAXBContext contexto = null;
        String ruta = "ExamenCristinaGomezCampos\\src\\main\\java\\ejercicio1\\Pokedex.xml";
        try {
            contexto = JAXBContext.newInstance(Pokedex.class);
            Marshaller ma = contexto.createMarshaller();
            ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            File f = new File(ruta);
            //ma.marshal(pokemons,f); // salta una excepción
            for (int i = 0; i < pokemons.size(); i++) {
                ma.marshal(pokemons.get(i),f); //solo escribe un pokemon

            }

        } catch (JAXBException ex) {
            ex.printStackTrace();
        }




    }




}
