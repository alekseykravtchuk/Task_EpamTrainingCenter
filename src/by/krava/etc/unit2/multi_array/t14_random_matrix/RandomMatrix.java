package by.krava.etc.unit2.multi_array.t14_random_matrix;

/*
 *  Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
 *  причем в каждом столбце число единиц равно номеру столбца.
 */

public class RandomMatrix {

    private static int [][] matrix;


    public static void main(String[] args) {
        matrix = createRandomMatrix();
        fillMatrix(matrix);
        System.out.println("Полученная матрица: ");
        printMatrix(matrix);
    }


    private static int [][] createRandomMatrix() {
        int m, n; //размеры матрицы
        m = (int) (Math.random() * 30);
        n = (int) (Math.random() * 30);
        matrix = new int[m][n];

        return matrix;
    }


    private static void fillMatrix (int [][] matrix) {
        int count;
        for (int j = 0; j < matrix[0].length; j++) {
            count = j + 1;
            for (int i = 0; i < matrix.length; i++) {
                if (count > 0) {
                    matrix[i][j] = 1;
                    count--;
                } else {
                    matrix[i][j] = 0;
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
