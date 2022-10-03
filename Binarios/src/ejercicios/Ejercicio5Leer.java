package ejercicios;

import java.io.*;
import java.util.Scanner;

public class Ejercicio5Leer {
    public static void main(String[] args) {

       try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Binarios\\src\\ejercicios\\numeros.dat"))) {
            Scanner sc = new Scanner(System.in);
            int n = 0;
            do {
                n = sc.nextInt();
                if (n >= 0){
                    out.writeInt(n);
                }

            }while (n != -1);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Binarios\\src\\ejercicios\\numeros.dat"))) {

            int n = 0;
            while (true){
                n = in.readInt();
                System.out.print(n + " ");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e){
            System.out.println("Final del fichero");
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
