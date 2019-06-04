package by.tasks.part1.branch.t2_maxmin;

import java.io.IOException;
import java.util.Scanner;

/*
 * Найти max{min(a, b), min(c, d)}.
 */

public class Maxmin {
    public static void main(String[] args) throws IOException {
        double a, b, c, d;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 4 числа через пробел");
        String [] line = scanner.nextLine().split(" ");
        a = Double.parseDouble(line[0]);
        b = Double.parseDouble(line[1]);
        c = Double.parseDouble(line[2]);
        d = Double.parseDouble(line[3]);
        System.out.println(max(min(a, b), min(c, d)) );
    }

    private static double min (double x, double y) {
        return x < y ? x : y;
    }

    private static double max (double x, double y) {
        return x > y ? x : y;
    }

}
