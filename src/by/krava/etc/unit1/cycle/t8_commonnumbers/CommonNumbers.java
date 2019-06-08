package by.krava.etc.unit1.cycle.t8_commonnumbers;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class CommonNumbers {

    public static void main(String[] args) {
        int a, b, num, temp;
        ArrayList<Boolean> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(false);
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи два натуральных числа:");
        a = (int) scanner.nextLong(); //метод nextInt ограничен 10 цифрами
        b = (int) scanner.nextLong();

        while (a > 0) {
            num = a % 10;
            a /= 10;
            temp = b;
            while (temp > 0) {
                if (temp % 10 == num) {
                    list.set(num, true);
                    break;
                }
                temp /= 10;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (list.get(i))
                System.out.print(i + " ");

        }

    }
}
