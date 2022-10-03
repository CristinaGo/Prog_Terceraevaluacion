package filtrosLambda;

public class FiltroPersonaNombre implements FiltroPersona{
    private String nombre;

    public FiltroPersonaNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean test(Persona p) {
        return p.getNombre().equals(nombre);
    }
}
