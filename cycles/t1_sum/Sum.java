package by.tasks.part1.cycles.t1_sum;

import java.util.Scanner;

/*
 * Напишите программу, где пользователь вводит любое целое положительное
 * число. А программа суммирует все числа от 1 до введенного
 * пользователем числа.
 */

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите любое целое положительное число:");
        num = Integer.parseInt(scanner.nextLine());
        for (int i = num; i > 0; i--) {
            sum += i;
        }

        System.out.printf("Сумма всех чисел от 1 до %d: %d%n", num, sum);
    }

}
