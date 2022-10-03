package ejercicios.correccion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int num = 0;
        do{
            System.out.println("numero");
            num = sc.nextInt();
            if (num >= 0){
                numeros.add(num);
            }
        }while (num >= 0);
        System.out.println(numeros);

        Iterator<Integer> it = numeros.iterator();

        int i = 0;

        while(it.hasNext()){
            num = it.next();
            if (num % 2 == 0){
                System.out.println("Indice " + i + " valor: " + num + " * 100= " + (num * 100));
            }
            i++;
        }
    }
}
