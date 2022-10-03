package ejercicios.ejercicio7;

/**
 * @author Cristina Gómez Campos
 */
public class Académico implements Comparable{

    String nombre;
    int añoIngreso;

    public Académico(String nombre, int añoIngreso) {
        this.nombre = nombre;
        this.añoIngreso = añoIngreso;
    }

    @Override
    public int compareTo(Object o) {
        Académico a = (Académico) o;
        return this.nombre.compareTo(a.nombre);
    }

    @Override
    public String toString() {
        return "Académico: " + nombre +" (" + añoIngreso + ")";
    }
}
