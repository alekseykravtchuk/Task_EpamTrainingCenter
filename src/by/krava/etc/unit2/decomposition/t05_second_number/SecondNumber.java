package by.krava.etc.unit2.decomposition.t05_second_number;

/*
 * Составить программу, которая в массиве A[N] находит второе по величине число
 * (вывести на печать число, которое меньше максимального элемента массива, но
 * больше всех других элементов).
 */

public class SecondNumber {

    public static void main(String[] args) {
        int [] array = {-15, 23, 13, 15, 5, 12, -8, 17, 22, 8, 3, 6, 23};
        int secondNumber = findSecondNumber(array);
        System.out.println(secondNumber);
    }

    private static int findSecondNumber(int [] array) {
        quickSort(array, 0, array.length - 1);
        int second_i = array.length - 2;
        int secondN = array[second_i];
        while (secondN == array[second_i + 1]) {
            second_i--;
            secondN = array[second_i];
        }
        return secondN;
    }

    private static void quickSort(int[] array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = array[(leftMarker + rightMarker) / 2];
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (array[leftMarker] < pivot) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (array[rightMarker] > pivot) {
                rightMarker--;
            }
            // Проверим, не нужно ли обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    int tmp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quickSort(array, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(array, leftBorder, rightMarker);
        }
    }
}
