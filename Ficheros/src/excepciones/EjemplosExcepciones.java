package excepciones;

public class EjemplosExcepciones {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            //System.out.println(5/0);
            int[] array = new int[-5];
        } catch (ArithmeticException exception){
            System.out.println("Ha ocurrido un error");
            System.out.println(exception.getMessage());
            //exception.printStackTrace();
        } catch (Exception e){
            System.out.println("Excepción no aritmética: " + e.getMessage());
        } finally {
            System.out.println("FIN. Ha finalizado la tarea");
        }

    }
}
