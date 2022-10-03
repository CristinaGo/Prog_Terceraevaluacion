package ejercicios;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(array));

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Binarios\\src\\ejercicios\\" + n + ".dat"))) {

            out.writeObject(array);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Error genérico");
        }
    }
}
