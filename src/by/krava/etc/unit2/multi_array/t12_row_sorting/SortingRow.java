package by.krava.etc.unit2.multi_array.t12_row_sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  Отсортировать строки матрицы по возрастанию и убыванию значений элементов
 */

public class SortingRow {
    private static int [][] matrix;
    private static int buf;
    private static boolean isSorted;

    public static void main(String[] args) throws IOException {
        matrix = randomMatrix();
        printMatrix(matrix);

        sortRowUp(matrix);
        System.out.println("\nМатрица с отсортированными строками по возрастанию:");
        printMatrix(matrix);

        sortRowDown(matrix);
        System.out.println("\nМатрица с отсортированными строками по убыванию:");
        printMatrix(matrix);
    }

    public static int [][] randomMatrix() throws IOException{
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

    public static void sortRowUp (int [][] matrix){ //сортировка строк матрицы по возрастанию
        for (int i = 0; i < matrix.length; i++) {
            isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    if (matrix[i][j] > matrix[i][j + 1]) {
                        isSorted = false;
                        buf = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = buf;
                    }
                }
            }
        }
    }

    public static void sortRowDown (int [][] matrix) {  //сортировка строк матрицы по убыванию
        for (int i = 0; i < matrix.length; i++) {
            isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    if (matrix[i][j] < matrix[i][j + 1]) {
                        isSorted = false;
                        buf = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = buf;
                    }
                }
            }
        }
    }

    public static void printMatrix (int [][] matrix) {  //вывод матрицы
        for (int[] array : matrix) {
            for (int element : array) {
                System.out.printf("%3d ", element);
            }
            System.out.println();
        }
    }

}
