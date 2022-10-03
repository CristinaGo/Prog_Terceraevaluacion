package ejercicios.ejercicio4;

import java.util.function.Predicate;

import static java.lang.Character.isLetter;
import static java.lang.Character.isUpperCase;

public class MainPredicados {
    public static void main(String[] args) {
        Predicate<Integer> esMultiploDe5 = n -> n % 5 == 0;
        System.out.println("1. " + esMultiploDe5.test(15));

        Predicate<String> noTerminaEns = s -> !s.endsWith("s");
        System.out.println("2. " + noTerminaEns.test("Xocas"));
        System.out.println("3. " + noTerminaEns.test("Ibai"));

        Predicate<Integer> parYMultiploDe3 = n -> n % 2 == 0 && n % 3 == 0;
        System.out.println("4. " + parYMultiploDe3.test(6));

        Predicate<Character> letraMayuscula = c -> isLetter(c) && isUpperCase(c);
        System.out.println("5. " + letraMayuscula.test('C'));

        Predicate<Integer> imparYMultiploDe7 = n -> n % 2 != 0 && n % 7 == 0;
        System.out.println("6. " + imparYMultiploDe7.test(35));

        Predicate<Integer> imparOMultiploDe7 = n -> n % 2 != 0 || n % 7 == 0;
        System.out.println("7. " + imparOMultiploDe7.test(15));

    }
}
