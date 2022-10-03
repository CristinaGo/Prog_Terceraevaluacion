package ejercicio1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Cristina gómez campos
 */

public class Ejercicio1 {
    static Scanner sc = new Scanner(System.in);
    static String ruta = "CristinaGómezCamposPV6\\src\\ejercicio1\\clientes.dat";


    private static void comprobarFichero() {
        File f = new File(ruta);
        if (!f.exists()){
            try {
                boolean creado = f.createNewFile();
                System.out.println("Se ha creado el fichero.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void añadirCliente(Cliente c, ArrayList<Cliente> clientes) {
        comprobarFichero();


        clientes.add(c);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta))) {
            out.writeObject(clientes);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Cliente> listarClientes() {
        comprobarFichero();



        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ruta))) {
            ArrayList<Cliente> fichero = (ArrayList<Cliente>) in.readObject();

            fichero.stream().forEach(System.out::println);



        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado o ruta incorrecta");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void eliminarCliente(Cliente c, ArrayList<Cliente> clientes) {
        comprobarFichero();

        clientes.remove(c);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta))) {
            out.writeObject(clientes);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void modificarDatos(Cliente c, ArrayList<Cliente> clientes){
        System.out.println("Nuevo id");
        String id = sc.nextLine();
        System.out.println("Nuevo nombre");
        String nombre = sc.nextLine();
        System.out.println("Nuevo teléfono");
        String telefono = sc.nextLine();
        c.setId(id);
        c.setNombre(nombre);
        c.setTelefono(telefono);


        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta))) {
            out.writeObject(clientes);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
