package by.krava.think_data_structures.sort;

import java.util.Arrays;

public class SelectionSort {

    /**
     * Swaps the elements at indexes i and j.
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Finds the index of the lowest value
     * between indices low and high (inclusive).
     */
    public static int indexLowest(int[] array, int start) {
        int lowIndex = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < array[lowIndex]) {
                lowIndex = i;
            }
        }
        return lowIndex;
    }

    /**
     * Sorts the cards (in place) using selection sort.
     */
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = indexLowest(array, i);
            swap(array, i, j);
        }
    }

    public static void main(String[] args) {
        int[] array = {11, 2, 5, 6, 1, 3, 1};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

}