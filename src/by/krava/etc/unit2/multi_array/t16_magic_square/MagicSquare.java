package by.krava.etc.unit2.multi_array.t16_magic_square;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Магическим квадратом порядка n называется квадратная матрица размера nxn,
 * составленная из чисел 1, 2, 3, ..., n^2. Построить магический квадрат
 * размером n*n.
 */

class MagicSquare {

    public static void main(String[] args) throws IOException {
        int [][] square;
        int n;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Задайте порядок магического квадрата: ");
        n = Integer.parseInt(reader.readLine());

        if ((n - 1) % 2 == 0) {
            square = oddMagicSquare(n);
        } else if (n % 4 == 0) {
            square = evenMagicSquare(n);
        } else {
            square = evenOddMagicSquare(n);
        }

        printMatrix(square);
    }

    private static int [][] oddMagicSquare (int n){
        int [][] square = new int[n][n];
        int i = 0;
        int j = (n - 1) / 2;
        square[i--][j++] = 1;
        for (int k = 2; k <= n * n; i--, j++, k++) {
            if (i < 0 && j > n - 1) {
                i += 2;
                j--;
            }
            if (i < 0) {
                i = n - 1;
            }
            if (j > n - 1) {
                j = 0;
            }
            if (square[i][j] != 0) {
                i += 2;
                j--;
            }
            square[i][j] = k;
        }
        return square;
    }

    //метод Рауз-Болла наоборот
    private static int [][] evenMagicSquare (int n){
        int [][] square = new int[n][n];
        int temp;
        int k = 1;

        //заполнение квадрата от 1 до n*n
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                square[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < n; i += 4 ) {
            for (int j = 1; j < n; j += 4) {
                    square[i][j] = n * n + 1 - square[i][j];
                    square[i + 3][j] = n * n + 1 - square[i + 3][j];
                    square[i][j + 1] = n * n + 1 - square[i][j + 1];
                    square[i + 3][j + 1] = n * n + 1 - square[i + 3][j + 1];
                }
        }
        for (int i = 1; i < n; i += 4 ) {
            for (int j = 0; j < n; j += 4) {
                square[i][j] = n * n + 1 - square[i][j];
                square[i + 1][j] = n * n + 1 - square[i + 1][j];
                square[i][j + 3] = n * n + 1 - square[i][j + 3];
                square[i + 1][j + 3] = n * n + 1 - square[i + 1][j + 3];
            }
        }
        return square;
    }

    //МЕТОД ОКАЙМЛЁННЫХ КВАДРАТОВ
    private static int [][] evenOddMagicSquare (int n){
        int [][] square = new int[n][n];
        int [][] squareT = evenMagicSquare(n - 2);
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                square[i][j] = squareT[i - 1][j - 1] + 2 * (n - 1);
            }
        }
        int m = n / 2;
        int d = n * n + 1;

        //заполняем углы
        square[0][0] = 3 * m - 1;
        square[0][n - 1] = 1;
        square[n - 1][0] = d - 1;
        square[n - 1][n - 1] = d - 3 * m + 1;

        //заполняем верхнюю строку
        int i, j;
        for (i = 1; i <= m - 2; i++) {
            square[0][i] = 2 * i + 1;
        }
        for (j = 1; j <= m; j++) {
            square[0][j + i - 1] = d - 2 * j;
        }

        //заполняем нижнюю строку
        for (j = 1; j < n - 1; j++) {
            square[n - 1][j] = n * n + 1 - square[0][j];
        }

        //заполняем левый столбец
        square[1][0] = 2 * m - 1;
        for (i = 1; i <= m / 2; i++) {
            square[i + 1][0] = 3 * m - 1 - i;
        }
        i--;
        for (j = 1; j <= m / 2 + 1; j++) {
            square[i + j + 1][0] = d - 4 * m + 1 + j;
        }
        j--;
        for (int q = 1; q <= m / 2 - 1; q++, i++){ //??
            square[i + j + q + 1][0] = 3 * m - 1 + q;
            square[i + j + q + 2][0] = d - 2 * m - q;
        }

        //заполняем правый столбец
        for (i = 1; i < n - 1; i++) {
            square[i][n - 1] = n * n + 1 - square[i][0];
        }

        return square;
    }

    private static void printMatrix (int [][] square) {  //вывод матрицы
        for (int[] array : square) {
            for (int element : array) {
                System.out.printf("%4d ", element);
            }
            System.out.println();
        }
    }
}