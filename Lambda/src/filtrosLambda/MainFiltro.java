package filtrosLambda;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainFiltro {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Zacarias", "Zapatero", 33));
        personas.add(new Persona("Yeison", "Zapatero", 33));
        personas.add(new Persona("Yeison", "Ybarra", 25));
        personas.add(new Persona("Joseph", "Ybarra", 25));
        personas.add(new Persona("Maria", "Avia", 28));
        personas.add(new Persona("Michael", "Gutierrez", 28));
        personas.add(new Persona("Genara", "Daroca", 44));
        personas.add(new Persona("Genaro", "Valle", 44));
        personas.add(new Persona("Ana Maria", "Flores", 15));
        personas.add(new Persona("Eva", "Zapatero", 44));


        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre para filtrar");
        String nombre = sc.nextLine();

        FiltroPersonaNombre filtroPersonaNombre = new FiltroPersonaNombre(nombre);

        List<Persona> resultado = new ArrayList<Persona>();
        imprimir(resultado);
    }
    static void imprimir(List<Persona> lista) {
        for (Persona elemento: lista) {
            System.out.println(elemento);
        }
    }
    static List<Persona> buscaPorFiltro(FiltroPersona filtro, List<Persona>
            listaCompleta) {
        List<Persona> listaFiltrada = new ArrayList<Persona>();
        for (Persona elemento: listaCompleta) {
            if (filtro.test(elemento)) {
                listaFiltrada.add(elemento);
            }
        }
        return listaFiltrada;
    }
}
