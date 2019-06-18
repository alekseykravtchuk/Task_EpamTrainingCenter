package by.krava.etc.unit2.sorting_array.t04_sort_by_exchange;

/*
 *  Сортировка обменами. Дана последовательность чисел (неубывающая). Требуется
 *  переставить числа в порядке возрастания. Для этого сравниваются два соседних
 *  числа a(i) и a(i + 1). Если a(i) > a(i + 1), то делается перестановка. Так
 *  продолжается до тех пор, пока все элементы не станут расположены в порядке
 *  возрастания. Составить алгоритм сортировки, подсчитывая при этом количество
 *  перестановок.
 */

public class SortByExchange {
    private static int countExchange;

    public static void main(String[] args) {
        int [] array = {12, 2, 13, 52, 22, 31, 32, 34, 14, 6, 21, 77, 92, 63, 42};

        sortByExchange(array);
        printArray(array);
        System.out.println("\nКоличество перестановок: " + countExchange);
    }

    private static void sortByExchange (int [] array) {
        int temp;
        countExchange = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    countExchange++;
                }
            }
        }
    }

    private static void printArray (int [] a) {
        for (int element : a) {
            System.out.printf("%d ", element);
        }
    }
}
