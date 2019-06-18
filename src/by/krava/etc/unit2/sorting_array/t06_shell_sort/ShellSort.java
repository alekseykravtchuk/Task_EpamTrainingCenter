package by.krava.etc.unit2.sorting_array.t06_shell_sort;

/*
 *  Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
 *  его по возрастанию. Делается это следующим образом: сравниваются два сосед-
 *  них элемента ai и a(i + 1). Если ai <= a(i + 1), то продвигаются на один
 *  элемент вперед. Если ai > a(i + 1), то производится перестановка и сдвигаю-
 *  тся на один элемент назад. Составить алгоритм этой сортировки.
 */

public class ShellSort {


    public static void main(String[] args) {
        int [] array = {2, 13, 3, 52, 22, 31, 32, 34, 14, 6, 21, 77, 92, 63, 42,
                32, 15, 18, 1, -100};

        sortShell(array);
        printArray(array);

    }

    private static void sortShell (int [] array) {
        int temp;
        int i = 1;
        while (i < array.length) {
            if (array[i - 1] > array[i]) {
                temp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = temp;
                if (i - 1 > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
    }

    private static void printArray (int [] a) {
        for (int element : a) {
            System.out.printf("%d ", element);
        }
    }
}
