package by.krava.etc.unit2.multi_array.t04_pattern_matrix1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *      1   2   3   ... n
 *      n  n-1 n-2  ... 1
 *      1   2   3   ... n
 *      n  n-1 n-2  ... 1
 *      .   .   .   ... .
 *      n  n-1 n-2  ... 1
 */

public class PatternMatrix {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n; //размеры матрицы
        int [][] matrix;

        System.out.println("Введите размер матрицы n (n-четное):");
        n = Integer.parseInt(rd.readLine());
        while (n % 2 != 0) {
            System.out.println("Введите размер матрицы n (n-четное):");
            n = Integer.parseInt(rd.readLine());
        }

        //инициализация и заполнение матрицы
        System.out.println("Полученная квадратная матрица:");
        matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = matrix.length - j;
                }
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
