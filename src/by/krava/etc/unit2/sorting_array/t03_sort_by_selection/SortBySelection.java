package by.krava.etc.unit2.sorting_array.t03_sort_by_selection;

/*
 * Сортировка выбором. Дана последовательность чисел (неубывающая). Требуется
 * переставить элементы так, чтобы они были расположены по убыванию. Для этого
 * в массиве, начиная с первого, выбирается наибольший элемент и ставится на
 * первое место, а первый - на место наибольшего. Затем, начиная со второго,
 * эта процедура повторяется. Написать алгоритм сортировки выбором.
 */

public class SortBySelection {

    public static void main(String[] args) {
        int [] array = {1, 2, 3, 12, 22, 31, 32, 34, 44, 56, 71, 77, 82, 82, 93};

        sortBySelection(array);
        printArray(array);
    }

    private static void sortBySelection (int [] array) {
        int maxJ;
        int temp;
        for (int i = 0; i < array.length; i++) {
            maxJ = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxJ]) {
                    maxJ = j;
                }
            }
            temp = array[i];
            array[i] = array[maxJ];
            array[maxJ] = temp;
        }
    }

    private static void printArray (int [] a) {
        for (int element : a) {
            System.out.printf("%d ", element);
        }
    }
}
