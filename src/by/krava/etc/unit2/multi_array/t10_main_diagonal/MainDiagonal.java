package by.krava.etc.unit2.multi_array.t10_main_diagonal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class MainDiagonal {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n; //размеры матрицы
        int [][] matrix;

        System.out.println("Введите размер матрицы n:");
        n = Integer.parseInt(rd.readLine());

        //инициализация и заполнение матрицы
        System.out.println("Полученная квадратная матрица:");
        matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int sign = Math.random() < 0.5 ? -1 : 1;
                matrix[i][j] = (int) (Math.random() * 100) * sign;
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }

        //ищем положительные элементы главной матрицы
        System.out.println("\nПоложительные элементы главной матрицы: ");
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                System.out.printf("%d, ", matrix[i][i]);
            }
        }

    }
}
