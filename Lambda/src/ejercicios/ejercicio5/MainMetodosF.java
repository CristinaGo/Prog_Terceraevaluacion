package ejercicios.ejercicio5;

public class MainMetodosF {
    public static void main(String[] args) {
        System.out.println("1. " + f1("Rosalía"));
        System.out.println("2. " + f2(4));
        System.out.println("3. " + f3(85));
    }

    static int f1(String s){

        return s.length();
    }

    static int f2(int n){
        return (int) Math.pow(n, 2);
    }

    static double f3(double n){
        return n * 10 / 100;
    }
}
