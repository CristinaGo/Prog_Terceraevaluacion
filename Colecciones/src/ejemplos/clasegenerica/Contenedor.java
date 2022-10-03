package ejemplos.clasegenerica;

public class Contenedor <T>{
    T objeto;

    public Contenedor() {
    }

    void setObjeto(T nuevo){
        this.objeto = nuevo;
    }
    T getObjeto(){
        return objeto;
    }

    T extraer(){
        T aux = objeto;
        this.objeto = null;
        return  aux;
    }
}
