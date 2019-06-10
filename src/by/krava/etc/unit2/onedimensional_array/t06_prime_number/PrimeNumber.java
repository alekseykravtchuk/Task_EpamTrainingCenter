package by.krava.etc.unit2.onedimensional_array.t06_prime_number;

import java.util.Scanner;

/*
 * Задана последовательность N вещественных чисел.
 * Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */

public class PrimeNumber {

    public static void main(String[] args) {
        int[] mas;
        int n;
        int sum = 0;
        boolean isPrime;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите значение размера массива:%n");
        n = Integer.parseInt(scanner.nextLine());
        mas = new int[n];

        System.out.print("Заданная последовательность чисел: \n");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
            System.out.printf("%d[%d]  ", i, mas[i]);
        }

        //поиск порядковых номеров, которые являются простыми числами
        //сумма соответствующих им значений
        for (int i = 2; i < mas.length; i++) {
            isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                sum += mas[i];
            }
        }

        System.out.println("\n\nСумма чисел: " + sum);
    }
}
