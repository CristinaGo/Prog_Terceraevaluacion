package ejercicios.ejercicio2;

/**
 * @author Cristina Gómez Campos
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente("Felipe R",54, new String[]{"náuseas", "mareos"}));
        pacientes.add(new Paciente("Irene M",32, new String[]{"tos", "cansancio", "mareos"}));
        pacientes.add(new Paciente("Carmen C",15, new String[]{"ansiedad"}));
        pacientes.add(new Paciente("Santiago A",8, new String[]{"fractura de cadera"}));
        pacientes.add(new Paciente("Isabel A",60, new String[]{"tos", "amnesia", "fiebre", "dolor"}));

        ordenarPacientes(pacientes);

    }
    static void ordenarPacientes(List<Paciente> lista){
        System.out.println("Lista de pacientes");
        imprimir(lista);
        Scanner sc = new Scanner(System.in);
        int criterio;
        do {
            System.out.println("\n¿Por qué criterio quieres ordenar?(0 para salir) \n1.Nombre\n2.Edad\n3.Numero de sintomas");
            criterio = sc.nextInt();
            switch (criterio) {
                case 1:
                    lista.sort((Paciente p1, Paciente p2) -> p1.getNombre().compareTo(p2.getNombre()));
                    System.out.println("\nLista ordenada por nombre");
                    imprimir(lista);
                    break;
                case 2:
                    lista.sort((Paciente p1, Paciente p2) -> p1.getEdad() - p2.getEdad());
                    System.out.println("\nLista ordenada por edad");
                    imprimir(lista);
                    break;
                case 3:
                    lista.sort((Paciente p1, Paciente p2) -> p1.getSíntomas().length - p2.getSíntomas().length);
                    System.out.println("\nLista ordenada por número de sintomas");
                    imprimir(lista);
                    break;
            }
        }while(criterio != 0);

    }
    static void imprimir(List<Paciente> lista) {
        for (Paciente elemento: lista) {
            System.out.println(elemento);
        }
    }
}
