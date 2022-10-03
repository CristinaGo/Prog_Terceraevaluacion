package ejercicios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ejercicio3 {
    public static void main(String[] args) {

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Binarios\\src\\ejercicios\\elBuenMomento.dat"))) {

            String contenido = (String) in.readObject();

            System.out.println(contenido);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
