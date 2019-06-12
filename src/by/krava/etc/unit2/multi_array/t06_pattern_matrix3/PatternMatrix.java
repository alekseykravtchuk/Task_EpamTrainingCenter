package by.krava.etc.unit2.multi_array.t06_pattern_matrix3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *      1   1   1  ... 1   1   1
 *      0   1   1  ... 1   1   0
 *      0   0   1  ... 1   0   0
 *      .   .   .  ... .   .   .
 *      0   1   1  ... 1   1   0
 *      1   1   1  ... 1   1   1
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
                if ((j >= i && j + i < n ) || ( j <= i && j + i >= n - 1)) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
                System.out.printf("%2d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
