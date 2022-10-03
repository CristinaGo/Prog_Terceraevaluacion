package ejercicios.ejercicio4;

import java.time.LocalDate;

/**
 * Ejercicio 4
 * @author Cristina Gómez Campos
 */

public class Cliente {

    String dni;
    String nombre;
    LocalDate fechaNac;

    public Cliente(String dni, String nombre, LocalDate fechaNac) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return dni + " " + nombre + " (" + fechaNac + ")";
    }
}
