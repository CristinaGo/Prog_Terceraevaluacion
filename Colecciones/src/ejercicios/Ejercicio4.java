package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author cristina Gómez Campos
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        List<Integer> numerosPositivos = new ArrayList<>();
        List<Integer> numerosNegativos = new ArrayList<>();
        do {
            System.out.println("Introduce un número");
            num = sc.nextInt();
            if (num > 0) {
                numerosPositivos.add(num);
            }
            if(num < 0){
                numerosNegativos.add(num);
            }
        }while(num != 0);

        System.out.println("Mostramos las listas");
        System.out.println("Positivos");
        Iterator<Integer> itp = numerosPositivos.iterator();
        while(itp.hasNext()){
            System.out.print(itp.next() + " ");
        }

        System.out.println("\nNegativos");
        Iterator<Integer> itn = numerosNegativos.iterator();
        while(itn.hasNext()){
            System.out.print(itn.next() + " ");
        }
        itp = numerosPositivos.iterator();
        itn = numerosNegativos.iterator();

        List<Integer> sumaListas = new ArrayList<>();

       while(itn.hasNext() || itp.hasNext()){
            Integer nP = itp.next();
            Integer nN = itn.next();
            Integer suma = nP + nN;
            sumaListas.add(suma);
        }
       Iterator<Integer> itS = sumaListas.iterator();
        System.out.println("\nMostramos la lista sumada");
        while(itS.hasNext()){
            System.out.print(itS.next() + " ");
        }

        itp = numerosPositivos.iterator();
        itn = numerosNegativos.iterator();
        while(itp.hasNext()){
            Integer c = itp.next();
            if (c > 10 || c < -10) {
                itp.remove();
            }
        }
        while(itn.hasNext()){
            Integer c = itn.next();
            if (c > 10 || c < -10) {
                itn.remove();
            }
        }
        itp = numerosPositivos.iterator();
        itn = numerosNegativos.iterator();
        System.out.println("\nMostramos las listas eliminando > 10 y < -10 ");
        System.out.println("Positivos");
        while(itp.hasNext()){
            System.out.print(itp.next() + " ");
        }
        System.out.println("\nNegativos");
        while(itn.hasNext()){
            System.out.print(itn.next() + " ");
        }
    }
}
