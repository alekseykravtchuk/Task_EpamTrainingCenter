package by.krava.etc.unit2.multi_array.t08_swab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы
 * одного столбца поставить на соответствующие им позиции другого, а его элементы
 * второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
 */

public class Swap {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n, m; //размер матрицы
        int a, b; //сменяемые столбцы
        int [][] matrix;
        int temp;

        System.out.println("Введите значения размера матрицы n и m:");
        n = Integer.parseInt(rd.readLine());
        m = Integer.parseInt(rd.readLine());

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

        System.out.println("\nВведите номера сменяемых столбцов:");
        a = Integer.parseInt(rd.readLine()) - 1;
        b = Integer.parseInt(rd.readLine()) - 1;

        //смена элементов столбцев a и b
        for (int i = 0; i < matrix.length; i++) {
            temp = matrix[i][a];
            matrix[i][a] = matrix[i][b];
            matrix[i][b] = temp;
        }

        //вывод новой матрицы
        for (int [] array : matrix) {
            for (int element : array) {
                 System.out.printf("%3d ", element);
            }
            System.out.println();
        }
    }
}
