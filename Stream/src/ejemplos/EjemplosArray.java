package ejemplos;

import java.util.Arrays;
import java.util.stream.Stream;

public class EjemplosArray {
    public static void main(String[] args) {
        String[] frutas = {"mora", "naranja", "níspero", "pera", "plátano", "pomelo", "sandía", "melón", "uva", "piña", "melocotón"};

        Stream<String> streamArray = Arrays.stream(frutas);
        streamArray.forEach(n -> System.out.print(n + " "));

        System.out.println("\nFiltrados");
        Arrays.stream(frutas).filter(n -> n.contains("a")).forEach(n -> System.out.print(n + " "));
    }
}
