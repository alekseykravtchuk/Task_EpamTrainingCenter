package by.krava.etc.unit2.onedimensional_array.t02_replacement;

import java.util.Scanner;

/*
 * Дана последовательность действительных чисел а1 ,а2 ,..., аn.
 * Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */

public class Replacement {

    public static void main(String[] args) {
        int count = 0;
        int z;
        int [] sequence = new int[50];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Дана последовательность:");
        for (int i = 0; i < 50; i++) {
            sequence[i] = (int) (Math.random() * 100);
            System.out.printf("%d ", sequence[i]);
        }

        System.out.println("\n\nВведите значение Z:");
        z = Integer.parseInt(scanner.nextLine());
        System.out.println("\nПолученная последовательность:");
        for (int i = 0; i < 50; i++) {
            if (sequence[i] > z) {
                count++;
                sequence[i] = z;
            }
            System.out.printf("%d ", sequence[i]);
        }

        System.out.println("\n\nКоличество замен: " + count);
    }
}
