package ejemplos.comparabl;

import java.time.LocalDate;

public class Socio implements Comparable{
    //atributos
    int id;
    String nombre;
    LocalDate fechaNacimiento;

    //constructor

    public Socio(int id, String nombre, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    //tostring()


    @Override
    public String toString() {
        return id + ". " + nombre + " (" + fechaNacimiento.getDayOfMonth() + "/" + fechaNacimiento.getMonthValue() +"/" + fechaNacimiento.getYear() + ")";
    }

    @Override
    public int compareTo(Object o) {
        Socio s = (Socio) o;
        if (this.id < s.id){
            return -1;
        } else if (this.id > s.id){
            return 1;
        } else {
            return 0;
        }
    }
}
