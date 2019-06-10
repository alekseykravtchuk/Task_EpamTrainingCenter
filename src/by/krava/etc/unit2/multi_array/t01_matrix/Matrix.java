package by.krava.etc.unit2.multi_array.t01_matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

public class Matrix {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int m, n; //размеры матрицы
        int [][] matrix;

        System.out.println("Введите размер данной матрицы m и n:");
        m = Integer.parseInt(rd.readLine());
        n = Integer.parseInt(rd.readLine());

        //инициализация и заполнение матрицы рандомными значениями от -100 до 100
        System.out.println("Данная матрица:");
        matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int sign = Math.random() < 0.5 ? -1 : 1;
                matrix[i][j] = (int) (Math.random() * 100) * sign;
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }

        //Вывод на экран нечетные столбцы, у которых первый элемент больше последнего
        System.out.println("\nСтолбцы, у которых первый элемент больше последнего:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j += 2) {
                if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                    System.out.printf("%3d   ", matrix[i][j]);
                }
            }
            System.out.println();
        }
    }
}
