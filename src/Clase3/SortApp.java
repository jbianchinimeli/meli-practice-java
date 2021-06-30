package Clase3;

import java.util.Arrays;

public class SortApp {

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 35909103);
        Persona p2 = new Persona("Alan", 32456745);
        Persona p3 = new Persona("Brian", 37345321);

        Persona[] personas = {p1, p2, p3};

        System.out.println("--------Carga inicial-----------");
        Arrays.stream(personas).forEach(System.out::println);

        SortUtil.ordenar(personas);

        System.out.println("---------Ordenado-----------");
        Arrays.stream(personas).forEach(System.out::println);

        System.out.println("==============================");

        Celular c1 = new Celular(p1, 1123453879);
        Celular c2 = new Celular(p2, 1157609832);
        Celular c3 = new Celular(p3, 1134532889);

        Celular[] celulares = {c1, c2, c3};

        System.out.println("--------Carga inicial-----------");
        Arrays.stream(celulares).forEach(System.out::println);

        SortUtil.ordenar(celulares);

        System.out.println("---------Ordenado-----------");
        Arrays.stream(celulares).forEach(System.out::println);

    }
}
