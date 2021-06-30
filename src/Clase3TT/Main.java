package Clase3TT;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        quickSort();
        heapSort();
        bubbleSort();

    }

    private static void quickSort(){
        print("--------QUICK SORT----------");

        Integer[] enteros = {4,2,6,33,5,8,66,7,5,56,43,3};
        print(Arrays.toString(enteros));

        QuickSortSorterImple quickSorter = new QuickSortSorterImple();
//        Comparator<Integer> intComp = Integer::compareTo;
        quickSorter.sort(enteros, Comparator.comparingInt(Integer::intValue));

        print(Arrays.toString(enteros));

    }

    private static void heapSort(){
        print("----------HEAP SORT---------");

        String[] nombres = {"Juan", "Ana", "Pablo", "Natalia", "Ramon", "Alan", "Brian"};
        print(Arrays.toString(nombres));

        HeapSortSorterImple heapSorter = new HeapSortSorterImple();
//        Comparator<String> stringComp = String::compareTo;
        heapSorter.sort(nombres, Comparator.comparing(String::toString));

        print(Arrays.toString(nombres));

    }

    private static void bubbleSort(){
        print("--------BUBBLE SORT---------");

        Double[] doubles = {2.33, 2.45, 1.23, 4.566, 3.00302, 6.323, 23.232, 2.4355};
        print(Arrays.toString(doubles));

        BubbleSortSorterImple bubbleSorter = new BubbleSortSorterImple();
        bubbleSorter.sort(doubles, Comparator.comparing(Double::doubleValue));

        print(Arrays.toString(doubles));


    }

    private static void print(String text){
        System.out.println(text);
    }
}
