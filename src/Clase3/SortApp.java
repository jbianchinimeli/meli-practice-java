package Clase3;

import java.util.Arrays;

public class SortApp {

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 35909103);
        Persona p2 = new Persona("Alan", 32456745);
        Persona p3 = new Persona("Brian", 37345321);

        Persona[] personas = {p1, p2, p3};

        Arrays.stream(personas).forEach(System.out::println);

        SortUtil.ordenar(personas);

        Arrays.stream(personas).forEach(System.out::println);
    }
}
