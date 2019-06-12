package by.krava.etc.unit2.multi_array.t11_print_matrix;

/*
 *  Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран
 *  саму матрицу и номера строк, в которых число 5 встречается три и более раз.
 */

public class PrintMatrix {

    public static void main(String[] args) {
        int m, n; //размеры матрицы
        int count;
        int [][] matrix;

        m = 10;
        n = 20;

        //инициализация и заполнение матрицы рандомными значениями от 0 до 15
        matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
                System.out.printf("%2d  ", matrix[i][j]);
            }
            System.out.println();
        }

        //поиск строк, в которых число 5 встречается три и более раза
        System.out.println("\nСтроки, в которых число 5 встречается три и более раза: ");
        for (int i = 0; i < matrix.length; i++) {
            count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.printf("%d, ", i + 1);
            }
        }
        System.out.println("\b\b");
    }
}
