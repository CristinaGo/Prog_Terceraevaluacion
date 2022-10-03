package AppUniversidad.modelo;

import AppUniversidad.dao.DepartamentoDAO;

public class Asignatura {
    private int id;
    private String nombre;
    private int horas;
    private double precio;
    private int departamento;

    public Asignatura(int id, String nombre, int horas, double precio, int departamento) {
        this.id = id;
        this.nombre = nombre;
        this.horas = horas;
        this.precio = precio;
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Asignatura: " + id + " - " + nombre + " - " + horas + " - " + precio + " - " + departamento;
    }
}
