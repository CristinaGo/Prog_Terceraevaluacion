public class Main {
    public static void main(String[] args) {
        //n -> n % 2 != 0; // 1 coge n y comprueba si n es par
        //(Character c) -> c == 'y'; // 2 recibe un caracter y comprueba si es 'y'
        //(x, y) -> x + y; // 3 recibe dos números y los suma
        //(int a, int b) -> a * a + b * b; // 4 recibe dos numeros y suma sus cuadrados
        //() -> 42 // 5 devuelve el número 42
        //() -> {return 3.14}; // 6 devuelve pi
        //(String s) -> { System.out.println(s); }; // 7 recibe un string y lo imprime
        //() -> { System.out.println("¡Hola mundo!"); }; // 8 imprime hola mundo

        //instanciamos la interfaz hola mundo
        // nos saltamos el paso de crear una clase que la implemente

        HolaMundo hm = new HolaMundo() {
            @Override
            public void imprimirHolaMundo() { //crea una clase anonima y obliga a desarrollar su metodo
                System.out.println("Hola, mundo");

            }
        };

        //así tenemos un "objeto". Para utlizarlo,
        hm.imprimirHolaMundo();

        /// vamos instaciarlo ahora con una expresion lambda

        HolaMundo hm2 = () -> System.out.println("Hola, mundo otra vez");
        hm2.imprimirHolaMundo();

        // ahora la expresión 4
        SumaCuadrados sc = (int a,int b) -> a * a + b * b;
        int r = sc.sumarCuadradod(4,3);
        System.out.println(r);
    }
}
