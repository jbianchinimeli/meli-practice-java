package Clase3TT;

import Clase3TM.Interfaces.IPrecedable;
import Clase3TT.Interfaces.Sorter;

import java.util.Comparator;

public class BubbleSortSorterImple<T> implements Sorter<T> {
    @Override
    public void sort(T[] arr, Comparator<T> c) {
        bubbleSort(arr, c);
    }

    private static <T> void bubbleSort(T[] arr, Comparator<T> c){
        int n = arr.length;
        for(int i = 0; i< n-1; i++){
            for (int j = 0; j < n-i-1; j++)
                if (c.compare(arr[j], arr[j+1]) > 0)
                {
                    // swap arr[j+1] and arr[j]
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        }
    }

}
