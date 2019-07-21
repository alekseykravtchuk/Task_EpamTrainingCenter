package by.krava.etc.unit2.multi_array.t16_magic_square;

import java.util.Scanner;

/*
 * Магическим квадратом порядка n называется квадратная матрица размера nxn,
 * составленная из чисел 1, 2, 3, ..., n^2. Построить магический квадрат
 * размером n*n.
 */

public class MagicSquareTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = in.nextInt();
        int [][] array = new int [n][n];
        int num = 1;

        for (int i = 0;i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = num;
                num++;
            }
        }

        int fact = 1;
        for (int i = 1; i <= Math.pow(n, 2); i++) {
            fact *= i;
        }
        for (int i = 0; i < fact; i++) {
            if (check(array)) {
                show(array);
                System.out.println();
            }
            replace(array);
        }
        in.close();

    }

    static int [][] replace(int[][] array) {
        return array;
    }

    static void show(int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean check(int [][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[0][i];
        }
        int buf = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                buf += array[i][j];
            }
            if (buf != sum) {
                return false;
            }
            buf = 0;
        }
        for (int i = 0; i < array.length; i++) {
            buf += array[i][i];
        }
        if (buf != sum) {
            return false;
        }
        buf = 0;
        for (int i = 0; i < array.length; i++) {
            buf += array[i][i];
        }
        if (buf != sum) {
            return false;
        }

        return true;
    }
}
