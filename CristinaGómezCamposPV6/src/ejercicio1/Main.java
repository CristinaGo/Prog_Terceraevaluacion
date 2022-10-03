package ejercicio1;

/**
 * @author Cristina gómez campos
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String ruta = "CristinaGómezCamposPV6\\src\\ejercicio1\\clientes.dat";
    public static void main(String[] args) {
        Cliente c1 = new Cliente("C1","Pedro","653236589");
        Cliente c2 = new Cliente("C2","Marta","653236123");
        Cliente c3 = new Cliente("C3","Luis","653236789");
        ArrayList<Cliente> clientes = new ArrayList<>();


        int opcion = 0;
        do {
            System.out.println("1. Añadir nuevo cliente.\n2. Modificar datos.\n3. Dar de baja a un cliente.\n4. Listar los clientes.\n0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 0:
                    break;
                case 1:
                    int op = 0;
                    do{
                        System.out.println("¿Qué cliente quiere añadir?");
                        System.out.println("1.Pedro.\n2.Marta.\n3.Luis.\n0. Ninguno.");
                        op = sc.nextInt();
                        sc.nextLine();
                        switch (op){
                            case 0:
                                break;
                            case 1:
                                Ejercicio1.añadirCliente(c1,clientes);
                                break;
                            case 2:
                                Ejercicio1.añadirCliente(c2,clientes);
                                break;
                            case 3:
                                Ejercicio1.añadirCliente(c3,clientes);
                                break;
                        }
                    }while (op != 0);
                    break;
                case 2:
                    int opc = 0;
                    do{
                        System.out.println("¿Qué cliente quiere modificar?");
                        System.out.println("1.Pedro.\n2.Marta.\n3.Luis.\n0. Ninguno.");
                        opc = sc.nextInt();
                        sc.nextLine();
                        switch (opc){
                            case 0:
                                break;
                            case 1:
                                Ejercicio1.modificarDatos(c1,clientes);
                                break;
                            case 2:
                                Ejercicio1.modificarDatos(c2,clientes);
                                break;
                            case 3:
                                Ejercicio1.modificarDatos(c3,clientes);
                                break;
                        }
                    }while (opc != 0);
                    break;
                case 3:
                    int opci = 0;
                    do{
                        System.out.println("¿Qué cliente quiere eliminar?");
                        System.out.println("1.Pedro.\n2.Marta.\n3.Luis.\n0. Ninguno.");
                        opci = sc.nextInt();
                        sc.nextLine();
                        switch (opci){
                            case 0:
                                break;
                            case 1:
                                Ejercicio1.eliminarCliente(c1,clientes);
                                break;
                            case 2:
                                Ejercicio1.eliminarCliente(c2,clientes);
                                break;
                            case 3:
                                Ejercicio1.eliminarCliente(c3,clientes);
                                break;
                        }
                    }while (opci != 0);
                    break;
                case 4:
                    Ejercicio1.listarClientes();
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }while (opcion != 0);
    }



}
