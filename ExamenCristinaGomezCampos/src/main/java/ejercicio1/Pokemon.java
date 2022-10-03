package ejercicio1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * @author Cristina Gómez Campos
 */


@XmlRootElement(name="pokemon")
public class Pokemon {
    private String codigo;
    private String generacion;
    private String nombre;
    private String[] tipos;

    public Pokemon() {
    }

    public Pokemon(String codigo, String generacion, String nombre, String[] tipos) {
        this.codigo = codigo;
        this.generacion = generacion;
        this.nombre = nombre;
        this.tipos = tipos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getGeneracion() {
        return generacion;
    }

    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @XmlElementWrapper(name="tipos")
    @XmlElement(name="tipo")
    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "codigo='" + codigo + '\'' +
                ", generacion='" + generacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipos=" + tipos +
                '}';
    }
}
