package Clase1;

import java.util.Scanner;

public class Practice1NumericOperations {


    public static void ejercicio1() {
        /*
        Desarrollar un programa para mostrar los primeros n números pares, siendo n un valor
        que el usuario ingresará por consola.
        Recordá que un número es par cuando es divisible por 2.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n = scan.nextInt();
        System.out.println("Los primeros números pares son: ");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    public static void ejercicio2() {
        /*
        Desarrollar un programa para mostrar los primeros n múltiplos de m,
        siendo n y m valores que el usuario ingresará por consola.
        Recordá que un número a es múltiplo de b si a es divisible por b.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n = scan.nextInt();

        System.out.println("Ingrese otro numero");
        int m = scan.nextInt();

        System.out.println("Los primeros n mulriplos de m son:");
        int c = 0;
        int i = 1;
        while (c < n) {
            if (i % m == 0) {
                System.out.println(i);
                c++;
            }

            i++;
        }

    }

    public static void ejercicio3() {
        /*
        Desarrollar un programa para informar si un número n es primo o no,
        siendo n un valor que el usuario ingresará por consola.
        Recordá que un número es primo cuando sólo es divisible por sí mismo y por 1.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n = scan.nextInt();
        if (esPrimo(n)) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

    }

    public static boolean esPrimo(int numero) {
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (numero % x == 0)
                return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    }

    public static void ejercicio4() {
        /*
        Desarrollar un programa para mostrar por consola los primeros n
        números primos, siendo n un valor que el usuario ingresará por consola.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n = scan.nextInt();

        System.out.println("Los primeros n numeros primos son:");
        int c = 0;
        for(int i = 0; c<n; i++){
            if (esPrimo(i)) {
                System.out.println(i);
                c++;
            }

        }

    }

    public static void ejercicio5()
    {
        /*
        Desarrollar un programa para mostrar por consola los primeros n números naturales que tienen al menos
        m dígitos d, siendo n, m y d valores que el usuario ingresará por consola.
        Por ejemplo: si el usuario ingresa n=5, m=2 y d=3, el programa deberá mostrar por consola los primeros 5
        números naturales que tienen, al menos, 2 dígitos 3. En este caso la salida será: 33, 133, 233, 303, 313.
        Según cómo decidas encarar la solución de este ejercicio, es probable que necesites utilizar recursos que
        aún no hemos estudiado. El desafío consiste en googlear cómo utilizar dichos recursos y ¡utilizarlos!

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n = scan.nextInt();

        System.out.println("Ingrese un digito");
        int d = scan.nextInt();

        System.out.println("Ingrese una cantidad deseada");
        int m = scan.nextInt();

        System.out.println("Los primeros n numeros naturales con m cantidad de digitos d son:");
        int c = 0;
        for (int i = 0; c<n; i++) {
            if (tieneDigitos(i, m, d)) {
                System.out.println(i);
                c++;
            }
        }

    }

    public static boolean tieneDigitos(int numero, int m, int d){
        //Devuelve true si tiene al menos m digitos d
        //122334
        return contarCaracteres(String.valueOf(numero), String.valueOf(d)) == m;

    }

    //método para calcular el número de veces que se repite un carácter en un String
    public static int contarCaracteres(String cadena, String caracter) {
        int posicion, contador = 0;
        //se busca la primera vez que aparece
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) { //mientras se encuentre el caracter
            contador++;           //se cuenta
            //se sigue buscando a partir de la posición siguiente a la encontrada
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
    }

    public static void main(String[] args) {
        ejercicio5();

    }
}
