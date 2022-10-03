package ejercicios.ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        String cadena = "Abadejo, Abejaruco, Abeja, Abejorro, Águila, Alacrán, Antílope, Babuino, Bacalao, Ballena, Barracuda, Bisonte, Búho, Caballo, Cebra, Chimpancé, Ciervo, Conejo, Cotorra, Coyote, Delfín, Dromedario, Elefante, Erizo, Foca, Gacela, Golondrina, Guepardo, Halcón, Hiena, Hormiga, Hurón, Iguana, Jabalí, Jirafa, Kiwi, Koala, Lagarto, Lince, Lobo, Mapache, Medusa, Mosca, Murciélago, Nutria, Ñu, Oso, Oveja, Paloma, Pantera, Perezoso, Reno, Ruiseñor, Salamandra, Sapo, Serpiente, Tiburón, Tigre, Tortuga, Urraca, Vaca, Yak, Zorro";

        String[] animales = cadena.split(", ");
        //System.out.println(Arrays.toString(animales));
        //System.out.println(animales[15]);

        Arrays.stream(animales).forEach(animal -> System.out.print(animal + " "));
        System.out.println("\nIntroducir letra");
        Scanner sc = new Scanner(System.in);
        String letra = sc.next();
        System.out.println("\nAnimales que empiezan por " + letra);
        Arrays.stream(animales).filter(animal  -> animal.startsWith(letra)).forEach(animal -> System.out.print(animal + " "));
        System.out.println("\nNombre más largo");
        String animalNombreLargo = Arrays.stream(animales).max((a1,a2) -> a1.length() - a2.length()).get();
        System.out.println(animalNombreLargo);
        System.out.println("\nNombre más corto");
        String animalNombreCorto = Arrays.stream(animales).min((a1,a2) -> a1.length() - a2.length()).get();
        System.out.println(animalNombreCorto);

        long numero =  Arrays.stream(animales).count();
        System.out.println("Numero de animales " + numero);







    }


}
