package ejercicios.ejercicio5;

import java.util.function.Function;

public class MainFuction {
    public static void main(String[] args) {
        Function<String, Integer> f1 = s -> s.length();
        System.out.println("1. " + f1.apply("Rosalía"));

        Function<Integer,Integer> f2 = n -> (int) Math.pow(n,2);
        System.out.println("2. " + f2.apply(4));

        Function<Double,Double> f3 = n -> n * 10 / 100;
        System.out.println("3. " + f3.apply(85.0));
    }
}
