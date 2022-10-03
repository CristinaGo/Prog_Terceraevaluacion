package AppUniversidad.interfaz;

import AppUniversidad.dao.AlumnoDAO;
import AppUniversidad.modelo.Alumno;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenuAlumno {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

       menu();
    }

    private static void menu() {
        int op = 0;

        do {
            try {
                System.out.println("Selecciona una opción : \n1.Dar de alta un alumno.\n2.Dar de baja un alumno.\n3.Modificar datos de un alumno.\n4.Consultar datos de un alumno.\n0.Salir.");
                op = sc.nextInt();
                sc.nextLine();
            }catch (InputMismatchException e){
                System.out.println("El tipo de dato introducido no es un numero entero.");

            }
            switch (op){
                case 0:
                    break;
                case 1:
                    darDeAlta();
                    String dir;
                    int id;
                    String telefono;
                    String nombre;
                    break;
                case 2:
                    darDeBaja();
                    break;
                case 3:
                    modificarDatos();
                    break;
                case 4:
                    consultarDatos();
                    break;
            }

        }while (op != 0);


    }

    private static void consultarDatos() {
        int id;
        System.out.println("Id del alumno a consultar");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println(AlumnoDAO.read(id));
    }

    private static void modificarDatos() {
        int id;
        String telefono;
        String dir;
        String nombre;
        System.out.println("Id del alumno a modificar");
        id = sc.nextInt();
        sc.nextLine();
        Alumno a1 = AlumnoDAO.read(id);
        System.out.println("¿Qué datos quieres modificar?\n(N) Nombre.\n(D) Dirección\n(T) Teléfono");
        char c = sc.nextLine().toUpperCase().charAt(0);
        if (c == 'N'){
            System.out.println("Nuevo nombre:");
            nombre = sc.nextLine();
            a1.setNombre(nombre);
        } else if(c == 'D'){
            System.out.println("Nueva dirección:");
            dir = sc.nextLine();
            a1.setDireccion(dir);
        } else if (c == 'T'){
            System.out.println("Nuevo telefono:");
            telefono = sc.nextLine();
            a1.setTelefono(telefono);
        } else{
            System.out.println("Opción incorrecta");
        }
        AlumnoDAO.update(a1);
    }

    private static void darDeBaja() {
        int id;
        System.out.println("Id del alumno a eliminar");
        id = sc.nextInt();
        sc.nextLine();
        AlumnoDAO.delete(id);
    }

    private static void darDeAlta() {
        int id = AlumnoDAO.obtenerUltimoId();
        id = id + 1;
        System.out.println("Datos del alumno");
        System.out.println("================");
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Direccion: ");
        String dir = sc.nextLine();
        System.out.println("Telefono: ");
        String telefono = sc.nextLine();
        Alumno a = new Alumno(id,nombre,dir,telefono);
        AlumnoDAO.create(a);
    }
}
