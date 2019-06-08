package by.krava.etc.unit1.cycle.t5_sequence;

/*
 *  Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
 *  модуль которых больше или равен заданному е. Общий член ряда имеет вид:
 *  a(n) = 1/2^n + 1/3^n
 */

import java.util.Scanner;

public class Sequence {

    public static void main(String[] args) {
        double sum = 0, e, a;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение \"e\":");
        e = Double.parseDouble(scanner.nextLine());

        for(int n = 1; n < 1000; n++) {
            a = 1 / (Math.pow(2, n)) + 1 / (Math.pow(3, n));
            if (a >= e) {
                sum += a;
            } else {
                break;
            }
        }
        System.out.println(sum);

    }
}
