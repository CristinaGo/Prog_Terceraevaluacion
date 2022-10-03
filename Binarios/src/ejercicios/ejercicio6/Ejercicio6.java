package ejercicios.ejercicio6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio6 {
    public static void main(String[] args) {
        Registro r = new Registro(18);
        System.out.println(r.toString());

        List<Registro> lista = new ArrayList<>();
        lista.add(r);

        String ruta = "Binarios\\src\\ejercicios\\ejercicio6\\registros.dat";

        File f = new File(ruta);
        if (!f.exists()){
            try {
                boolean creado = f.createNewFile();
                System.out.println("Se ha creado el fichero.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta))) {
            out.writeObject(lista);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ruta))) {

           ArrayList<Registro> fichero = (ArrayList<Registro>) in.readObject();
            fichero.stream().forEach(System.out::println);

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado o ruta incorrecta");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
