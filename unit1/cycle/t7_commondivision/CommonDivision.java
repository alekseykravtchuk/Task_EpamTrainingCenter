package by.krava.etc.unit1.cycle.t7_commondivision;

import java.util.Scanner;

/*
 *  Для каждого натурального числа в промежутке от m до n вывести все
 *  делители, кроме единицы и самого числа. m и n вводятся с клавиатуры
 */

public class CommonDivision {

    public static void main(String[] args) {
        int m, n;
        boolean isDevision = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение \"m\" и \"n\":");
        m = scanner.nextInt();
        n = scanner.nextInt();

        for (int i = m; i <= n; i++) {
            System.out.print("Делители числа " + i + ": ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isDevision = true;
                    System.out.print(j + ", ");
                }
            }
            if (!isDevision) {
                System.out.print("отсутствуют, ");
            }
            isDevision = false;
            System.out.println("\b\b.");
        }
    }
}
