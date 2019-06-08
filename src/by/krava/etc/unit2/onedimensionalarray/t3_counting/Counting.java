package by.krava.etc.unit2.onedimensionalarray.t3_counting;

/*
 *  Дан массив действительных чисел, размерность которого N.
 *  Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */

import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        int n, mas [];
        int negative = 0;
        int zero = 0;
        int positive = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение размера массива N:");
        n = Integer.parseInt(scanner.nextLine());
        mas = new int[n];

        System.out.println("Элементы массива:");
        for (int i = 0; i < mas.length; i++) {
            int sigh = (Math.random() > 0.5) ? 1 : -1;
            mas[i] = (int) (Math.random() * 100 * sigh);
            System.out.printf("[%d] ", mas[i]);
        }

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0) {
                negative++;
            } else if (mas[i] == 0) {
                zero++;
            } else {
                positive++;
            }
        }

        System.out.println("\n\nКоличество отрицательных элементов: " + negative);
        System.out.println("Количество положительных элементов: " + positive);
        System.out.println("Количество нулевых элементов: " + zero);
    }
}
