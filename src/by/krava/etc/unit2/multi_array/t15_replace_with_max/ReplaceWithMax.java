package by.krava.etc.unit2.multi_array.t15_replace_with_max;


/*
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplaceWithMax {
    private static int [][] matrix;
    private static int max;

    public static void main(String[] args) throws IOException{
        matrix = randomMatrix();
        max = findMax(matrix);
        replaceWithMax(matrix);
        printMatrix(matrix);
    }

    private static int [][] randomMatrix() throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int m, n; //размеры матрицы

        System.out.println("Введите размер матрицы m и n:");
        m = Integer.parseInt(rd.readLine());
        n = Integer.parseInt(rd.readLine());

        //инициализация и заполнение матрицы рандомными значениями от 0 до 100
        System.out.println("Данная матрица:");
        matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

    private static int findMax (int [][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int [] array : matrix) {
            for (int element : array) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    private static void replaceWithMax (int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = max;
                }
            }
        }
    }

    private static void printMatrix (int [][] matrix) {  //вывод матрицы
        for (int[] array : matrix) {
            for (int element : array) {
                System.out.printf("%3d ", element);
            }
            System.out.println();
        }
    }
}

