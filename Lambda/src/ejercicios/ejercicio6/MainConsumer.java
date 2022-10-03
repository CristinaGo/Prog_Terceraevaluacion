package ejercicios.ejercicio6;

import ejercicios.ejercicio2.Paciente;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainConsumer {
    public static void main(String[] args) {

        Consumer<String> saluda = nombre -> System.out.println(nombre);
        // con metodo de referencia
        Consumer<String> saluda2 = System.out::println;
        saluda2.accept("Don Pepito");

        Consumer<List<Paciente>> immprimirPacientes = lista -> {
            for (Paciente elemento: lista) {
                System.out.println(elemento);
            }
        };
        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente("Felipe R",54, new String[]{"náuseas", "mareos"}));
        pacientes.add(new Paciente("Irene M",32, new String[]{"tos", "cansancio", "mareos"}));
        pacientes.add(new Paciente("Carmen C",15, new String[]{"ansiedad"}));
        pacientes.add(new Paciente("Santiago A",8, new String[]{"fractura de cadera"}));
        pacientes.add(new Paciente("Isabel A",60, new String[]{"tos", "amnesia", "fiebre", "dolor"}));

        immprimirPacientes.accept(pacientes);
    }
}
