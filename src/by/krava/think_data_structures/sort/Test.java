package by.krava.think_data_structures.sort;

import java.util.Arrays;

public class Test {

    public static void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

    public static int indexLowest(int[] array, int start) {
        int lowIndex = start;
        for(int i = start; i < array.length; i++) {
            if(array[i] < array[lowIndex]) {
                lowIndex = i;
            }
        }
        return lowIndex;
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = indexLowest(array, i);
            swap(array, i, j);
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 8, 12, 5, 0, 8};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
