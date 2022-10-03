package ejercicios.correccion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        List<Integer> positivos = new ArrayList<>();
        List<Integer> negativos = new ArrayList<>();
        int sumaPos = 0; int sumaNeg = 0;
        do{
            if (num > 0){
                positivos.add(num);
                sumaPos += num;
            } else if (num < 0){
                negativos.add(num);
                sumaNeg += num;
            }

        }while(num != 0);

        System.out.println("Positivos " + positivos + " suman" + sumaPos);
        System.out.println("Negativos " + negativos + " suman" + sumaNeg);

        Iterator<Integer> itPos = positivos.iterator();
        while(itPos.hasNext()){
            if (itPos.next() > 10){
                itPos.remove();
            }
        }
        System.out.println("Positivos < 10 " + positivos);
        Iterator<Integer> itNeg = negativos.iterator();
        while(itNeg.hasNext()){
            if (itNeg.next() < -10){
                itNeg.remove();
            }
        }
        System.out.println("Negativos > -10 " + negativos);



    }

}
