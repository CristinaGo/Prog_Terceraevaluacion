import java.util.function.Supplier;

public class EjemploSuplier {
    public static void main(String[] args) {
        Supplier<Integer> numeroRamdom = () -> (int) (Math.random() * 100 +1);
        System.out.println(numeroRamdom.get());
    }
}
