package by.krava.etc.unit2.multi_array.t09_maximum_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  Задана матрица неотрицательных чисел.
 *  Посчитать сумму элементов в каждом столбце.
 *  Определить, какой столбец содержит максимальную сумму.
 */

public class MaximumSum {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n, m; //размер матрицы
        int maxColumn, maxSum, sum;
        int [][] matrix;

        System.out.println("Введите значения размера матрицы n и m:");
        n = Integer.parseInt(rd.readLine());
        m = Integer.parseInt(rd.readLine());

        //инициализация и заполнение матрицы рандомными значениями от 0 до 100
        System.out.println("Заданная матрица:");
        matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }

        //считаем сумму элементов в каждом столбце
        maxColumn = 1;
        maxSum = 0;
        sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
            System.out.printf("%nСумма элементов в столбце №%d: %d", j + 1, sum);
            if (sum > maxSum) {
                maxSum = sum;
                maxColumn = j + 1;
            }
            sum = 0;
        }

        System.out.printf("\n\nСтолбец №%d содержит максимальную сумму.", maxColumn);
    }
}
