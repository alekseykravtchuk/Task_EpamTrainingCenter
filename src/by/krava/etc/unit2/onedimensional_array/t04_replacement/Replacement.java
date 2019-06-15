package by.krava.etc.unit2.onedimensional_array.t04_replacement;

import java.util.Scanner;

/*
 * Даны действительные числа а1 ,а2 ,..., аn .
 * Поменять местами наибольший и наименьший элементы.
 */

public class Replacement {

    public static void main(String[] args) {
        int n, min, max;
        int [] array;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение \"n\":");
        n = Integer.parseInt(scanner.nextLine());
        array = new int[n];

        //заполнение массива и его вывод
        System.out.print("\nДанные числа: \n");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.printf("[%d] ", array[i]);
        }
        max = min = array[0];

        //поиск минимального и максимального значений
        for (int element : array) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }

        //меняем местами
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                array[i] = max;
            } else if (array[i] == max) {
                array[i] = min;
            }
        }

        //вывод итового массива
        System.out.printf("\nНовая последовательность: %n");
        for (int element : array) {
            System.out.printf("[%d] ", element);
        }
    }
}
