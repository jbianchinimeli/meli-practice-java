package Clase1;

import java.util.Scanner;

public class Practice2Introduction {

    public static void main(String[] args) {
//        ejercicio1();
//        ejercicio2();
//        ejercicio3();
        ejercicio4();
    }

    public static void ejercicio1(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        double n1 = (double) scan.nextDouble();
        System.out.println("Ingrese otro numero: ");
        double n2 = (double) scan.nextDouble();

        System.out.println("Suma: " + (n1 + n2));
        System.out.println("Resta: " + (n1 - n2));
        System.out.println("Multiplicacion: "+ (n1*n2));
        System.out.println("Division: " + (n2 == 0 ? 0: n1 / n2)) ;
    }

    public static void ejercicio2(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String name = scan.nextLine();
        System.out.println("Bienvenido " + name);
    }

    public static void ejercicio3(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo: ");
        double r = scan.nextDouble();

        double area = Math.pow(Math.PI*r, Math.PI*r);

        System.out.println("Area del circulo: " + area);

    }

    public static void ejercicio4(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        double n1 = (double) scan.nextDouble();

        System.out.println(n1 % 2 == 0 ? "Es divisible por 2 " : "No es divisible por 2");

    }



}
