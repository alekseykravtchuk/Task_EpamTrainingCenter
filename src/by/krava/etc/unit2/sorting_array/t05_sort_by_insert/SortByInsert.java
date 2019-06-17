package by.krava.etc.unit2.sorting_array.t05_sort_by_insert;

/*
 *  Сортировка вставками. Дана последовательность чисел a1, a2, a3, ... an.
 *  Требуется переставить числа в порядке возрастания. Делается это следующим
 *  образом. Пусть a1, a2,..., ai - упорядоченная последовательность, т. е.
 *  a1 <= a2 <= ... <= ai. Берется следующее число a(i+1) и вставляется в после-
 *  довательность так, чтобы новая последовательность была тоже возрастающей.
 *  Процесс производится до тех пор, пока все элементы от i + 1 до n не будут
 *  перебраны. Примечание. Место помещения очередного элемента в отсортированную
 *  часть производить с помощью двоичного поиска. Двоичный поиск оформить в виде
 *  отдельной функции.
 */

public class SortByInsert {

    public static void main(String[] args) {
        int [] array = {2, 13, 3, 52, 22, 31, 32, 34, 14, 6, 21, 77, 92, 63, 42,
                32, 15, 18, 82, 1};

        sortByInsert(array);
        printArray(array);
    }

    private static void sortByInsert(int [] array) {
        int temp;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                 int j = bynSearch(array, i, array[i + 1]);
                for (int k = i + 1; k > j; k--) {
                    array[k] = array[k - 1];
                }
                array[j] = temp;
            }
        }
    }

    private static int bynSearch (int [] array, int lastIndex, int element) {
        int j = lastIndex;
        int firstIndex = 0;
        while (firstIndex <= lastIndex) {
            j = (firstIndex + lastIndex) / 2;
            if (array[j] == element) {
                return j;
            } else if (array[j] < element) {
                firstIndex = j + 1;
            } else if (array[j] > element && j != 0 && !(array[j - 1] < element)) {
                lastIndex = j - 1;
            } else {
                break;
            }
        }
        return j;
    }

    private static void printArray (int [] a) {
        for (int element : a) {
            System.out.printf("%d ", element);
        }
    }
}
