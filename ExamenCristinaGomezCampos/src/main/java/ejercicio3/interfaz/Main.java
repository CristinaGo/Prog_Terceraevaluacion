package ejercicio3.interfaz;

import ejercicio3.dao.VideojuegoDAO;
import ejercicio3.modelo.Videojuego;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Cristina Gómez Campos
 */

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Videojuego v1 = new Videojuego(1,"Evil Dead: The Game","PC","Accion","13-05-2022",39.95,true,50);
        Videojuego v2 = new Videojuego(2,"Trek to Yomi","PS5","Accion","15-05-2022",19.99,true,30);
        Videojuego v3 = new Videojuego(3,"King Arthur: Knight''s Tale","PC","Rol","26-04-2022",44.99,false,0);
        Videojuego v4 = new Videojuego(4,"Eiyuden Chronicles: Rising","PS5","Estrategia","10-05-2022",14.99,false,0);
        Videojuego v5 = new Videojuego(5,"Chaos Gate - Daemonhunters","PC","Rol","10-05-2022",14.99,true,10);


        List<Videojuego> vj = new ArrayList<>();
        vj.add(v1);
        vj.add(v2);
        vj.add(v3);
        vj.add(v4);


        int opción = 0;
        do {
            System.out.println("1. Cargar lista de videojuegos\n2. Mostrar lista de videojuegos\n3. Comprobar stock\n0. Salir");
            opción = sc.nextInt();
            switch (opción) {
                case 0:
                    break;
                case 1:
                    for (int i = 0; i < vj.size(); i++) {
                        VideojuegoDAO.create(vj.get(i));
                    }
                    break;
                case 2:
                    VideojuegoDAO.read();
                    break;
                case 3:
                    System.out.println("Id del videojuego a consultar");
                    int id = sc.nextInt();
                    sc.nextLine();
                    VideojuegoDAO.consultarStock(id);
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        }while (opción != 0);

    }


}
