package ejercicios;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ejercicio1 {
    public static void main(String[] args) {
        String poema = "Aquel momento que flota\n" +
                "nos toca de su misterio.\n" +
                "Tendremos siempre el presente\n" +
                "roto por aquel momento.\n" +
                "Toca la vida sus palmas\n" +
                "y tañe sus instrumentos.\n" +
                "Acaso encienda su música\n" +
                "sólo para que olvidemos.\n" +
                "Pero hay cosas que no mueren\n" +
                "y otras que nunca vivieron\n" +
                "y las hay que llenan todo\n" +
                "nuestro universo.\n" +
                "Y no es posible librarse\n" +
                "de su recuerdo.";


        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Binarios\\src\\ejercicios\\elBuenMomento.dat"))) {


            out.writeObject(poema);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
