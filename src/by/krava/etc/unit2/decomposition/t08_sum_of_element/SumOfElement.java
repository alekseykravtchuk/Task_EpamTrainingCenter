package by.krava.etc.unit2.decomposition.t08_sum_of_element;

/*
 * Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
 * массива с номерами от k до m.
 */

public class SumOfElement {

    private static int calculateSum (int [] array, int k) {
        int sum = 0;
        for (int i = k - 1; i < k + 2; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] arrayD = {-15, 23, 13, 15, 5, 12, -8, 17, 22, 8, 3, 6, 23};
        System.out.println(calculateSum(arrayD, 1));
        System.out.println(calculateSum(arrayD, 3));
        System.out.println(calculateSum(arrayD, 4));
    }
}
