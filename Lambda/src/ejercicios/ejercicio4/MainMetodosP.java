package ejercicios.ejercicio4;

import static java.lang.Character.isLetter;
import static java.lang.Character.isUpperCase;

public class MainMetodosP {
    public static void main(String[] args) {
        System.out.println("1. " + esMultiploDe5(15));
        System.out.println("2. " + noTerminaEns("Xocas"));
        System.out.println("3. " + noTerminaEns("Ibai"));
        System.out.println("4. " + parYMultiploDe3(6));
        System.out.println("5. " + letraMayuscula('C'));
        System.out.println("6. " + imparYMultiploDe7(35));
        System.out.println("7. " + imparOMultiploDe7(15));

    }

    static boolean esMultiploDe5(int n){
      /*  if(n % 5 == 0) {
            return true;
        } else {
            return false;
        }*/
        return n % 5 == 0;
    }

    static boolean noTerminaEns(String s){

        return !s.endsWith("s");
    }

    static boolean parYMultiploDe3(int n){

        return  n % 2 == 0 && n % 3 == 0;
    }

    static boolean letraMayuscula(char c){
        return isLetter(c) && isUpperCase(c);
    }

    static boolean imparYMultiploDe7(int n){
        return n % 2 != 0 && n % 7 == 0;
    }

    static boolean imparOMultiploDe7(int n){
        return n % 2 != 0 || n % 7 == 0;
    }
}
