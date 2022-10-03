import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Cristina Gómez Campos
 */
@XmlRootElement
public class Animal {
    private String tipoAnimal;
    private String nombre;
    private int edad;
    List<String> pruebas = new ArrayList<>();
    List<Animal> crias = new ArrayList<>();

    public Animal() {
    }

    public Animal(String tipoAnimal, String nombre, int edad, List<String> pruebas, List<Animal> crias) {
        this.tipoAnimal = tipoAnimal;
        this.nombre = nombre;
        this.edad = edad;
        this.pruebas = pruebas;
        this.crias = crias;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public List<String> getPruebas() {
        return pruebas;
    }

    public void setPruebas(List<String> pruebas) {
        this.pruebas = pruebas;
    }

    public List<Animal> getCrias() {
        return crias;
    }

    public void setCrias(List<Animal> crias) {
        this.crias = crias;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "tipoAnimal='" + tipoAnimal + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", pruebas=" + pruebas +
                ", crias=" + crias +
                '}';
    }
}
