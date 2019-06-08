package by.krava.etc.unit1.cycle.t2_function;

/*
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 * y = {x, x > 2 {-x, x <=2
 */

import java.util.Scanner;

public class Function {

    public static void main(String[] args) {
        double a, b, h;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значения \"a\", \"b\", \"h\"," +
                " каждое значение в новой строке:");
        a = Double.parseDouble(scanner.nextLine()); //начальное значение
        b = Double.parseDouble(scanner.nextLine());
        h = Double.parseDouble(scanner.nextLine());

        while (a <= b) {
            if (a <= 2) {
                System.out.println((float) -a);
            } else {
                System.out.println((float) a);
            }
            a += h;
        }
    }
}
