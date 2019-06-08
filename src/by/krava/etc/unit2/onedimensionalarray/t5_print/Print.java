package by.krava.etc.unit2.onedimensionalarray.t5_print;

import java.util.Scanner;

/*
 * Даны целые числа а1 ,а2 ,..., аn.
 * Вывести на печать только те числа, для которых аi > i.
 */

public class Print {

    public static void main(String[] args) {
        int[] mas;
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите значение размера массива:%n");
        n = Integer.parseInt(scanner.nextLine());
        mas = new int[n];

        System.out.print("Данные числа: \n");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 99);
            System.out.printf("[%2d] ", mas[i]);
        }

        System.out.printf("%n%nРезультат: %n");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > i) {
                System.out.printf("[%2d] ", mas[i]);
            }
        }
    }
}
