package by.krava.etc.unit2.multi_array.t03_print_line;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class PrintLine {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int m, n; //размеры матрицы
        int [][] matrix;
        int k, p;

        System.out.println("Введите размер для данной матрицы m и n:");
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

        System.out.println("\nВведите номер строки k и номер столбца p для вывода:");
        k = Integer.parseInt(rd.readLine());
        p = Integer.parseInt(rd.readLine());

        //вывод k-й строки
        System.out.println("Строка № " + k + ":");
        for (int j = 0; j < matrix[k].length; j++) {
            System.out.printf("%d ", matrix[k - 1][j]);
        }

        //вывод p-го столбца
        System.out.printf("%n%nСтолбец № %d: %d%n", p, matrix[0][p - 1]);
        for (int i = 1; i < matrix.length; i++) {
            System.out.printf("%17d%n", matrix[i][p - 1]);
        }
    }
}
