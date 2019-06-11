package by.krava.etc.unit2.multi_array.t07_rule_matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  Сформировать квадратную матрицу порядка N по правилу:
 *  A[I,J] = sin((I^2 - J^2) / N)
 *  и подсчитать количество положительных элементов в ней.
 */

public class RuleMatrix {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n; //размеры матрицы
        double [][] matrix;
        int count;

        System.out.println("Введите размер матрицы n:");
        n = Integer.parseInt(rd.readLine());

        //инициализация и заполнение матрицы
        System.out.println("Полученная квадратная матрица:");
        matrix = new double[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin((i * i - j * j) / n);
                System.out.printf("%10f",matrix[i][j]);
            }
            System.out.println();
        }

        //считаем количество положительных элементов
        count = 0;
        for (double [] array : matrix) {
            for (double element : array) {
                if (element > 0) {
                    count++;
                }
            }
        }

        System.out.printf("%nКоличество положительных элементов: %d", count);
    }
}
