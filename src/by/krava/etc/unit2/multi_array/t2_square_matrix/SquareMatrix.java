package by.krava.etc.unit2.multi_array.t2_square_matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class SquareMatrix {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n; //размеры матрицы
        int [][] matrix;

        System.out.println("Введите размер данной матрицы n:");
        n = Integer.parseInt(rd.readLine());

        //инициализация и заполнение матрицы рандомными значениями от -100 до 100
        System.out.println("Данная квадратная матрица:");
        matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int sign = Math.random() < 0.5 ? -1 : 1;
                matrix[i][j] = (int) (Math.random() * 100) * sign;
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }

        //Вывод на экран элементов, стоящих на диагонали
        System.out.println("\nЭлементы первой диогонали:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.printf("%3d  ", matrix[i][j]);
                }
            }
        }
        System.out.println("\n\nЭлементы второй диогонали:");
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j == matrix.length - 1) {
                    System.out.printf("%3d  ", matrix[i][j]);
                }
            }
        }
    }
}
