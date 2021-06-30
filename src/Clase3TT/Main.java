package Clase3TT;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Integer[] arreglo = {4,2,6,33,5,8,66,7,5,56,43,3};

        System.out.println(Arrays.toString(arreglo));

        QuickSortSorterImple sorter = new QuickSortSorterImple();
        Comparator<Integer> comp = Integer::compareTo;
        sorter.sort(arreglo, comp);

        System.out.println(Arrays.toString(arreglo));
    }
}
