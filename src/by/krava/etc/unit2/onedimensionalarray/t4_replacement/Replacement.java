package by.krava.etc.unit2.onedimensionalarray.t4_replacement;

import java.util.Scanner;

/*
 * Даны действительные числа а1 ,а2 ,..., аn .
 * Поменять местами наибольший и наименьший элементы.
 */

public class Replacement {

    public static void main(String[] args) {
        int n, min, max;
        int mas [];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение \"n\":");
        n = Integer.parseInt(scanner.nextLine());
        mas = new int[n];

        //заполнение массива и его вывод
        System.out.print("\nДанные числа: \n");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
            System.out.printf("[%d] ", mas[i]);
        }
        max = min = mas[0];

        //поиск минимального и максимального значений
        for (int element : mas) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }

        //меняем местами
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == min) {
                mas[i] = max;
            } else if (mas[i] == max) {
                mas[i] = min;
            }
        }

        //вывод итового массива
        System.out.printf("\nНовая последовательность: %n");
        for (int element : mas) {
            System.out.printf("[%d] ", element);
        }
    }
}
