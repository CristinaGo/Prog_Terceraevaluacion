package ejercicios.ejercicio1;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement(name = "estudiante")
@XmlType(propOrder = {"DNI", "nombre", "apellido", "curso","ciclo", "modulos"})
public class Estudiante {
   private String DNI;
   private String nombre;
   private String apellido;
   private int curso;
   private String ciclo;
   ArrayList<String> modulos = new ArrayList<>();

    public Estudiante() {
    }

    public Estudiante(String DNI, String nombre, String apellidos, int curso, String ciclo, ArrayList<String> modulos) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellidos;
        this.curso = curso;
        this.ciclo = ciclo;
        this.modulos = modulos;
    }
    //@XmlTransient para que no aparezca en el xml
    @XmlElement(name = "DNI", required = true) //es obligatorio
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlElement(name = "apellidos")
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCurso() {
        return curso;
    }
    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getCiclo() {
        return ciclo;
    }
    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    @XmlElementWrapper(name = "módulos")
    @XmlElement(name = "módulo")
    public ArrayList<String> getModulos() {
        return modulos;
    }
    public void setModulos(ArrayList<String> modulos) {
        this.modulos = modulos;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellido + '\'' +
                ", curso=" + curso +
                ", ciclo='" + ciclo + '\'' +
                ", modulos=" + modulos +
                '}';
    }
}
